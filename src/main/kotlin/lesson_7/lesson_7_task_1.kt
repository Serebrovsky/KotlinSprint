package lesson_7

/*Задача 1 к Уроку 7

Создай программу, которая генерирует шестизначные пароли. Пусть пароль будет состоять из чередующихся цифр
и строчных букв латинского алфавита (без специальных символов). Например, k5p6m2.

– для каждого символа необходимо создать отдельную переменную;
– вывести сгенерированный пароль в консоль;
– подсказка: использовать метод, который может генерировать рандомное число из заданного диапазона.*/

fun main (){
    val numberRange = 0..9
    val charRange = 'a'..'z'

    val symbol1 = charRange.random().toString()
    val symbol2 = numberRange.random().toString()
    val symbol3 = charRange.random().toString()
    val symbol4 = numberRange.random().toString()
    val symbol5 = charRange.random().toString()
    val symbol6 = numberRange.random().toString()

    println(symbol1+symbol2+symbol3+symbol4+symbol5+symbol6)

}