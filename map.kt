fun main() {

    val words = listOf("apple", "cat", "banana", "dog", "elephant")

    val wordMap = words.associateWith { it.length }

    val filteredWords = wordMap.filter { it.value > 4 }

    filteredWords.forEach { entry ->
        println("${entry.key} has length ${entry.value}")
    }

}