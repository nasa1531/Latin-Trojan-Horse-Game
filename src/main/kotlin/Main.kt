import kotlin.system.exitProcess

fun main() {
    println("Welcome to the Trojan Horse Game!")
    print("You can choose to play from a two  perspectives. Enter 1 for Aeneas, and enter 2 for a random Greek solder TO DO: ")
    when (readln()) {
        "1" -> { characterOneGame() }
        "2" -> { characterTwoGame() }
        else -> {
            print("Uh oh! There may be some error here. Try again with a potentially more valid input, and if the issue persists, ask for help.")
            exitProcess(1)
        }
    }
}

fun characterOneGame() {
    combatSystem()
    print("You chose to play as Aeneas!\n" +
            "Your goal as Aeneas is to first try and defend Troy, and if that fails, try to bring your people to the sea, where you can then bring them to another land.\n" +
            "(press enter to continue)")
    readln()
    println("The game is beginning!\n" +
            "Everything from this point forward will be in Latin.\n" +
            "Good luck!")
    readln()
    println("Vides magnum ligneum equum.")
    readln()
    println("Magnus ligneus equus est ab portam.")
    readln()
    println("Cassandra et Laocoon narrant magnum ligneum equum est malum.")
    readln()
    print("Cogitas magnum ligneum equum est malum? Ita? Minime?: ")
    when (readln()) {
      "ita" -> { 
        println("\nNam magnus ligneus equus est in urbe.")
      }
      "minime" -> { 
        println("\nNarras magnum ligneum equum est malum, sed populus cogitant est donum et vulnt(check) est.")
        readln()
        println("Nam magnus ligneus equus est in urbe.")
        readln()
        println("Paras nam pessime lumi (check).")
      }
    }
    readln()
    println("Nox venit.")
}

fun characterTwoGame() {
    print("You chose to play as a random Greek solder!\n" +
            "Your goal as this random Greek solder is to take over Troy, and if that succeeds, to track down and stop Aeneas and his people from escaping.\n" +
            "(press enter to continue)")
    readln()
    println("The game is beginning!\n" +
            "Everything from this point forward will be in Latin.\n" +
            "Good luck!")
    readln()
    println("TO DO")
}

fun combatSystem() {
    // temporary variables (will be defined in game function)
    val charactername = "Aeneas"
    val opponentname = "Greek Solder"
    var playerhealth = 50
    var opponenthealth = 50

    while ((playerhealth >= 0) and (opponenthealth >= 0)) {
        var playerroll = (1..12).random()
        var playerdamageroll = playerroll*((1..12).random())
        var opponentroll = (1..12).random()
        var opponentdamageroll = playerroll*((1..12).random())
        if (playerroll > opponentroll) {
            opponenthealth -= playerdamageroll
            println("Add Latin for Win $playerdamageroll, $opponenthealth")
        } else if (playerroll < opponentroll) {
            playerhealth -= opponentdamageroll
            println("Add Latin for Loss $opponentdamageroll, $opponenthealth")
        } else {
            println("Add Latin for Draw")
        }
    }
    if (playerhealth <= 0) {
        return(println("Add Latin for win!"))
    } else if (opponenthealth <= 0) {
        return(println("Add Latin for loss!"))
    }
}