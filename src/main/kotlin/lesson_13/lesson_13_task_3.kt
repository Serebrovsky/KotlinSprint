package lesson_13

/*Задача 3 к Уроку 13
Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
Для того, чтобы взаимодействовать со всеми записями телефонной книги, как с одним целым,
их нужно объединить в список.
- создай и инициализируй (одновременно) список с 5 объектами класса-контакта;
- 2 контакта должны принимать null для поля компании;!!!
- 1 контакт должен иметь название компании “null”;
- выведи список всех существующих компаний, которые есть в телефонной книге.*/

fun main() {
    val array = listOf<Contactt>(
        Contactt("Вова", "89152095507", "ВНИИАЭС"),
        Contactt("Вика", "89152072435", "ВНИИНМ"),
        Contactt("Леха", "89788778997"),
        Contactt("Сережа", "8923565456"),
        Contactt("Всеволод", "89266415345", "null")
    )
    array.forEach { println(it.company) }
}

class Contactt(
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