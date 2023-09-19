package lesson_11

/*Задача 3 к Уроку 11
Нужно описать сущности для упрощенной версии приложения социальной сети, в которой общаются только голосом.

Функционал одного из модулей будет такой. Есть лента, в которой отображаются “комнаты” для общения по интересам.
В карточке “комнаты” отображается:
– обложка
– название
– список участников, которые отображаются в виде аватарок. При долгом нажатии на аватар подсветится его никнейм.
Рядом с аватаркой отображается текстовый бейдж с одним из возможных статусов говорящего: “разговаривает”,
“микрофон выключен”, “пользователь заглушен”.
После проектирования создай список объектов карточек с несколькими “комнатами” с произвольными данными.*/
fun main() {
    val room1 = Room(
        1, 323242434, "Мотоциклы",
        listOf(
            Member(3324, "Владимир", "разговаривает"),
            Member(5645, "Анна", "микрофон выключен"),
            Member(6476, "Виктория", "пользователь заглушен"),
        )
    )
    val room2 = Room(
        2, 342345253, "Кино",
        listOf(
            Member(2434, "Ирина", "разговаривает"),
            Member(2434, "Катя", "микрофон выключен"),
            Member(3542, "Кирилл", "пользователь заглушен"),
        )
    )
    room1.clickOnAvatar(0, room1)
    room1.showRoom(room1)

    val roomsList = listOf(room1, room2)
}

class Room(
    val roomId: Int, //ID комнаты
    val cover: Int, //обложка
    var name: String, //название комнаты
    var listOfMembers: List<Member>,//ID участников
) {
    fun showRoom(room1: Room){
        println("Отображение комнаты:")
        println("Аватар: ${room1.cover}")
        println("Название комнаты: ${room1.name}")
        room1.listOfMembers.forEach{ println( "Фотография участника: ${it.imageOfParticipants}")}
    }
    fun clickOnAvatar(item: Int, room1: Room) {
        println("Отображается аватар, никнейм и статус участника:")
        println("Аватар: ${room1.listOfMembers[item].imageOfParticipants}")
        println("Никнейм: ${room1.listOfMembers[item].nicknameOfParticipants}")
        println("Статус: ${room1.listOfMembers[item].status}")
    }
}
class Member(
    var imageOfParticipants: Int, //аватары участников
    var nicknameOfParticipants: String, //никнеймы участников
    val status: String,
)















/*  val room1 = Room(
       roomId = 1,
       cover = 344124,
       name = "Волейбол",
       idOfParticipants = listOf(1, 2, 3, 4, 5, 6, 7, 8),
       imageOfParticipants = listOf(1231, 1231, 3442, 4573, 5644, 2345, 1244, 4544),
       nicknameOfParticipants = listOf(
           "vova749",
           "vika1210",
           "lola55",
           "viktor89",
           "egor",
           "spike",
           "misha",
           "kirill"
       ),
       status = listOf("разговаривает", "микрофон выключен", "пользователь заглушен"),
   )
   val room2 = Room(
       roomId = 2,
       cover = 4534235,
       name = "Литература",
       idOfParticipants = listOf(2, 3, 6, 7, 8),
       imageOfParticipants = listOf(4573, 5644, 2345, 1244, 4544),
       nicknameOfParticipants = listOf(
           "vova749",
           "vika1210",
           "lola55",
           "viktor89",
           "egor",
       ),
       status = listOf("разговаривает", "микрофон выключен", "пользователь заглушен"),
   )
   val room3 = Room(
       roomId = 3,
       cover = 4534243,
       name = "Мотоциклы",
       idOfParticipants = listOf(2, 3, 4),
       imageOfParticipants = listOf(4573, 5644, 2345),
       nicknameOfParticipants = listOf(
           "vova749",
           "vika1210",
           "lola55",
       ),
       status = listOf("разговаривает", "микрофон выключен", "пользователь заглушен"),
   )

   println(room1.showNicknameAndStatus(5, 1))
   println(room2.showNicknameAndStatus(0, 1))
  println(room3.showNicknameAndStatus(1, 2))

   val roomsList = listOf(room1, room2, room3) //не понял, что нужно сделать(


}*/
