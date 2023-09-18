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
fun main(){


    val room1 = Rooms(
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
    val room2 = Rooms(
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
    val room3 = Rooms(
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


}

class Rooms(
    val roomId: Int, //ID комнаты
    val cover: Int, //обложка
    var name: String, //название комнаты
    var idOfParticipants: List<Int>,//ID участников
    var imageOfParticipants: List<Int>, //аватары участников
    var nicknameOfParticipants: List<String>, //никнеймы участников

    val status: List<String> = listOf("разговаривает",
    "микрофон выключен", "пользователь заглушен"),
        ){
    fun showNicknameAndStatus (i: Int, s: Int){
        println("Никнейм пользователя в комнате $name: ${nicknameOfParticipants[i]}, " +
                "его статус: ${status[s]}")
    }
}