fun main() {
    var password: String?

    do {
        print("Введите пароль: ")
        password = readln()
    } while (password != "qwerty")

    println("Доступ разрешен!")
}