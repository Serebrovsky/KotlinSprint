package lesson_15

/*Задача 3 к Уроку 15

На форуме есть два типа пользователей – обычные пользователи и администраторы.
Пользователи могут читать форум и писать сообщения. Администраторы дополнительно могут удалять сообщения
и пользователей.

Опиши классы для сущностей пользователей и администраторов, используя абстрактный класс.
У абстрактного класса должны быть соответствующие общие поля и методы. Действия на форуме
отобрази сообщениями в консоль.*/

// Абстрактный класс для пользователей на форуме
abstract class ForumUser(val username: String, val role: String) {

    // Общий метод для чтения форума
    open fun readForum() {
        println("$username читает форум")
    }

    // Общий метод для отправки сообщений на форум
    open fun postMessage(message: String) {
        println("$username пишет сообщение: $message")
    }

    // Абстрактный метод, который будут реализовывать подклассы
    abstract fun performForumAction()

}

// Класс для обычных пользователей
class RegularUser(username: String) : ForumUser(username, "Обычный пользователь") {

    // Реализация абстрактного метода для обычных пользователей
    override fun performForumAction() {
        readForum()
        postMessage("Привет, форум!")
    }
}

// Класс для администраторов
class Administrator(username: String) : ForumUser(username, "Администратор") {

    // Реализация абстрактного метода для администраторов
    override fun performForumAction() {
        readForum()
        postMessage("Привет, форум! Я администратор.")
        deleteMessage()
        deleteUser()
    }

    // Дополнительный метод для удаления сообщения
    fun deleteMessage() {
        println("$username удаляет сообщение")
    }

    // Дополнительный метод для удаления пользователя
    fun deleteUser() {
        println("$username удаляет пользователя")
    }
}

fun main() {
    // Пример использования
    val regularUser = RegularUser("ОбычныйПользователь")
    regularUser.performForumAction()

    val admin = Administrator("Администратор1")
    admin.performForumAction()
}