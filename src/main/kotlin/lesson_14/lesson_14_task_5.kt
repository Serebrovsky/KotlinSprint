package lesson_14


/*Задача 5* к Уроку 14
Создай класс Chat, который реализует обсуждение в мессенджере, аналогичному Discord.
Класс должен иметь следующие методы:
- ++addMessage() — добавляет обычное сообщение в чат, принимает на вход текст и автора сообщения;
- ++addThreadMessage() — добавляет сообщение в тред к предыдущему сообщению (для начала обсуждения),
дополнительно принимает на вход parentMessageId для идентификации сообщения, под которым создается ветка обсуждения;

Сообщения чата должны храниться в списке, в классе Chat. Для создания сообщений соответствующих типов используй
классы Message и ChildMessage в соответствующей иерархии. У каждого типа сообщения должен быть id.

- printChat() — печатает все сообщения чата. Если создано дочернее сообщение, необходимо применить
для вывода табуляцию и печатать его под родительским сообщением. Используй groupBy()
для группировки сообщений по parentMessageId, если сообщение является экземпляром ChildMessage,
или по id если это обычное сообщение.*/

open class Message(val id: Int, val text: String, val author: String)

class ChildMessage(id: Int, text: String, author: String, val parentMessageId: Int) : Message(id, text, author)

class Chat {
    val messages: MutableList<Message> = mutableListOf()

    fun addMessage(text: String, author: String) {
        val messageId = messages.size + 1
        val message = Message(messageId, text, author)
        messages.add(message)
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        val messageId = messages.size + 1
        val childMessage = ChildMessage(messageId, text, author, parentMessageId)
        messages.add(childMessage)
    }

    fun printChat() {
        /* печатает все сообщения чата. Если создано дочернее сообщение, необходимо применить
        для вывода табуляцию и печатать его под родительским сообщением. Используй groupBy()
        для группировки сообщений по parentMessageId, если сообщение является экземпляром ChildMessage,
        или по id если это обычное сообщение.*/
        val chlistMes = mutableListOf<ChildMessage>()
        val listMes = mutableListOf<Message>()
        messages.forEach { message ->
            if (message is ChildMessage) {
                chlistMes.add(message)
            } else {
                listMes.add(message)
            }
        }
        listMes.groupBy { it.id }
        chlistMes.groupBy { it.id }

        listMes.forEach {
            println(it.text)
            chlistMes.forEach { println(it.id) }


        }
        println(chlistMes)


    }
}



fun main() {
    val chat = Chat()

    chat.addMessage("Hello, World!", "User1")
    chat.addMessage("How are you?", "User2")
    chat.addThreadMessage("I'm fine, thank you!", "User1", 1)

    chat.printChat()
}
