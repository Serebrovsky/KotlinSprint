package lesson_16

/*Задача 3 к Уроку 16
Создай класс, описывающий пользователя, который хранит поля логин и пароль.
Пароль не должен быть виден в теле главной функции, но должен быть способ проверить,
что пароль введен верно. Функция валидации должна принимать строку и возвращать результат проверки
(и только его – без распечатки или генерации других строк).
Выведи информацию о релевантности пароля в консоль.*/
fun main() {
    println("Введите Ваш логин:")
    val inputLogin = readln()

    println("Введите Ваш пароль:")
    val inputPassword = readln()

    val user1 = User()

    println(user1.validPassword(inputLogin, inputPassword))

}


class User {
    val login = "hayabusaKiller"
    private val password = "Ducati749s"

    fun validPassword(inputLogin: String, inputPassword: String): Boolean {
        return (inputLogin == login && inputPassword == password)
    }
}