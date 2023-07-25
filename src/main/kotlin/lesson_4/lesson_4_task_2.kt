package lesson_4

/*При работе на таможенном терминале важно точно определить категорию каждого груза. Напиши программу,
которая проверяет, соответствует ли груз категории "Average". Эта категория имеет следующие параметры:
вес от 35 кг до 100 кг (включительно), и объем меньше 100 литров.

Создай программу, которая отображает соответствие данных груза категории "Average".
Вывод программы может выглядеть так: "Груз с весом 42 кг и объемом 120 л
соответствует категории 'Average': false".

- укажи предварительно заданные параметры категории;
- проверь, соответствуют ли следующие грузы категории "Average": 20 кг / 80 л и 50 кг / 100 л;
- сделай сравнение непосредственно внутри println() и без использования диапазонов.*/

fun main() {
    val weightLoad1 = 20
    val sizeLoad1 = 80

    val weightLoad2 = 50
    val sizeLoad2 = 100

    println("Груз с весом $weightLoad1 и объемом $sizeLoad1 соответствует категории \"Average\": " +
            "${AVERAGE_WEIGHT_MIN <= weightLoad1 && weightLoad1 <= AVERAGE_WEIGHT_MAX && sizeLoad1 < SIZE}")
    println("Груз с весом $weightLoad2 и объемом $sizeLoad2 соответствует категории \"Average\": " +
            "${AVERAGE_WEIGHT_MIN <= weightLoad2 && weightLoad2 <= AVERAGE_WEIGHT_MAX && sizeLoad2 < SIZE}")
}

const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val SIZE = 100