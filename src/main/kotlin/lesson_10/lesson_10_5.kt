package lesson_10
/*Задача 5* к Уроку 10
Собери в одно целое регистрацию пользователя, проверку логина (минимум 4 символа), генерацию пароля для него
и авторизацию по коду из смс – программа должна “высылать” код из четырех цифр (случайное число от 1000 до 9999).
Пользователь будет вводить этот код. Если код введён неверно, программа вышлет новый.
Алгоритм действий:
1. Регистрация
– пользователь придумывает логин (длина должна быть более 4 символов);
– программа генерирует пароль и отображает его пользователю;
2. Авторизация
– программа предлагает авторизоваться, пользователь вводит логин и пароль;
– если данные неверны, отображается ошибка и логин и пароль запрашиваются заново;
– если данные верны, “высылается” сгенерированный код из 4 цифр и запрашивается у пользователя;
– если код неверен – высылается новый, если верен – появляется сообщение об успешной авторизации.
Действия в программе должны быть распределены по соответствующим методам без дублирования кода.*/
fun main() {

    var login: String
    do {
        println("Придумайте Ваш логин:")
        login = readln()

        val isCheckLogin = checkLengthLogin(login)
    } while (!isCheckLogin)

    val password = generatePassword()

    checkPassword(login, password)

    println("Вы успешно авторизовались!")
}

fun checkLengthLogin(login: String): Boolean {
    if (login.length >= NUMBER_OF_ATTEMPT) return true
    else {
        println("Ошибка! Длина логина должна быть более 4 символов!")
        return false
    }
}

fun generatePassword(): String {
    var string = ""
    for (i in 1..5) {
        val password = ((0..9) + ('a'..'z') + ('A'..'Z')).random()
        string = string + password
    }
    return string
}


fun generateOtp(): Int {
    return (1000..9999).random()
}


fun checkPassword(login: String, password: String) {
    var editLogin: String
    var editPassword: String
    var editOtp: Int
    var otp: Int

    do {

        otp = generateOtp()
        println("Ваш пароль: $password, код: $otp")

        println("Введите Ваши логин, пароль и код:")
        editLogin = readln()
        editPassword = readln()
        editOtp = readln().toInt()
        if ((editOtp != otp) || (editLogin != login) || (editPassword != password)) println("Ошибка!") //проверить логин, пароль и OTP
    } while ((editOtp != otp) || (editLogin != login) || (editPassword != password))

}

const val NUMBER_OF_ATTEMPT = 4