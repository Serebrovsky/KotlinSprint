package lesson_16

/*Задача 5* к Уроку 16
Для игры требуется создать класс игрока. С полями: имя, здоровье и сила удара.
Здоровье должно изменяться только через методы получения урона и лечения.

Добавить приватный метод, который вызывается, если при получении урона заканчивается здоровье.
Смерть обнуляет силу удара, здоровье и не позволяет лечиться. Сымитируй бой,
вызвав несколько раз методы урона и лечения. В конце игрок должен умереть.*/
fun main() {
    val player1 = Player("Владимир")
    val player2 = Player("Света")

    player1.takeDamage()
    player1.takeDamage()
    player1.takeDamage()
    player1.takeDamage()

    player1.therapy()

    player1.status()
}
class Player(val name: String) {
    private var health = 100
    var forceOfHit = 100
    private var isDeath = false

    fun status() {
        println("СТАТИСТИКА:\nИмя: $name, здоровье: $health, сила удара: $forceOfHit")
    }

    fun takeDamage(): Int {
        health -= MARK
        println("$name, -25 здоровья: $health")
        if (health <= 0) {
            death()
        }
        return health
    }

    fun therapy(): Int {
        if (!isDeath) {
            health += MARK
            println("$name, +25 лечения: $health")
        } else {
            println("Невозможно лечение! Вы мертвы!")
        }
        return health
    }

    private fun death() {
        forceOfHit = ZERO
        health = ZERO
        isDeath = true
        println("$name, вы умерли! Ваше здоровье: $health, сила удара: $forceOfHit")
    }
}
const val MARK = 25
const val ZERO = 0