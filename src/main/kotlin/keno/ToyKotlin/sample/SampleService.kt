package keno.ToyKotlin.sample

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

fun <Sample, Long> JpaRepository<Sample, Long>.findOne(id: Long): Sample? = findById(id).orElse(null)

@Service
class SampleService (
    val sampleRepository: SampleRepository
) {

    @Transactional(readOnly = true)
    fun update(id: Long, name: String) {
        var sample: Sample? = sampleRepository.findOne(id)
        sample?.updateName(name)
        sample?.let {sampleRepository.save(sample)}
    }

    @Transactional
    fun weirdUpdate(id: Long, name: String) {
        update(id, name)
    }
}