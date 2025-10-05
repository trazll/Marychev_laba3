fun main() {
    var level = 0
    println("Добро пожаловать в подземелье!")
    while (level<5){
        println("\nВы на уровне $level")
        println("Выберите действие: [1] Вперед | [2] Осмотреться | [0] сдаться")
        val input = readLine()
        when (input){

            "1" -> {
                level++
                println("Вы переходите на уровень $level")
            }
            "2" -> {
                println("Вы осматриваетесь. тут ничего интересного")
                continue
            }
            "0" -> {
                println("Вы сдались, игра окончена")
                continue
            }
            else -> {
                println("Неверный ввод, попробуйте снова")
            }
        }
        if (level == 5)
            println("Поздравляем! вы выбрались из подземелья")
    }
}