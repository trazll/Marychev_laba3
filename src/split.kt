fun main() {
//    val sentence = "Kotlin is awesome"
//    val words = sentence.split(" ")
//    println(words)
//    val data = "apple,banana,orange"
//    val fruits = data.split(",")
//    for (fruit in fruits) {
//        println(fruit)
//    }
//    val messy = "word1,word2;word3|word4"
//    val parts = messy.split(",", ";", "|")
//    println(parts)
//    val fullName = "Иванов Иван"
//    val parts = fullName.split(" ")
//    val lastName = parts[0]
//    val firstName = parts[1]
//    println("Фамилия: $lastName, Имя: $firstName")
    print("Введите числа через пробел: ")
    val input = readln()
    val numbers = input.split(" ")
    var sum = 0
    for (number in numbers) {
        sum += number.toInt()
        println("Сумма чисел: $sum")
    }
}