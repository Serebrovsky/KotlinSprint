package lesson_5

import java.util.*


/*Для алгоритма улучшенного приложения-лотереи, нужно угадать два числа от 1 до 100.
Если угадать только одно – игрок получает утешительный приз.

Напиши программу, проверяющую выигрыш. Пользователь должен вводить числа в консоль.
Выйгрышные числа должны меняться при каждом запуске (то есть не должны быть проинициализированы заранее,
как в задаче 3).

Точно также надо оформить ввод чисел подсказками, в конце распечатать выйгрышные числа.*/

fun main() {
    val random = Random()
    val randomNumber1 = random.nextInt(1, 101)
    val randomNumber2 = random.nextInt(1, 101)

    println("Введите построчно два числа от 1 до 100:")

    val editNumber1 = readLine()?.toInt()
    val editNumber2 = readLine()?.toInt()


    if ((editNumber1 == randomNumber1) || (editNumber2 == randomNumber1) &&
        (editNumber1 == randomNumber2) || (editNumber2 == randomNumber2)
    ) {
        println("Вы выиграли главный приз!")
    } else if ((editNumber1 == randomNumber1) || (editNumber2 == randomNumber1) || (editNumber1 == randomNumber2) ||
        (editNumber2 == randomNumber2)) println("Вы выиграли утешительный приз!")
    else println("Вы не выиграли ничего!")

    println("Выигрышными числами были: $randomNumber1 и $randomNumber2")
}