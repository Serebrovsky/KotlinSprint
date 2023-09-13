fun main() {
    val year = 1961 //год полета Юрия Гагарина в космос
    var hour = 9
    var min = 7

    println(year)
    println(hour)
    println(min)

    hour = 10
    min = 55

    val time = String.format("%02d:%02d", hour, min)
    print(time)
}