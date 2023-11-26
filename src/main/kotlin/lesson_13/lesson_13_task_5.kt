package lesson_13

import java.lang.NumberFormatException

/*Задача 5* к Уроку 13
Скопируй класс из предыдущей задачи (без логики заполнения телефонной книги) и измени его название
для избегания конфликтов.
Для получения номера программа считывает ввод пользователя с типом String по умолчанию.
Приведи строку к типу Long. Если пользователь ввел что-либо, кроме цифр — программа падает.
Необходимо воспроизвести ошибку и вывести ее название в консоль.*/

fun main() {
    println("Введите имя:")
    val name = readln()

    println("Введите номер телефона:")
    val number = readln()

    println("Введите название компании:")
    val company = readln()

    val contact1 = Contacttttt(name, number, company)
    contact1.printContact()

}


class Contacttttt(
    var name: String,
    numberString: String,
    var company: String? = null,
) {
    var numberLong: Long? = null

    init {
        try {
            numberLong = numberString.toLong()

        } catch (e: NumberFormatException) {
            println("Ошибка! Вы не ввели номер телефона!")

        }
    }

    fun printContact() {
        println("Имя: $name, номер телефона: ${numberLong?:"<не указано>"}, компания: ${company ?: "<не указано>"}")
    }


}