package lesson_5

/*Для алгоритма простого приложения-лотереи, нужно угадать два числа от 1 до 100.
Если угадать только одно – игрок получает утешительный приз. Напиши программу, проверяющую выигрыш.

Пользователь должен вводить числа в консоль. Правильные числа заранее известны и хранятся
 в переменных. Оформить ввод текстовыми аннотациями о том, что нужно вводить.
 Вывести отдельным сообщением, какие числа были нужны для победы.

– Если оба числа угаданы вывести “Поздравляем! Вы выиграли главный приз!”
– Если угадано только одно число, вывести “Вы выиграли утешительный приз!”
– Если не угадано ничего, вывести “Неудача! Крутите барабан!*/

fun main() {
    println("Введите построчно 2 числа от 1 до 100")
    val number1 = readLine()?.toInt()
    val number2 = readLine()?.toInt()

    if ((number1 == RIGHT_NUMBER_1 || number2 == RIGHT_NUMBER_1) &&
        (number1 == RIGHT_NUMBER_2 || number2 == RIGHT_NUMBER_2)
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((number1 == RIGHT_NUMBER_1 || number2 == RIGHT_NUMBER_1) ||
        (number1 == RIGHT_NUMBER_2 || number2 == RIGHT_NUMBER_2)
    ) {
        println("Вы выиграли утешительный приз!")
    } else println("Неудача! Крутите барабан!")
}

const val RIGHT_NUMBER_1 = 7
const val RIGHT_NUMBER_2 = 65