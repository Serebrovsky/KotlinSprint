package lesson_15

/*Задача 1 к Уроку 15
В мобильной игре есть разные существа. Напиши интерфейсы для летающих и плавающих существ.
- создай интерфейсы с методами передвижения для: карась, чайка, утка;
- создай для каждого существа классы, реализующие соответствующие интерфейсы;
- выведи сообщения в консоль, о том как они могут передвигаться.*/

fun main() {
    val carp1 = Carp()

    println("Карп:")
    carp1.swim()

    val gull1 = Gull()

    println("Гусь:")
    gull1.fly()
    gull1.swim()

    println("Утка:")
    val duck1 = Duck()
    duck1.fly()
    duck1.swim()


}

interface Flying {
    fun fly() {
    }
}

interface Swimming {
    fun swim() {
    }
}

class Carp : Swimming
class Gull : Flying, Swimming
class Duck : Flying, Swimming