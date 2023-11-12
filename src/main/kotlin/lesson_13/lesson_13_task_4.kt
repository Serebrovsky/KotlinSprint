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

    do {
        println("Введите Ваше имя:")
        val name = readln()

        println("Введите Ваш номер телефона:")
        val number = readln().toLongOrNull()

        println("Введите название Вашей компании или нажмите Enter")
        var company: String? = readln()
        if (company == "") {
            company = null
        }


        if (number != null) {
            contacts.add(Contacttt(name, number, company))
        } else println("Запись не сохранена, так как не был введен номер телефона!")


        println("Наберите \"Стоп\" для завершения или Enter для продолжения:")
        val stop = readln().toLowerCase()
    } while (stop != STOP)

    contacts.forEach { it.printContact() }

}
const val STOP = "стоп"

class Contacttt(
    var name: String,
    var number: Long?,
    var company: String? = null,
) {

    fun printContact() {
        println("Имя: $name, номер телефона: $number, компания: ${company ?: "<не указано>"}")
    }

}