package keno.ToyKotlin.lectures.lecture1

class WeatherKotlin {
    private val temperature = 0
    private val description: String? = null
    private val color: Color? = null
    fun updateWeather(degrees: Int) {
        val description: String
        val color: Color
        if (degrees < 10) {
            description = "cold"
            color = Color.BLUE
        } else if (degrees < 25) {
            description = "mild"
            color = Color.ORANGE
        } else {
            description = "hot"
            color = Color.RED
        }
    }

    fun updateWeather2(degrees: Int) {
        val (description: String, color: Color) =
            if (degrees < 10) {
                Pair("cold", Color.BLUE)
            } else if (degrees < 25) {
                Pair("mild", Color.ORANGE)
            } else {
                Pair("hot", Color.RED)
            }
    }

    fun updateWeather3(degrees: Int) {
        val (description: String, color: Color) = when {
            degrees < 10 -> "cold" to Color.BLUE
            degrees < 25 -> "mild" to Color.ORANGE
            else -> "hot" to Color.RED
        }
    }

    internal enum class Color {
        BLUE, ORANGE, RED
    }
}

