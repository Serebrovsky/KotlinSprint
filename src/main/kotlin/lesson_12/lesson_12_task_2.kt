package lesson_12

/*Задача 2 к Уроку 12
Измени класс из прошлого задания (скопируй в файл с новым уроком и новым названием класса для избежания
конфликтов). Используй первичный конструктор, затем так же создай 3 объекта и выведи информацию о них.
Поля должны быть объявлены и проинициализированы в теле класса.*/

fun main() {
    val weather1 = WeatherDay(30, 35, false, 730)
    val weather2 = WeatherDay(28, 29, true, 745)

    weather1.printWeather()
    weather2.printWeather()


}

class WeatherDay(_tempNight: Int, _tempDay: Int, _isRain: Boolean, _pressure: Int) {
    var tempNight = _tempNight
    var tempDay = _tempDay
    var isRain = _isRain
    var pressure = _pressure

    fun printWeather() {
        println("Температура днем: $tempDay, температура ночью: $tempNight, дождь: $isRain, давление $pressure")
    }
}