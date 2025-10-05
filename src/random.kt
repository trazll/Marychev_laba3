import kotlin.random.Random
fun main() {
//    val target = Random.nextInt(1, 100)
//    println("Угадай число от 1 до 100")
//    while (true) {
//        print("Введи число: ")
//        val input = readln().toInt()
//        when {
//            input < target -> println("Загадочное число больше.")
//            input > target -> println("Загадочное число меньше.")
//            else -> {
//                println("Поздравляю! Ты угадал число: $target")
//                break
//            }
//        }
//    }
//    val dice1 = Random.nextInt(1, 7)
//    val dice2 = Random.nextInt(1, 7)
//    val sum = dice1 + dice2
//    println("Первый кубик: $dice1")
//    println("Второй кубик: $dice2")
//    println("Сумма: $sum")

    val num1 = Random.nextDouble(0.0, 10.0)
    val num2 = Random.nextDouble(0.0, 10.0)
    val num3 = Random.nextDouble(0.0, 10.0)
    val avg = (num1 + num2 + num3) / 3
    println("Числа: $num1, $num2, $num3")
    println("Среднее: $avg")
}