package lesson_9
/*Задача 5* к Уроку 9
Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).
– результат должен исключать повторы; //в конец
– список должен выводиться в алфавитном порядке;
– все элементы списка выведены в одну строку, разделяя слова запятыми;
– первое слово должно быть напечатано с заглавной буквы, в конце списка должна стоять точка.*/

fun main () {
    val dishToMutableSet = mutableSetOf<String>()

       for (i in 0..QUANTITY_OF_INGREDIENTS) {
           println("Введите значение ингредиента №${i+1}!")
           val ingredient = readln()
           dishToMutableSet.add(ingredient)
       }
    val dishToMutableList = dishToMutableSet.toMutableList()
    dishToMutableList.sort()
    dishToMutableList[0] = dishToMutableList[0].capitalize()

    val index = dishToMutableList.lastIndex
    dishToMutableList[index] = dishToMutableList[index] + "."

    println(dishToMutableList)
}
const val QUANTITY_OF_INGREDIENTS = 4
