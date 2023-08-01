package lesson_5

/*Нужно написать часть модуля для авторизации пользователя. Для входа в приложение пользователь
должен доказать, что он не бот. Для этого программа предлагает решить простой математический пример –
сложить два числа (сообщить об этом пользователю).

Имитируй эти действия в консоли, путем считывания данных с клавиатуры. При успешном решении вход
в программу символизируется сообщением “Добро пожаловать!". В противном случае вывести сообщение
"Доступ запрещен."*/

fun main() {

    println("Для входа в приложение напишите результат сложения ниже 7+8=?")
    val check = readln().toInt()

    if (check == 15) println("Добро пожаловать!")
    else println("Доступ запрещен!")
}