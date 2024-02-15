package lesson_17

/*Задача 1 к Уроку 17
Создай класс, описывающий элемент викторины. В primary конструкторе два
текстовых свойства: вопрос и ответ.
Явно пропиши для вопроса геттер, для ответа геттер и сеттер.*/

fun main() {
    val quiz1 = Quiz("Вопрос", "Ответ")

    //При запуске отрабатывает геттер и выводит измененное значение переменной:
    println(quiz1.question)
    println(quiz1.answer)

    quiz1.answer = "другое"
    println(quiz1.answer)
}

class Quiz(question: String, answer: String) {

    var question = question
        get() = field + "!"


    var answer = answer
        get() = field + "!"
        set(value) {
            field = value
        }


}