package lesson_12

/*Задача 3 к Уроку 12
Усовершенствуй класс для погоды, который был разработан в предыдущих задачах (создай в файле нового
урока такой же класс с измененным названием).

Перепиши его, используя сокращенную запись (без полей внутри тела класса). Переменной, хранящей
информацию о дожде, установи значение по умолчанию. Информацию о погоде по дням выведи в консоль
отдельным методом класса.*/
fun main() {
    val weatherDay1 = WeatherDay_(20, 25, 755)
    val weatherDay2 = WeatherDay_(25, 22, 753, true)
    val weatherDay3 = WeatherDay_(27, 22, 753)

    weatherDay1.printWeather()
    weatherDay2.printWeather()
    weatherDay3.printWeather()

}

class WeatherDay_(val tempNight: Int, val tempDay: Int, val pressure: Int) {
    var isRain = false

    constructor(
        tempNight: Int,
        tempDay: Int,
        pressure: Int,
        isRain: Boolean
    ) : this(tempNight, tempDay, pressure) {
        this.isRain = isRain
    }


    fun printWeather() {
        println("Температура днем: $tempDay, температура ночью: $tempNight, дождь: $isRain, давление $pressure")
    }
}