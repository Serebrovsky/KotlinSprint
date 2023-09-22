package lesson_11

/*Задача 4 к Уроку 11

Создай сущность Contact на основании скриншота из телефонной книги и определи поля и методы для экрана.
- Для свойств, описывающих иконки, использовать строки с релевантными названиями файлов.
- В блоке с контактами в нижней части скриншота – прикрепленные контакты близких людей.
- После проектирования создай объект класса Contact с данными из скриншота.*/
fun main() {
    val contact1 = Contact(isHomeTelephone = false, mobilePhone = "89999994242")
    val contact2 = Contact(isHomeTelephone = true, homeTelephone = "89998884242")
    val contact3 = Contact(title = "iCloud", eMail = "mail@mail.ru")
    val contact4 = Contact(title = "жена", userName = "Ольга")
    val contact5 = Contact(title = "Подруга", userName = "Кристина")
    val contact6 = Contact(title = "Подруга", userName = "Лена")

    println("Выгрузка всех контактов:")
    contact1.contactOutput()
    contact2.contactOutput()

    println("Выгрузка c email:")
    contact3.emailOutput()

    println("Выгрузка близких людей:")
    contact4.closeOutput()
    contact5.closeOutput()
    contact6.closeOutput()

    println(contact1)
}

class Contact(
    val title: String? = null,
    val userName: String? = null,
    val eMail: String? = null,
    val isHomeTelephone: Boolean = true,
    var homeTelephone: String? = null,
    var mobilePhone: String? = null,
) {
    fun contactOutput() {
        when (isHomeTelephone) {
            true -> {
                println("Домашний телефон: $homeTelephone")
            }

            false -> {
                println("Мобильный телефон: $mobilePhone")
            }
        }
    }

    fun emailOutput() {
        println("$userName, $eMail")

    }

    fun closeOutput() {
        println("$title, $userName")

    }
}
