package lesson_3

/*Девушка по имени Андреева Татьяна Сергеевна в 22 года вышла замуж за Сидорова, и поменяла фамилию.
О ней есть запись в одном из государственных приложений. Приложение отслеживает изменения
персональных данных граждан.
Выведи в консоль данные на момент когда ей было 20 и на момент когда ей было 22 в формате [ФИО, возраст].
Все части ФИО и возраст изначально хранятся в отдельных переменных.*/

fun main(){
    val surnameBeforeMarriage = "Андреева"
    val surnameAfterMarriage = "Cидорова"
    val name = "Татьяна"
    val surname2 = "Сергеевна"
    val ageBeforeMarriage = 20
    val ageAfterMarriage = 22

    val status20 = surnameBeforeMarriage + " " + name + " " + surname2 + ", " + ageBeforeMarriage
    val status22 = surnameAfterMarriage + " " + name + " " + surname2 + ", " + ageAfterMarriage

    println(status20)
    println(status22)
}