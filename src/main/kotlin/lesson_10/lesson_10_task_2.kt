package lesson_10

/*Задача 2 к Уроку 10
Для регистрации в приложении пользователь придумывает логин и пароль. И пароль, и логин должны содержать
в себе хотя бы 4 символа. Если всё верно, программа выводит приветственное сообщение.
 – логин и пароль должны считываться с консоли;
 – проверку длины логина или пароля вынеси в отдельную функцию, которая валидирует длину пароля;
 – если пароль меньше 4 символов – вывести сообщение: "Логин или пароль недостаточно длинные".*/
fun main() {
    println("Укажите ниже Ваш логин:")
    val login = readln()
    println("Укажите Ваш пароль:")
    val password = readln()
    
    if (!checkLength(login, password)) println("Логин и пароль недостаточно длинные!")
}

fun checkLength(login: String, password: String): Boolean {
    val lengthLogin = login.length
    val lengthPassword = password.length

    val strongPassword = (lengthLogin >= LENGTH) && (lengthPassword >= LENGTH)

    return strongPassword
}

const val LENGTH = 4