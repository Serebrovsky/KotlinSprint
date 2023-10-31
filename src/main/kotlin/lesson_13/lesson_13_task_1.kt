package lesson_13

/*Задача 1 к Уроку 13
Для программы телефонного справочника создай класс, который будет хранить имя, номер телефона и поле company.
 Номер телефона – целочисленное значение. Нужно учесть ситуацию, что поле с компанией может оставаться
 незаполненным. Поля не должны иметь никакой инициализации по умолчанию.*/

fun main() {
    val contact1 = Contact("Владимир", "89152095507")
    println(contact1.name)
    println(contact1.number)

    val contact2 = Contact("Вика", "89164052714","ВНИИНМ")
    println(contact2.name)
    println(contact2.number)
    println(contact2.company)

}

class Contact(
    var name: String,
    var number: String,
    var company: String?,
    ){


    constructor(
         name: String,
         number: String,
    ) :this(name, number, null)
}