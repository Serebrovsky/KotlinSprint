package lesson_5


fun main() {
    println("Введите имя пользователя:")
    var yourName = readln()
    val yourPassword: String

    if (yourName == LOGIN) {
        println("Введите Ваш пароль:")
        yourPassword = readln()
        if (yourPassword == PASSWORD) println("Добро пожаловать в систему!")
        else println("Пароль неверный! Доступ запрещен!")
    } else {
        println("Вам необходимо зарегистрироваться! Введите свои логин и пароль:")
        yourName = readln()
        yourPassword = readln()
        println("Вы успешно зарегестрированы, логин: $yourName, пароль: $yourPassword")
    }
}

const val LOGIN = "Zaphod"
const val PASSWORD = "PanGalactic"