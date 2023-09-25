package lesson_11

/*Задача 4 к Уроку 11

Создай сущность Contact на основании скриншота из телефонной книги и определи поля и методы для экрана.
- Для свойств, описывающих иконки, использовать строки с релевантными названиями файлов.
- В блоке с контактами в нижней части скриншота – прикрепленные контакты близких людей.
- После проектирования создай объект класса Contact с данными из скриншота.*/
fun main() {

    //После проектирования создай объект класса Contact с данными из скриншота:
    val contact1 = Contact(id = 1, mobilePhone = "89999994242")
}

class Contact(
    val id: Int,
    val name: String? = null,
    val secondName: String? = null,
    var homeTelephone: String? = null,
    var mobilePhone: String? = null,
    val eMail: String? = null,
    var favoriteContacts: List<FavoriteContact>? =null
) {
    fun callUp (){ println("Звоню") }
    fun sendSms(){ println("Отправляю смс") }
    fun sendVideo(){ println("Отправляю видео") }
    fun sendPost(){ println("Отправляю почту") }

}
class FavoriteContact(
    var id: Int,
    var avatar: Int? = null,
    var name: String? = null,
)
