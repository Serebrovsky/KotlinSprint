package lesson_1

fun main() {

    //Количество секунд, которые Гагарин провел в космосе:
    val totalSeconds: Int = 32850//сек

    val hour = totalSeconds / 3600 //целые часы
    val min = (totalSeconds % 3600) / 60 //остаток в минутах
    val sec = (totalSeconds % 3600) % 60 //остаток в секундах

    val time = String.format("%02d:%02d:%02d", hour, min, sec)
    println(time)
}