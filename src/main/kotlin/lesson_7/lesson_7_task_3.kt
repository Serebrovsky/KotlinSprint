package lesson_7

/*Задача 3 к Уроку 7

Создай программу, которая выводит все чётные числа от нуля до числа, введенного пользователем.
Сначала нужно вывести в консоль запрос на ввод числа. Полученное число сохраняем в отдельную переменную.
В решении должна использоваться прогрессия.*/

fun main (){
    println("Введите число:")
    val editNumber = readln().toInt()

    for (i in 0..editNumber step 2){
        println(i)
    }
}