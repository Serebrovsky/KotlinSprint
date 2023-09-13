package lesson_10

/*Задача 1 к Уроку 10

Напиши небольшую игру, в которой пользователь и компьютер по очереди бросают кости.
Побеждает выбросивший наибольшее число.
– поочередно выводи сообщение о ходе игрока и компьютера (отображать кто бросил, какие значения на кубиках);
– бросок костей вынеси в отдельную функцию, в которой генерируются 2 случайных числа от 1 до 6;
– в отдельные переменные сохрани результат работы функции для игрока и компьютера;
– после сравнения результатов, выведи соответствующее сообщение в консоль.
Например: "Победило человечество" или "Победила машина".*/

fun main() {

    val human = dropBones()
    println("Бросил человек! Выпало: $human")

    val computer = dropBones()
    println("Бросил компьютер! Выпало: $computer")

    if (human > computer) {
        println("Победило человечество!")
    } else println("Победили машины!")
}

fun dropBones(): Int {
    val value = (1..6).random()
    return value
}