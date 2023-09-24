package lesson_11

/*Задача 4 к Уроку 11

Создай сущность Contact на основании скриншота из телефонной книги и определи поля и методы для экрана.
- Для свойств, описывающих иконки, использовать строки с релевантными названиями файлов.
- В блоке с контактами в нижней части скриншота – прикрепленные контакты близких людей.
- После проектирования создай объект класса Contact с данными из скриншота.*/
fun main() {



    val contact1 = Contact(mobilePhone = "89999994242")
    val contact2 = Contact(homeTelephone = "89998884242")
    val contact3 = Contact(name = "ICloud", eMail = "mail@mail.ru")
    val contact4 = Contact(favoriteContact = FavoriteContact("жена"))

}

class Contact(
    val name: String? = null,
    val secondName: String? = null,
    var homeTelephone: String? = null,
    var mobilePhone: String? = null,
    val eMail: String? = null,
    var favoriteContact: List<FavoriteContact>? =null //не могу понять логику зачем внутри класса Contact
    // создавать список из объектов класса FavoriteContact..и не понял что понимается под "чтобы эти
    // контакты группировались, так как их на экране несколько".
    // Почему тогда не создать отдельно класс FavoriteContact и создавать объекты из него?
    // Прошу прощения плохо чувствую контекст...((
) {
    fun callUp (){ println("Звоню") }
    fun sendSms(){ println("Отправляю смс") }
    fun sendVideo(){ println("Отправляю видео") }
    fun sendPost(){ println("Отправляю почту") }

}
class FavoriteContact(
    var whoIs: String,
)
