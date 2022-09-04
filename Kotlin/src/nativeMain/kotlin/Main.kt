import kotlin.random.Random

fun calculatePi(n: Int): Double {
    var counter = 0

    for (i in 0..n) {
        var x = Random.nextDouble()
        var y = Random.nextDouble()
        if (x * x + y * y < 1) {
            counter += 1
        }
    }
    return 4.0 * (counter).toDouble() / (n).toDouble()
}


fun main() {
    var numberOfIterations = 1_000_000
    var result = calculatePi(numberOfIterations)
    println(result)
}