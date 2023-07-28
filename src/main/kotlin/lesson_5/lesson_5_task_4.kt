package lesson_5


fun main() {
    println("Введите имя пользователя:")
    var login = readLine()

    if (login == LOGIN) {
        println("Введите Ваш пароль:")
        val password = readLine()
        if (password == PASSWORD) println("Добро пожаловать в систему!")
        else println("Пароль неверный! Доступ запрещен!")
    } else {
        println("Вам необходимо зарегистрироваться! Введите свои логин и пароль:")
        login = readLine()
        val password1 = readLine()
        println("Вы успешно зарегестрированы, логин: $login, пароль: $password1")
    }
}

const val LOGIN = "Zaphod"
const val PASSWORD = "PanGalactic"