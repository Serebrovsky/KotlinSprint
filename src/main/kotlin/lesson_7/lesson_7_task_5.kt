package lesson_7

/*Задача 5* к Уроку 7

Создай программу, которая генерирует более сложные пароли.

– пароль должен содержать цифры, строчные и заглавные буквы;
– цифры и буквы должны располагаться в случайном порядке;
– длина пароля должна задаваться пользователем.*/

fun main() {
    println("Введите количество символов:")
    val counter = readln().toInt()

    for (i in 1..counter) {
        val x1 = (0..9).random()
        val x2 = ('a'..'z').random()
        val x3 = ('A'..'Z').random()
        val str = "$x1$x2$x3".random()
        print(str)
    }
    //  val f = str.toList().shuffled().joinToString ("")
}




