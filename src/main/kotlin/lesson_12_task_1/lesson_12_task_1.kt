package lesson_12_task_1
/*Задача 1 к Уроку 12
Создай класс для программы, отслеживающей погоду. Объекты класса будут хранить температуру днем и ночью,
был ли дождь, атмосферное давление. В этом задании нужно использовать пустой конструктор.
Создай два объекта, присвой им произвольные данные и выведи в консоль одним методом созданного класса.
– в классе создай переменные и проинициализируй их какими-нибудь значениями;
– затем в объектах подставь другие значения этим переменным.*/
fun main() {
    val weather1 = Weather()
    weather1.tempDay = 25
    weather1.tempNight = 20
    weather1.pressure = 780

    val weather2 = Weather()
    weather2.tempDay = 29
    weather2.tempNight = 20
    weather2.isRain = true
    weather2.pressure = 730

    weather1.printWeather()
    weather2.printWeather()

}

class Weather {
    var tempNight: Int = 18
    var tempDay: Int = 25
    var isRain: Boolean = false
    var pressure: Int = 745

    fun printWeather() {
        println("Температура днем: $tempDay, температура ночью: $tempNight, дождь: $isRain, давление $pressure")
    }
}