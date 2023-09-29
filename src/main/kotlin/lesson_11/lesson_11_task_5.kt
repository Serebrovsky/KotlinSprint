package lesson_11

/*Задача 5* к Уроку 11
Реализовать класс работы форума (Forum), использующий созданные классы пользователей из 1 и 2 задачи.
Примени паттерн “Фабрика”:
– напрямую объекты не создаются. Пользователи добавляются на форум методом createNewUser() класса Forum;
– сообщения добавляются на форум методом createNewMessage(authorId: Int, ...) класса Forum;
– id-шники новых объектов, а также подстановка авторов для сообщений реализована внутри класса Forum;
– у класса Forum реализуй метод printThread(), печатающий в консоль последовательно сообщения добавленные
ранее в формате:
автор: сообщение
автор: сообщение
В функции main() создай экземпляр Forum и продемонстрируй его работу, добавив двух пользователей и по два
сообщения от каждого пользователя.*/
fun main (){
    val forum = Forum()
    val registeredUsers = mutableListOf<User>()
    val massagesOfUsers = mutableListOf<String>()
    var arrayPrintMassage = mutableListOf<String>()
    var id =0

    do {
        val users = forum.createNewUser(id, registeredUsers)
        println("Создан автор c ID №${users[id].id}, логином:${users[id].login}, " +
                "паролем:${users[id].password}, почтой: ${users[id].email}")

        arrayPrintMassage = forum.createNewMessage(id, users, massagesOfUsers)
        id++
        println("Добавить нового пользователся с сообщением:")
        val isAdd = readln().toBoolean()
    }while (isAdd)
    forum.printThread(arrayPrintMassage)
}

class Forum() {
    fun createNewUser(id: Int, users: MutableList<User>): MutableList<User> {

        println("Введите Ваш логин:")
        val login = readln()

        println("Введите Ваш пароль:")
        val password = readln()

        println("Введите Ваш e-mail:")
        val email = readln()

        users.add(User(id, login, password, email))
        return users
    }

    fun createNewMessage(id: Int, users: MutableList<User>, massages: MutableList<String>): MutableList<String> {
        println("Автор c ID№$id напишите Ваше сообщение:")
        val massage = readln()
        massages.add("Автор: ${users[id].id}, сообщение: $massage")
        return massages
    }

    fun printThread(arrayMassage: MutableList<String>) {
        println(arrayMassage.forEach{ println(it) })
    }
}

class User(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
)
