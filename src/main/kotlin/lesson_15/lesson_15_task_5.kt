package lesson_15

/*Задача 5* к Уроку 15
В логике мобильной игры есть грузовые и легковые автомобили с такими параметрами:
- грузовые машины могут перевозить одного пассажира и 2 тонны груза;
- легковые не перевозят груз, но могут вместить до 3 пассажиров.
Создай интерфейсы, обеспечивающие передвижение машин, перевозку пассажиров и перевозку грузов.
- учитывай максимальное и текущее количество перевозимых людей или грузов;
- интерфейсы должны содержать методы загрузки и разгрузки пассажиров или грузов.
Спроектируй классы и несколько объектов. Вызови их методы, «перевезя» таким образом 6 человек и 2 тонны груза.*/

//Грузовик
class Truck : Vehicle, PassengerCarrier, CargoCarrier {
    override var maxPassengers: Int = 1
    override var currentPassengers: Int = 0

    override var maxCargoWeight: Double = 2.0
    override var currentCargoWeight: Double = 0.0

    override fun move() {
        println("Грузовик едет")
    }

    override fun loadPassengers(count: Int) {
        if (count > 0 && count <= maxPassengers - currentPassengers) {
            currentPassengers += count
            println("$count пассажиров загружено.")
        } else {
            println("$count пассажиров не загружено.")
        }
    }

    override fun unloadPassengers(count: Int) {
        if (count > 0 && count <= currentPassengers) {
            currentPassengers -= count
            println("$count высажено пассажиров.")
        } else {
            println("Не высажено $count пассажиров.")
        }
    }

    override fun loadCargo(weight: Double) {
        if (weight > 0 && weight <= maxCargoWeight - currentCargoWeight) {
            currentCargoWeight += weight
            println("$weight загружено веса.")
        } else {
            println("Не загружено $weight веса.")
        }
    }

    override fun unloadCargo(weight: Double) {
        if (weight > 0 && weight <= currentCargoWeight) {
            currentCargoWeight -= weight
            println("$weight разгружено веса.")
        } else {
            println("Не разгружено веса $weight")
        }
    }
}
//Автомобиль
class Car : Vehicle, PassengerCarrier {
    override var maxPassengers: Int = 3
    override var currentPassengers: Int = 0

    override fun move() {
        println("Машина едет.")
    }

    override fun loadPassengers(count: Int) {
        if (count > 0 && count <= maxPassengers - currentPassengers) {
            currentPassengers += count
            println("$count пассажиров загружено.")
        } else {
            println("Не загружено $count пассажиров.")
        }
    }

    override fun unloadPassengers(count: Int) {
        if (count > 0 && count <= currentPassengers) {
            currentPassengers -= count
            println("$count пассажиров выгужено.")
        } else {
            println("Не выгружено $count пассажиров.")
        }
    }
}

interface Vehicle { //транспортное средство
    fun move()
}
interface PassengerCarrier { //перевозка пассажиров
    var maxPassengers: Int
    var currentPassengers: Int

    fun loadPassengers(count: Int) //загрезка пассажиров
    fun unloadPassengers(count: Int) //выгрузка пассажиров
}
interface CargoCarrier { //перевозка грузов
    var maxCargoWeight: Double
    var currentCargoWeight: Double

    fun loadCargo(weight: Double) //загрузить груз
    fun unloadCargo(weight: Double) //выгрузить груз
}
fun main() {
    val truck = Truck()
    val car = Car()

    truck.move()
    truck.loadPassengers(1)
    truck.loadCargo(2.0)
    truck.move()
    truck.unloadPassengers(1)
    truck.unloadCargo(1.0)

    car.move()
    car.loadPassengers(3)
    car.move()
    car.unloadPassengers(2)
}