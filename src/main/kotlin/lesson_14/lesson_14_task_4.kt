package lesson_14

/*Задача 4 к Уроку 14
В компьютерной игре существуют планеты. У некоторых из них есть спутники.
Планеты и спутники могут иметь атмосферу и могут быть пригодными для высадки.

Создай родительский класс, описывающий небесные тела, и подклассы, описывающие планеты и спутники.
- планета должна хранить список спутников.
Создай планету с двумя спутниками и выведи в консоль название планеты и названия всех ее спутников.*/

fun main() {
    val planet1 = Planet(
        listOf(
            Satellite("Фобос", isAtmosphere = true, isGetOff = false),
            Satellite("Деймос", isAtmosphere = true, isGetOff = true)
        ), "Марс", isAtmosphere = false, isGetOff = false
    )
    planet1.printNamePlanet()
}

open class SpaceObject(
    val name: String,
    val isAtmosphere: Boolean,
    val isGetOff: Boolean
)
class Planet(
    val listOfSatellite: List<Satellite>,
    name: String,
    isAtmosphere: Boolean,
    isGetOff: Boolean
) : SpaceObject(name, isAtmosphere, isGetOff) {
    fun printNamePlanet() {
        println("Планета: $name")
        listOfSatellite.forEach {
            println("Спутник: ${it.name}")
        }
    }
}
class Satellite(
    name: String,
    isAtmosphere: Boolean,
    isGetOff: Boolean
) : SpaceObject(name, isAtmosphere, isGetOff)