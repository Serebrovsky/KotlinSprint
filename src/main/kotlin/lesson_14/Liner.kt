package lesson_14

open class Liner(
    var speed: Int = 50,
    var passengers: Int = 3000,

    ) {
    open fun print() {
        println("Скорость лайнера: $speed, пассажиров: $passengers")
    }
}