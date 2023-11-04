package lesson_13

/*Задача 2 к Уроку 13

Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
На его основе создай экземпляр. Для поля с названием компании значение по умолчанию должно быть null.
Дополни класс методом, который будет печатать информацию о контакте сообщением в одном println()
и без использования многострочного ввода такого типа (пример):
- Имя: Ростислав
- Номер: 89123456789
- Компания: Reddit
Вместо null значения, в консоль должна выводиться строка <не указано>.*/

fun main() {
    val contact1 = Contact1("Ростислав", "89123456789", "Reddit")
    contact1.printContact()


}

class Contact1(
    var name: String,
    var number: String,
    var company: String?,
) {
    constructor(
        name: String,
        number: String,
    ) : this(name, number, null)

    fun printContact() {
        println(
            """
            |- Имя: $name
            |- Номер: $number
            |- Компания: $company""".trimMargin()
        )
    }


}