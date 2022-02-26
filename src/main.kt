import kotlin.random.Random

fun play(): Int{
    print("[R]ock, [P]aper or [S]cissors? ")
    var player : String? = readLine().toString().uppercase()

    when (player) {
        "R" -> println("you chose rock!\n")
        "P" -> println("you chose paper!\n")
        "S" -> println("you chose scissors!\n")
        else -> {
            println("$player is not an option.\n")
            player = null
        }
    }

    val enemy : String = Enemy()
    when {
        player == null -> Unit
        enemy == "0" -> println("enemy chose rock!\n")
        enemy == "1" -> println("enemy chose paper!\n")
        enemy == "2" -> println("enemy chose scissors!\n")
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
        else -> return play()
    }
}

fun Enemy() : String{
    val rps : String = Random.nextInt(0, 3).toString()
    return rps
}

fun main() {
    var score = 0
    for (i in 1..3) {
        when(play()){
            0 -> println("Round $i : Draw\n")
            1 -> {
                score = score + 1
                println("Round $i : You Win!\n")
            }
            -1 -> {
                score = score - 1
                println("Round $i : You Lose!\n")
            }
        }
    }

    when {
        score < 0 -> println("End Result : You Lose!\n")
        score == 0 -> println("End Result : Draw\n")
        score > 0 -> println("End Result : You Win!\n")
    }
}