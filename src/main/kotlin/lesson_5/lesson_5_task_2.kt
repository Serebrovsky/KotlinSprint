package lesson_5

/*Изменить пример из видео урока. В уроке создавался блок кода, считывающий возраст.
И если возраст больше или равен 18 лет, показывали экран с ограниченным контентом
(выводили это сообщение в консоль в качестве имитации).

Новое условие:
– Пользователь должен вводить не возраст, а год рождения;
– Возраст пользователя высчитывать на основании текущего года;
– Вычисляемый результат должен сравниваться с константой, в которой хранится возраст совершеннолетия (18);
– Если год рождения подходит, выводить сообщение “Показать экран со скрытым контентом”.*/

fun main() {
    val yearOfBerth = readLine()?.toInt()
    val age = THIS_YEAR - yearOfBerth!!

    if (age > ADULT) println("Показать экран со скрытым контентом!")
    else println("Доступ запрещен!")
}

const val ADULT = 18
const val THIS_YEAR = 2023