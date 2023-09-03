package lesson_7

/*Задача 5* к Уроку 7

Создай программу, которая генерирует более сложные пароли.

– пароль должен содержать цифры, строчные и заглавные буквы;
– цифры и буквы должны располагаться в случайном порядке;
– длина пароля должна задаваться пользователем.*/

fun main() {
    println("Введите количество символов:")
    val counter = readln().toInt()

    var password = ""
    val range = (0..9) + ('a'..'z') + ('A'..'Z')
    for (i in 1..counter) {
        val char = range.random()
        password = password + char
    }
    print(password)
}




