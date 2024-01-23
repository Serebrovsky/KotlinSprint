package lesson_15

/*Задача 2 к Уроку 15

Необходимо разработать простую систему мониторинга погодных условий, которая будет собирать данные о
 температуре и количестве осадков.
Создай абстрактный класс WeatherStationStats. Он будет служить родителем для классов-объектов погодных
 данных: Temperature и PrecipitationAmount.
Реализуй логику имитации отправки сообщения на сервер в классе WeatherServer. Метод отправки сообщения
должен определять тип переданного сообщения и в зависимости от результата передавать соответствующие данные.
Создай по одному объекту для разных типов погодных данных и протестируй работу программы.*/

// Абстрактный класс для хранения погодных данных
abstract class WeatherStationStats

// Класс для температуры
class Temperature(val value: Double) : WeatherStationStats()

// Класс для количества осадков
class PrecipitationAmount(val value: Double) : WeatherStationStats()

// Класс для сервера мониторинга погоды
class WeatherServer {
    fun sendMessage(weatherData: WeatherStationStats) {
        when (weatherData) {
            is Temperature -> sendTemperatureData(weatherData.value)
            is PrecipitationAmount -> sendPrecipitationData(weatherData.value)
            else -> println("Ошибка! Неправильный тип данных!")
        }
    }

    fun sendTemperatureData(temperature: Double) {
        // Логика отправки данных о температуре на сервер
        println("Отправленные данные по температуре: $temperature градусов по Цельсию")
    }

    fun sendPrecipitationData(precipitation: Double) {
        // Логика отправки данных о количестве осадков на сервер
        println("Отправленные данные по количеству осадков: $precipitation мм")
    }
}

fun main() {
    // Создание объектов с погодными данными
    val temperatureData = Temperature(25.5)
    val precipitationData = PrecipitationAmount(10.2)

    // Создание объекта сервера
    val weatherServer = WeatherServer()

    // Тестирование отправки сообщений
    weatherServer.sendMessage(temperatureData)
    weatherServer.sendMessage(precipitationData)
}