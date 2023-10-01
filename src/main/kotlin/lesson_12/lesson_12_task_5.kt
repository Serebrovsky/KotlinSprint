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
    val array = mutableListOf<WeatherDay__>()

    for (i in 1..10) {
        val tempNight = (15..25).random()
        val tempDay = (20..30).random()
        val pressure = (720..760).random()
        val isRain = listOf(true,false).random()
        array.add(WeatherDay__(tempNight, tempDay, pressure, isRain))
    }
    for (i in 1..10) {
        val srЕ
        val
    }
}

class WeatherDay__(val tempNight: Int, val tempDay: Int, val pressure: Int) {
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

}