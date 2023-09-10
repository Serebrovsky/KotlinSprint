package lesson_10

/*Задача 4 к Уроку 10
Усовершенствуй игру, где пользователь и компьютер по очереди бросают кости. Побеждает выбросивший наибольшее число.
 Теперь дай возможность пользователю играть до тех пор пока ему не надоест.
 В конце программа должна вывести сколько партий он выиграл.
– логика бросков должна быть реализована по примеру из задачи 1;
– после первого раунда программа задает вопрос: “Хотите бросить кости еще раз Введите Да или Нет”;
– программа в зависимости от ответа запускает новый раунд или заканчивает игру с выводом количества
выйгрышных партий человека;
– в программе должно быть минимум 2 метода (для проведения раунда и для генерации значений брошенных кубиков);
– основная логика программы должна находиться в main(), а 2 другие функции будут вспомогательными.*/
fun main() {

    var allWin = 0 //счетчик побед
    do {
        val oneWin = round(winHuman = 0) //запускается функция вывода очков и счетчик побед
        allWin = oneWin + allWin //суммируются все победы человека

        /*----блок продолжения игры----*/
        println("Продолжить игру?")
        val isContinue = readln()
        val isContinueBoolean = when (isContinue.toLowerCase()) {
            "да" -> true
            "нет" -> false
            else -> false
        }/*----блок продолжения игры----*/

    } while (isContinueBoolean)
    println("Вы выиграли $allWin раз")
}

fun round(winHuman: Int): Int {
    val diceHuman = generation()
    val diceComputer = generation()
    println("У человека: $diceHuman, у компьютера: $diceComputer")

    if (diceHuman > diceComputer) {
        val winHuman = winHuman + 1
        return winHuman
    } else {
        return winHuman
    }
}

fun generation(): Int {
    val number = (1..6).random()
    return number
}














  /*  var counter = 1

  //  val x = round(counter)
   // println(x)


//всю логику перенести в мэйн if,while, а round только для counter

    do {
        val human = generation()
        val computer = generation()
        val counter11 = round(counter)
        println("Значение для раунда $counter11: человек - $human, компьютер - $computer")

        if (human > computer) {
            println("Победил человек!")
        } else if (human == computer) {
            println("Победила дружба!")
        } else {
            println("Победил компьютер!")
        }
        println("Продолжить игру?")
        val isTrue = readln().toBoolean()
    } while (isTrue)

}

fun round(counter: Int): Int {

   val counter = counter +1
    return counter
}

fun generation(): Int {
    val number = (1..6).random()
    return number


}*/

