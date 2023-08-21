package lesson_6

/*Создай простой таймер, который запрашивает у пользователя количество секунд, которые нужно засечь.
По истечении заданного времени, выведется сообщение в консоли: “Прошло N секунд”. Где N – количество секунд,
введенных пользователем.*/


fun main() {
    println("Введите количество секунда, которое нужно засечь:")
    val sec: Int = readln().toInt()
    val secLong: Long = (sec * 1000).toLong()

    Thread.sleep(secLong)
    println("Прошло $sec секунд")
}