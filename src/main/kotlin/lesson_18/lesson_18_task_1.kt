package lesson_18

/*Задача 1 к Уроку 18
CRM (система управления взаимоотношениями с клиентами) обрабатывает заказы в интернет-магазине.
Заказ содержит информацию: номер заказа и товары. Если товар один, он хранится в виде строки,
если несколько – в виде списка строк.
По запросу нужно печатать в консоль сообщение «Заказан товар: [название_товара]» или
«Заказаны следующие товары: [название_товара], … [название_товара]».
Создай 2 объекта заказа и вызови у них метод вывода информации и заказе.
Реши задачу, используя полиморфизм с типом ad hoc.*/
fun main() {
    val order1 = Order()
    val order2 = Order()

    order1.informationalMessage(1, "Струны")
    order2.informationalMessage(2, arrayListOf("Гитара", "Комбик", "Струны"))
}


class Order() {

    fun informationalMessage(numberOfOrder: Int, good: String) {
        println("«Заказ №$numberOfOrder, товар: $good»")
    }

    fun informationalMessage(numberOfOrder: Int, goods: MutableList<String>) {
        println("«Заказ №$numberOfOrder, товары: $goods»")
    }
}

