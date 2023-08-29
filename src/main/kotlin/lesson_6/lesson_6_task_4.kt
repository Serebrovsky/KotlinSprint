package lesson_6

/*Напиши небольшую консольную игру, в которой нужно угадать число в промежутке от 1 до 9.
Игроку дается 5 попыток, чтобы угадать это число.

– если игрок угадывает число, выводится сообщение “Это была великолепная игра!” и программа завершает работу;
– если не угадывает, то отображается "Неверно" или что-то на твое усмотрение и оставшееся количество попыток;
– после истечения попыток выводится сообщение “Было загадано число N”.*/

fun main(){

    val winNumber = (1..9).random()

    println("Введите число:")
    var myNumber = readln().toInt()

    var counter = 0

    while (myNumber != winNumber) {

        println("Неверно! Осталось ${ATTEMPT - (++counter)} попыток")

        if (counter == ATTEMPT) {
            println("Бало загадано число $winNumber")
            break
        }
        println("Введите число:")
        myNumber = readln().toInt()
    }

    println("Это была великолепная игра. Было загадано число $winNumber")
}
const val ATTEMPT = 5
