package lesson_10

/*Задача 3 к Уроку 10

Напиши программу, которая генерирует пароли. Пароль должен состоять из чередующихся цифр и специальных символов.
Например, #5%6”2.
– пользователь сам задает длину пароля;
– для генерации пароля должна быть отдельная функция, принимающая целочисленное значение длины пароля
и возвращающая готовый пароль;
– пароль должен содержать цифры от 0 до 9, специальные символы: !"#$%&'()*+,-./ и пробел (всего 16 спецсимволов).*/


fun main() {
    println("Введите длину пароля:")
    val length = readln().toInt()
    val password = generatePassword(length)
    println(password)
}

fun generatePassword(length: Int): String {
    var string = ""
    for (i in 1..length) {
        val specialSymbols = (('!'..'/') + (0..9)).random()
        string = string + specialSymbols
    }
    return string
}