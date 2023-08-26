package lesson_8

/*Задача 5* к Уроку 8

Напиши программу, которая должна создавать массив из определенного количества ингредиентов,
которые будет вводить пользователь. Элементы вводятся по одному. Перед вводом элементов сначала
запрашивается количество планируемых ингредиентов.*/

fun main() {
    println("Введите планируемое количество ингридиентов:")
    val quantityOfIngredients = readln().toInt()

    val dish = arrayOfNulls<String>(quantityOfIngredients)
    var counter = 0

    for (i in dish) {
        println("Введите ингридиент:")
        dish[counter] = readln()
        counter++
    }
    println("Ингредиенты Вашего блюда: ${dish.contentToString()}")
}