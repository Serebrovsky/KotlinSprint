package lesson_16

import kotlin.math.PI

/*Задача 2 к Уроку 16
Создай класс, описывающий круг. У него должны быть методы, вычисляющие длину окружности
и площадь круга, используя радиус.
Число Pi должно быть равным 3.14, быть недоступным в других файлах и защищенным от изменений извне.
Радиус передается через конструктор и не виден из внешнего по отношению к классу кода.
Создай объект, вызови у него методы для расчета окружности и площади и выведи данные в консоль.*/

fun main() {

    val circle = Circle(5)
    circle.calculationOfCircuit()
    circle.calculationOfArea()
}

const private val pi = PI

class Circle(private val radius: Int) {


    fun calculationOfCircuit() {
        val circuit = 2 * pi * radius
        println("Длина окружности: $circuit")
    }

    fun calculationOfArea() {
        val areaOfCircle = pi * (radius * radius)
        println("Площадь круга: $areaOfCircle")
    }
}