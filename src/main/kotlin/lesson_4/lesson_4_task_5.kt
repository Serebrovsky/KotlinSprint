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
    val isDestroy = destroyString.toBoolean()

    println("Какое количество экипажа?")
    val numberOfCrew = readLine()?.toInt()

    println("Какое количество ящиков на борту?")
    val numberOfBoxes = readLine()?.toInt()

/*    println("Благоприятная ли погода?")
    val favorableWeatherString = readLine()
    val isFavorableWeather = favorableWeatherString.toBoolean()*/

    val isAbility: Boolean = (isDestroy == IS_DESTROY && MIN_CREW <= numberOfCrew!! && numberOfCrew >= MAX_CREW && numberOfBoxes!! >= MIN_BOXES)

    println("Возможность отправиться плаванье: $isAbility")
}

const val IS_DESTROY = true
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_BOXES = 50

//если неправильно, то я не понимаю что от меня хотят. не понимаю условие. Этот альтернативный рейс меня путает