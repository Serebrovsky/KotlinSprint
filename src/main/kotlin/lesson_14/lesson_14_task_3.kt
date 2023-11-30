package lesson_14



/*Задача 3 к Уроку 14
Напиши программу для работы с геометрическими фигурами: кругом и прямоугольником.
Каждая фигура имеет свой цвет и уникальные параметры:
- для круга — радиус;
- для прямоугольника — ширину и высоту.

Создай абстрактный класс Figure с полем color. Внутри определи два абстрактных метода:
- для вычисления площади;
- для вычисления периметра.

Добавь классы-наследники для вышеупомянутых типов фигур.
Реализуй методы для вычисления площади и периметра в каждом из классов-наследников (формулы можно найти в интернете).

Создай несколько объектов разных цветов (черные и белые). И выведи в консоль:
- сумму периметров всех черных фигур;
- сумму площадей всех белых фигур.*/
fun main() {
    var sumS = 0.0
    var sumP = 0.0
    val listFigure = listOf<Figure>(
        Circle(2, WHITE),
        Circle(2, BLACK),
        Circle(2, WHITE),
        Circle(2, WHITE),
        Rectangle(2, 2, BLACK),
        Rectangle(2, 2, WHITE),
        Rectangle(2, 2, BLACK),
        Rectangle(2, 2, WHITE),
    )

    val listWhite = listFigure.filter { it.color == WHITE }
    listWhite.forEach {
        it.area()
        sumS += it.s
    }
    val listBlack = listFigure.filter { it.color == BLACK }
    listBlack.forEach {
        it.perimeter()
        sumP += it.p
    }


    println("Площадь всех фигур белого цвета: $sumS")
    println("Периметр всех черных фигур: $sumP")

}

const val WHITE = "белый"
const val BLACK = "черный"


const val PI = Math.PI


open class Figure(var color: String) {
    var s = 0.0
    var p = 0
    open fun area() {}
    open fun perimeter() {}


}

class Circle(var radius: Int, color: String) : Figure(color) {

    override fun area() {
        if (color == "белый") {
            s += (PI * (radius * radius))


        }
    }
}

class Rectangle(var width: Int, var height: Int, color: String) : Figure(color) {
    override fun perimeter() {
        if (color == "черный") {
            p += (width + height) * 2

        }
    }
}
