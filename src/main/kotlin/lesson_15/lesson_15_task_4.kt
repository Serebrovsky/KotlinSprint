package lesson_15

/*На сайте музыкального магазина есть товары двух категорий: инструменты и комплектующие к ним.
Все товары имеют название и количество единиц на складе.
Для инструментов есть возможность поиска соответствующих комплектующих.
Опиши классы для категорий товаров. Имитируй процесс поиска текстовым сообщением «Выполняется поиск».
Для выноса логики поиска используй интерфейс.*/

// Общий интерфейс для товаров
abstract class Product(val name: String, val quantity: Int)

// Класс для инструментов
class Instrument(name: String, quantity: Int) : Product(name, quantity)

// Класс для комплектующих
class Accessory(name: String, quantity: Int, var parentId: Int) : Product(name, quantity)

//класс магазин
class Shop : AccessorySearch {
    val listOfInstruments = mutableListOf<Instrument>()
    val accessories = mutableListOf<Accessory>()
}

// Интерфейс для поиска комплектующих
interface AccessorySearch {
    fun searchAccessories() {
        println("Выполняется поиск!")
    }
}

// Пример использования
fun main() {

    val guitar = Instrument("Гитара", 5)
    val drum = Instrument("Барабаны", 3)

    val strings = Accessory("Струны для гитары", 20, 1)
    val drumSticks = Accessory("Палочки для барабанов", 10, 2)

    val shop = Shop()
    shop.searchAccessories()
}
