package lesson_11

/*Задача 1 к Уроку 11
Создай класс, который будет хранить данные пользователя. В свойствах должна храниться информация об уникальном
идентификаторе, логине, пароле и почте. Названием может быть, например, User. Создай два экземпляра класса
с произвольными данными и выведи их в консоль.*/
fun main() {
    val user1 = User(1, "Vladimir", "df7rd", "nymphetamine2006@yandex.ru")
    val user2 = User(2, "Ivan", "uhjk", "ivan.shamarin@yandex.ru")

    println("Данные по пользователю №${user1.id}:")
    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)

    println("Данные по пользователю №${user2.id}:")
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)