package lesson_11

fun main() {
    val forum = Forum_()

    for (i in 0..1) {
        println("==Регистрация нового пользователя==")
        println("Введите Ваш логин:")
        val login = readln()

        println("Введите Ваш пароль:")
        val password = readln()

        println("Введите Ваш e-mail:")
        val email = readln()

        forum.createNewUser(login, password, email)

    }


    for (id in 0..1) {
        println("==ЧАТ==")
        println("Автор с логином ${forum.registeredUsers[id].login} напишите Ваше сообщение:")
        val massage = readln()
        forum.createNewMessage(id, massage)

    }
    forum.printThread()

}

class Forum_ {
    var id = 0
    val registeredUsers = mutableListOf<User_>()
    val massagesOfUsers = mutableListOf<String>()

    fun createNewUser(login: String, password: String, email: String): MutableList<User_> {
        registeredUsers.add(User_(id, login, password, email))

        println(
            "Создан автор c ID №${registeredUsers[id].id}, логином:${registeredUsers[id].login}, " +
                    "паролем:${registeredUsers[id].password}, почтой: ${registeredUsers[id].email}"
        )
        id++
        return registeredUsers
    }

    fun createNewMessage(id: Int, massage: String): MutableList<String> {
        massagesOfUsers.add("Автор: ${registeredUsers[id].login}, сообщение: $massage")
        println(massagesOfUsers[id])
        return massagesOfUsers
    }

    fun printThread() {
        println("==Все сообщения из чата==")
        println(massagesOfUsers.forEach { println(it) })
    }


}

class User_(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
)
