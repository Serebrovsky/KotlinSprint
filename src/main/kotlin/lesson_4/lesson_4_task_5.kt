package lesson_4

/*Научно-исследовательский корабль может приступить к долгосрочному плаванию при выполнении следующих условий:
- корабль не имеет повреждений;
- число экипажа составляет от 55 до 70 человек;
- на борту есть более 50 ящиков провизии;
- погода благоприятна или неблагоприятна.

Альтернативно, корабль может отплыть даже при наличии незначительных повреждений, при условии что:
- на борту рекомендованный состав экипажа - 70 человек;
- погода благоприятна;
- на борту есть более 50 ящиков провизии.

Напиши программу, которая будет определять, может ли корабль отправиться в плавание.
В качестве входных данных используй информацию, введенную через консоль:

- наличие повреждений корпуса (Boolean переменная);
- текущий состав экипажа;
- количество ящиков с провизией на борту;
- благоприятность метеоусловий (Boolean переменная).

Программа должна анализировать эти данные и выводить результат в консоль. */

fun main(){

    println("Есть ли повреждения корпуса?")
    val destroyString = readLine()
    val destroyBoolean = when (destroyString?.toLowerCase()) {
        "true" -> true
        "false"-> false
        else -> false
    }
    println("Какое количество экипажа?")
    val numberOfCrew = readLine()?.toInt()

    println("Какое количество ящиков на борту?")
    val numberOfBoxes = readLine()?.toInt()

    println("Благоприятная ли погода?")
    val favorableWeatherString = readLine()
    val favorableWeatherBoolean = when (favorableWeatherString?.toLowerCase()) {
        "true" -> true
        "false"-> false
        else -> false
    }

    val abilityL: Boolean = (destroyBoolean == DESTROY_L && MIN_CREW_L <= numberOfCrew!!
            && numberOfCrew <= MAX_CREW_L && MIN_BOXES_L <= numberOfBoxes!! )
    val abilityS: Boolean = (destroyBoolean == DESTROY_S && numberOfCrew!! <= CREW_S &&
            MIN_BOXES_S <= numberOfBoxes!! && favorableWeatherBoolean == FAVORABLE_WEATHER_S)

    println("Возможность отправиться в долгосрочное плаванье: $abilityL")
    println("Возможность отправиться с незначительными повреждениями: $abilityS")
}
//LONG TERM:
const val DESTROY_L = false
const val MIN_CREW_L = 55
const val MAX_CREW_L = 70
const val MIN_BOXES_L = 50
//const val FAVORABLE_WEATHER_L

//SHORT TERM:
const val DESTROY_S = true
const val CREW_S = 70
const val FAVORABLE_WEATHER_S = true
const val MIN_BOXES_S = 50