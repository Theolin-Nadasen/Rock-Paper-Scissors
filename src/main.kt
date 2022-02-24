import kotlin.random.Random

fun play(): Int{
    print("[R]ock, [P]aper or [S]cissors? ")
    val player : String = readLine().toString().uppercase()

    when (player) {
        "R" -> println("you chose rock!")
        "P" -> println("you chose paper!")
        "S" -> println("you chose scissors!")
        else -> println("$player is not an option.")
    }

    val enemy : String = Enemy()
    when (enemy) {
        "0" -> println("enemy chose rock!")
        "1" -> println("enemy chose paper!")
        "2" -> println("enemy chose scissors!")
    }

    val result = "$player$enemy"
    when (result) {
        "R0" -> return 0
        "R1" -> return -1
        "R2" -> return 1
        "P0" -> return 1
        "P1" -> return 0
        "P2" -> return -1
        "S0" -> return -1
        "S1" -> return 1
        "S2" -> return 0
        else -> return 0
    }
}

fun Enemy() : String{
    val rps : String = Random.nextInt(0, 3).toString()
    return rps
}

fun main() {
    var score = 0
    for (i in 1..3) {
        score = score + play()
    }

    when {
        score < 0 -> println("you lose!")
        score == 0 -> println("draw")
        score > 0 -> println("you win!")
    }
}