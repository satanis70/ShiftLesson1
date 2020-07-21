
fun main() {
    val city = getCity()
    val temp = solution()

    println("В городе $city сейчас $temp")
}

private fun getCity(): String {
    println("В каком городе ты живешь?")
    return readLine() ?: throw error("Введите название города")
}
private fun getTemperature(): Int{
    println("Введите температуру")
    return readLine()?.toIntOrNull() ?: throw error("Введите число")
}

private fun solution(): String =
    when(getTemperature()){
        in -50..15 -> "Холодно"
        in 15..25 -> "Нормально"
        in 25..50 -> "Жарко"
        else -> "Катастрофа"
    }


