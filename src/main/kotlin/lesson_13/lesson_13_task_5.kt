package lesson_13
/*Задача 5* к Уроку 13
Скопируй класс из предыдущей задачи (без логики заполнения телефонной книги) и измени его название
для избегания конфликтов.
Для получения номера программа считывает ввод пользователя с типом String по умолчанию.
Приведи строку к типу Long. Если пользователь ввел что-либо, кроме цифр — программа падает.
Необходимо воспроизвести ошибку и вывести ее название в консоль.*/

fun main() {

    val name = readln()
    val number = readln().toLongOrNull()
    if (number == null) {
        println("Ошибка! Вы не ввели номер телефона!")
    }

    val company = readln()

    val contact1 = Contacttttt(name, number, company)
    contact1.printContact()

}


class Contacttttt(
    var name: String,
    var number: Long?,
    var company: String? = null,
) {

    fun printContact() {
        println("Имя: $name, номер телефона: $number, компания: ${company ?: "<не указано>"}")
    }


}