package basicsyntax

fun main() {
    val temps: Array<Float> = arrayOf(23.5f, -2.0f, 17.3f, 42.1f, 8.5f)
    print(convertToFarenheit(temps).contentToString())
}
fun convertToFarenheit(temperatures: Array<Float>): Array<Float> {
    var convertedTemp: Float
    for(i in 0..temperatures.size - 1) {
        val temp = temperatures[i]
        convertedTemp = (temp * 9/5) + 32
        temperatures[i] = convertedTemp
    }
    return temperatures
}