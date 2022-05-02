package keno.ToyKotlin.sample

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SampleTest(
    @Autowired var sampleService: SampleService,
    @Autowired var sampleRepository: SampleRepository
) {

    @Test
    fun sampleTest1() {
        var sample: Sample = Sample("keno")
        sampleRepository.save(sample)
        var id: Long? = sample.id
        id?.let {
            sampleService.weirdUpdate(it, "wacko")
            var findSample: Sample? = sampleRepository.findOne(id)
            println(findSample?.name)
        }
    }
}