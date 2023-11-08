package lesson_13

/*Задача 4 к Уроку 13
Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

Программа должна заполнять контакты в телефонную книгу (отдельный список объектов),
пока пользователь не напишет “стоп” (игнорируй регистр).
- если пользователь не ввел номер телефона, то нужно уведомить об этом пользователя и
такая запись не должна добавляться;
- для приведения введенного номера к числу используй toLongOrNull();
- при записи поля с компанией предлагай пользователю пропуск заполнения, нажав Enter;
- если пользователь не заполнил компанию, то в объект записывать null.
Выведи созданные объекты в консоль методом класса.*/
fun main() {

    val contacts = mutableListOf<Contacttt>()
    var stop = "стоп"
    do {

        var i = 0

        contacts.add(i, Contacttt("", 0))

        println("Введите Ваше имя:")
        contacts[i].name = readln()

        println("Введите Ваш номер телефона:")
        contacts[i].number = readln().toLongOrNull()

        if (contacts[i].number == null) {
            println("Вы не ввели номер телефона! Данная запись не будет сохранена!")
            continue
        }
        println("Введите название Вашей компании")
        contacts[i].company = readln()

        println("Наберите \"Стоп\" для завершения или Enter для продолжения:")
        stop = readln().toLowerCase()
        i++
    } while (stop != "стоп")
    contacts.forEach { it.printContact() }

}

class Contacttt(
    var name: String,
    var number: Long?,
    var company: String? = null,
) {

    fun printContact() {
        println("Имя: $name, номер телефона: $number, компания: ${company ?: "<не указано>"}")
    }

}