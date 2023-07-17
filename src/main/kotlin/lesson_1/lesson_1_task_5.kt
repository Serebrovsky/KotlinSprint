package lesson_1

fun main() {

    //Количество секунд, которые Гагарин провел в космосе:
    val sumGag: Int = 32850//сек
    val hour: Int = sumGag / 3600 //9часов
    val hour1: Int = hour * 3600 //секунд в 9 часах

    val ost = sumGag - hour1

    val ost1 = ost/60 //7мин
    val ost2 = ost1 * 60 //420сек
    val ost3 = sumGag - hour1 - ost2 //30 сек
    println("0$hour:0$ost1:$ost3")


}