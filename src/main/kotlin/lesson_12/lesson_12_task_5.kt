package lesson_12

/*Задача 5* к Уроку 12
Продолжи усовершенствовать программу, теперь она должна рассчитывать средние значения температур и давления,
и считать количество дождливых дней. Представь, что данные ты получаешь от датчиков и сымитируй их поведение
 с помощью random.
– в функции main() создай список и добавь в него с помощью цикла 10 объектов класса, передав в конструкторы
случайные значения;
– для расчета среднего значения температуры создай переменные;
– пройдись циклом по элементам созданного списка и вычисли средние значения температур, а также количество
дождливых дней
–  выведи результаты в консоль. На выходе должны получиться средние значения по температуре днем, ночью
и по среднему атмосферному давлению.*/


fun main() {
    val days = mutableListOf<WeatherDay__>()
    val arrayTempNight = mutableListOf<Int>()
    val arrayTempDay = mutableListOf<Int>()
    val arrayPressure = mutableListOf<Int>()
    var sumRainDay = 0

    for (i in 0..(AMOUNT_OF_DAYS - 1)) {
        val tempNight = (15..25).random()
        val tempDay = (20..30).random()
        val pressure = (720..760).random()
        val isRain = listOf(true, false).random()
        days.add(WeatherDay__(tempNight, tempDay, pressure, isRain))
    }
    for (i in 0..(AMOUNT_OF_DAYS - 1)) {
        arrayTempNight.add(days[i].tempNight)
        arrayTempDay.add(days[i].tempDay)
        arrayPressure.add(days[i].pressure)
        if (days[i].isRain) {
            sumRainDay++
        }
    }
    println("Средняя температура ночью: ${arrayTempNight.average()}")
    println("Средняя температура днем: ${arrayTempDay.average()}")
    println("Среднее давление: ${arrayPressure.average()}")
    println("Количество дождливых дней: $sumRainDay")
}

class WeatherDay__(var tempNight: Int, var tempDay: Int, var pressure: Int) {
    var isRain = false

    constructor(
        tempNight: Int,
        tempDay: Int,
        pressure: Int,
        isRain: Boolean,
    ) : this(tempNight, tempDay, pressure) {
        this.isRain = isRain
    }
}

const val AMOUNT_OF_DAYS = 10