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

    private val messages: MutableList<Message> = mutableListOf()


    fun addMessage(messageId: Int, text: String, author: String) {


        val message = Message(messageId, text, author)
        messages.add(message)
    }

    fun addThreadMessage(messageId: Int, text: String, author: String, parentMessageId: Int) {


        val childMessage = ChildMessage(messageId, text, author, parentMessageId)
        messages.add(childMessage)
    }

    fun printChat() {
        val threadMap = messages.groupBy {
            if (it is ChildMessage) {
                it.parentMessageId
            } else {
                it.id
            }
        }
        threadMap.forEach { (_, messageList) -> //не используем ключ
            messageList.forEach { message ->
                val tab = if (message is ChildMessage) "\t" else ""
                println("$tab${message.id}. ${message.author}: ${message.text}")
            }
        }
    }
}


fun main() {
    val chat = Chat()

    chat.addMessage(1,"Hello, World!", "User1")
    chat.addMessage(2,"How are you?", "User2")
    chat.addThreadMessage(3,"I'm fine, thank you!", "User1", 2)

    chat.printChat()
}
