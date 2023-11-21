package lesson_14

class IceBreaker(
    val isCrushIce: Boolean = true
) : Liner(speed = 25, passengers = 500) {

    override fun print(){
        println("Скорость ледокола: $speed, пассажиров: $passengers, колоть лед: $isCrushIce")
    }
}