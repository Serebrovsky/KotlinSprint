package lesson_3

/*Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера, которая примет строку,
отправленную игроком (считаем эти данные уже известными и объявляем строку с данными: “D2-D4;0”.

Необходимо будет сделать обратное. Распарсить строку – разбить ее на 3 составляющих:
откуда, куда и номер хода, присвоить соответствующим переменным и распечатать по отдельности.*/

fun main() {
    val stroke = "D2-D4;0"
    val parts = stroke.split("-", ";")
    val before = parts[0]
    val after = parts[1]
    val moveNumber = parts[2].toInt()

    println(before)
    println(after)
    println(moveNumber)
}