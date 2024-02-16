package lesson_17

/*Задача 4 к Уроку 17
Каждый раз, когда посылка прибывает в промежуточный пункт обработки, в программе меняется её местоположение.
Опиши класс посылки с такими вводными:
- свойства класса хранят: поле с номером посылки и поле с текущим местоположением;
- поле класса хранит счетчик перемещений, обновляющийся при перезаписи местоположения.
Сымитировать прибытие посылки в новый пункт обработки, протестировать изменение счетчика.
При реализации использовать сеттер.*/

class Package(val number: Int, location: String) {

    var location: String = location
        set(value) {
            movementCounter++
            field = value
        }
    var movementCounter: Int = 0
}

fun main() {
    val package1 = Package(1, "Мытищи")

    package1.location = "Москва"
    package1.location = "Киров"
    package1.location = "Семикаракорск"

    println( package1.movementCounter)
}