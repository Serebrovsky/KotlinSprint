package lesson_14
/*Задача 2 к Уроку 14
Скопируй классы из предыдущей задачи и измени их названия для избегания конфликтов.
Каждый тип корабля обладает уникальным способом погрузки:
- лайнер выдвигает горизонтальный трап со шкафута;
- грузовой корабль активирует погрузочный кран;
- ледокол открывает ворота со стороны кормы.
Реализуй методы погрузки, специфичные для каждого вида корабля.
Добавь метод вывода информации о свойствах корабля и выведи информацию в консоль.*/
fun main() {
    val liner1 = Liner1()
    liner1.unload()
    liner1.printInformation()

    val iceBreaker1 = IceBreaker1()
    iceBreaker1.unload()
    iceBreaker1.printInformation()

    val cargoShip1 = CargoShip1()
    cargoShip1.unload()
    cargoShip1.printInformation()
}

open class Liner1(

    var speed: Int = 50,
    var passengers: Int = 3000,

    ) {
    open fun printInformation() {
        println("Скорость лайнера: $speed, пассажиров: $passengers")
    }

    open fun unload() {
        println("Выдвижение горизонтального трапа со шкафута")
    }
}

class IceBreaker1(
    val isCrushIce1: Boolean = true
) : Liner1(speed = 25, passengers = 500) {

    override fun printInformation() {
        println("Скорость ледокола: $speed, пассажиров: $passengers, колоть лед: $isCrushIce1")
    }

    override fun unload() {
        println("Открываю ворота со стороны кормы")
    }
}


class CargoShip1(
    val capacity: Int = 10000,
) : Liner1(speed = 25) {
    override fun printInformation() {
        println("Скорость грузового: $speed, пассажиров: $passengers, грузоподъемность: $capacity")
    }

    override fun unload() {
        println("Активирую погрузочный кран")
    }
}

