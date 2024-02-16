package lesson_17

/*В приложении для хранения облачных файлов есть папки и файлы.
Создай класс папки, который имеет имя, количество файлов и флаг “секретно”. Если флаг имеет значение true,
то при попытке прочитать имя, возвращать строку “скрытая папка” и количество файлов – 0.
В ином случае возвращать ее название и реальное количество файлов. Для реализации должны использоваться геттеры.
Создай экземпляр “скрытой” папки. Протестируй попытку чтения ее данных.*/

class Package(name: String, numberOfFiles: Int, var isSecret: Boolean) {
    val name: String = name
        get() {
            return if (isSecret) {
                "Скрытая папка!"
            } else {
                field
            }
        }

    val numberOfFiles: Int = numberOfFiles
        get() {
            return if (isSecret) {
                0
            } else {
                field
            }
        }
}

fun main() {
    val package1 = Package("package1", 5, false)

    println(package1.name)
    println(package1.numberOfFiles)
}