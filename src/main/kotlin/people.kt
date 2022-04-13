fun main() {

    print("Введите колличество лайков: ")
    val likes = readLine()?.toUInt() ?: return

    if (likes == 1u || likes % 10u == 1u && likes % 100u != 11u) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}
