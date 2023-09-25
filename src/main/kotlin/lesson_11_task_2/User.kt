package lesson_11_task_2

class User(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: Int = 0,
)
{
    fun printUser(){
        println("Информация о пользователе: id:${id}, логин:${login}, пароль:${password}, е-mail:${email}")
    }
    fun addBio (){
        println("Введите значение для био:")
        bio = readln().toInt()
    }
    fun changePassword (){
        println("Введите Ваш пароль:")
        val editPassword = readln()
        if (editPassword == password){
            println("Измените свой пароль на новый:")
            password = readln()
            println("Пароль изменен! Ваш новый пароль: $password")
        }
    }
    fun addMessage(){
        println("Напишите сообщение:")
        val addString = readln()
        println(addString)
    }
}