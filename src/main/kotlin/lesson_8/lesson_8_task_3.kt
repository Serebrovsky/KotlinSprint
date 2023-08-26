package lesson_8
/*Задача 3 к Уроку 8

Скопируй предыдущее задание. Нужно изменить код, чтобы проверить, есть ли ингредиент в рецепте,
но не используя циклы для поиска.*/

fun main (){
    val dish = arrayOf("помидоры", "огурцы", "зелень")

    println("Введите ингридиет:")
    val requiredIngredient = readln()

val found = dish.contains(requiredIngredient)
    println(found)
}