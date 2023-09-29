package lesson_12

/*Задача 4 к Уроку 12
Измени программу таким образом, чтобы информация о погоде выводилась в консоль сразу при создании объекта.*/

fun main() {
    val weatherDay1 = WeatherDay_(20, 25, 755)
    val weatherDay2 = WeatherDay_(25, 22, 753, true)
    val weatherDay3 = WeatherDay_(27, 22, 753)


}

class WeatherDay_(val tempNight: Int, val tempDay: Int, val pressure: Int) {
    var isRain = false

    init {
        println("Температура днем: $tempDay, температура ночью: $tempNight, дождь: $isRain, давление $pressure")
    }

    constructor(
        tempNight: Int,
        tempDay: Int,
        pressure: Int,
        isRain: Boolean
    ) : this(tempNight, tempDay, pressure) {
        this.isRain = isRain
    }



  //  fun printWeather() {
    //    println("Температура днем: $tempDay, температура ночью: $tempNight, дождь: $isRain, давление $pressure")
   // }
}