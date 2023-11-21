package lesson_14

class CargoShip(
    val capacity: Int = 10000,
): Liner(speed = 25) {
    override fun print() {
        println("Скорость грузового: $speed, пассажиров: $passengers, грузоподъемность: $capacity")
    }
}