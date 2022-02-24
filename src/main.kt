import kotlin.random.Random

fun enemy() : String{
    var rps : String = Random.nextInt(0, 3).toString()
    return rps
}

fun main() {
    print("[R]ock, [P]aper or [S]cissors? ")
    var player : String = readLine().toString().uppercase()

    when (player) {
        "R" -> println("you chose rock!")
        "P" -> println("you chose paper!")
        "S" -> println("you chose scissors!")
    }
}