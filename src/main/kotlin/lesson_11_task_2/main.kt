package lesson_11_task_2

/*Задача 2 к Уроку 11
Возьми класс User из первой задачи. Добавь к классу новое необязательное свойство bio и несколько методов.
Нам нужно иметь возможность посмотреть информацию о пользователе, заполнить описание профиля, изменить пароль
и отправить письмо на почту.
– 1 метод должен выводить информацию о пользователе в консоль;
– 2 метод должен считывать с консоли информацию о пользователе и сохранять в поле bio;
– 3 метод изменения пароля сначала должен запросить текущий пароль, и, если он введен верно, запросить новый,
изменить его и сообщить, что пароль изменен;
– 4 метод будет принимать строку с текстом, который мы хотим “отправить” пользователю – метод должен печатать
сообщение в консоль.

Далее создай объект, заполни информацию “о себе” (методом чтения с консоли) и измени пароль. Затем, проверь изменения
и отправь сообщения на почту (в качестве обращения использовать логин), вызывая соответствующие методы.*/
fun main() {
    val user1 = User(1, "vova", "dsfsdf", "nymphetamine2006@yandex.ru")

    println("Метод №1:${user1.printUser()}")
    user1.addBio()
    user1.changePassword()
    user1.addMessage()

}