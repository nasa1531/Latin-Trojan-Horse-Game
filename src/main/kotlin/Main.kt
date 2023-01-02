import kotlin.system.exitProcess

fun main() {
    println("Welcome to the Trojan Horse Game!")
    print("You can choose to play from a two  perspectives. Enter 1 for Aeneas, and enter 2 for a random Greek solder: TEMP: Enter 3 for combat testing and 4 for experiments ")
    when (readln()) {
        "1" -> { aeneasMainGame() }
        "2" -> { characterTwoGame() }
        "3" -> {
            // This is for testing purposes
            println("Player Health: ")
            val health1 = readln().toInt()
            println("Opponent Health: ")
            val health2 = readln().toInt()
            println("Opponent Name: ")
            val name = readln()
            when (combatSystem(health1, health2, name)) {
                true -> { println("Win") }
                false -> { println("Loss") }
            }
        }
        "4" -> { experiments() }
        else -> {
            print("Uh oh! There may be some error here. Try again with a potentially more valid input, and if the issue persists, ask for help.")
            exitProcess(1)
        }
    }
}

fun aeneasMainGame() {
    var playerhealth = 200
    print("You chose to play as Aeneas!\n" +
            "Your goal as Aeneas is to first try and defend Troy, and if that fails, try to bring your people to the sea, where you can then bring them to another land.\n" +
            "(press enter to continue)")
    readln()
    println("The game is beginning!\n" +
            "Everything from this point forward (except error messages, but hopefully none of those will appear) will be in Latin.\n" +
            "Good luck!")
    readln()
    println("Vides magnum ligneum equum.")
    readln()
    println("Magnus ligneus equus est ab portam.")
    readln()
    println("Cassandra et Laocoon narrant magnum ligneum equum est malum.")
    readln()
    print("Cogitas magnum ligneum equum est malum? Ita? Non?: ")
    when (readln()) {
        "non","Non" -> {
            println("\n...(ADD SOMETHING ABOUT TIME PASSING)")
            readln()
            println("Nam magnus ligneus equus est in urbe.")
          }
        "ita","Ita" -> {
            println("\nNarras magnum ligneum equum est malum, sed populus cogitant est donum et vulnt(check) est.")
            readln()
            println("...(ADD SOMETHING ABOUT TIME PASSING)")
            readln()
            println("Nam magnus ligneus equus est in urbe.")
            readln()
            println("Paras nam pessime.")
            playerhealth += 50
          }
        else -> {
            print("Uh oh! An error has occurred. You probably entered an invalid input. Try again and watch your spelling!")
            exitProcess(1)
        }
    }
    readln()
    println("Nox venit.")
    readln()
    println("Audis pugnam.")
    readln()
    print("Inquires? Ita? Non?: ")
    when (readln()) {
        "non","Non" -> {
            println("Dormis.")
            readln()
            println("Miles intrat.")
            readln()
            println("Necaris a milito.")
            readln()
            println("You have died. Try again next time!")
            exitProcess(1)
        }
    }
    println("Tu ambulas ad viam.")
    readln()
    println("Vides armati viri necant Troianos.")
    readln()
    print("Pugnas? Ita? Non?: ")
    when (readln()) {
        "ita","Ita" -> {
            var remainingattempts = 5
            while (remainingattempts > 0) {
                if (combatSystem(playerhealth, 220, "Armati Viri") == false) {
                    println("Necaris a armatis viris.")
                    readln()
                    println("You have died. Try again next time!")
                    exitProcess(1)
                }
                remainingattempts -= 1
                if (remainingattempts == 0) { break }
                playerhealth -= 20
                println("Necas armatum virum cum furore.")
                readln()
                println("Audis multi armati viri.")
                readln()
                print("Pugnas? Ita? Non?: ")
                if (readln() == "non") { aeneasEscape() }
            }
            println("VICTORY")
        }
        "non","Non" -> { aeneasEscape() }
        else -> {
            print("Uh oh! An error has occurred. You probably entered an invalid input. Try again and watch your spelling!")
            exitProcess(1)
        }
    }
}

fun aeneasEscape() {
    when ((1..2).random()) {
        1 -> {
            println("Fugis urbem currisque ad montibus.")
            readln()
            println("")
        }
        2 -> {
            // Add failure
            println("You died trying to escape ADD LATIN")
        }
    }
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
    println("Add")
}

fun combatSystem(playerhealth: Int, opponenthealth: Int, opponentname: String): Any {
    // temporary solution to problem with apparently immutable variables (this whole function is a mess!)
    var tempplayerhealth = playerhealth
    var tempopponenthealth = opponenthealth
    while (1 == 1) {
        var playerroll = (1..12).random()
        var playerdamageroll = playerroll*((1..12).random())
        var opponentroll = (1..12).random()
        var opponentdamageroll = opponentroll*((1..12).random())
        tempplayerhealth -= opponentdamageroll
        tempopponenthealth -= playerdamageroll
        println("Tu: $playerdamageroll,$tempplayerhealth"+
                "\n$opponentname: $opponentdamageroll,$tempopponenthealth") // CHECK "tu"
        if (tempplayerhealth <= 0) {
            return(false)
        } else if (tempopponenthealth <= 0) {
            return(true)
        }
        println("(Press enter to go again)")
        readln()
    }
    // Temporary solution to some random problem ive never seen before
    return(println("Uh Oh! An error has occurred. Tell the developer that 1 is not equal to 1. Please try again doing something differently and see if it repeats."))
}

fun experiments() {
    // This is for testing experimental things, and should not be there in the final version
}