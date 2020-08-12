package create.builder.car

/**
 * @author Ting
 * @date 2020/8/7
 * @description
 */
class Car(val band: String, val year: Int) {

    private constructor(build: Builder) : this(build.band, build.year)

    class Builder {
        var band: String = ""
        var year: Int = -1

        fun build() = Car(this)
    }

    companion object {
        inline fun build(block: Builder.() -> Unit) = Builder().apply(block).build()
    }

    override fun toString(): String {
        return "Car(band='$band', year=$year)"
    }
}

fun main() {
    val car = Car.build {
        band = "BWM"
        year = 2017
    }
    val car2=Car.Builder().apply {
        band = "BWM"
        year = 2017
    }.build()

    println(car.toString())
    println(car2.toString())
}