import kotlin.system.exitProcess

fun main() {
    println("Welcome to the Trojan Horse Game!")
    print("You can choose to play from a two  perspectives. Enter 1 for Aeneas, and enter 2 for a random Greek solder: ")
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
    print("Cogitas magnum ligneum equum est malum? Ita? Non?: ")
    when (readln()) {
      "non" -> {
        println("\nNam magnus ligneus equus est in urbe.")
      }
      "ita" -> {
        println("\nNarras magnum ligneum equum est malum, sed populus cogitant est donum et vulnt(check) est.")
        readln()
        println("Nam magnus ligneus equus est in urbe.")
        readln()
        println("Paras nam pessime.")
      }
        else -> {
            print("You had to enter either ita or non (lowercase) for that to work. Now you have to restart because I do not have time to learn how to implement some way of going back without it being clumsy and annoying. Sorry.")
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
        "non" -> {
            println("Dormis.")
            readln()
            println("Miles intrat et necat tu.")
            readln()
            println("You have died. Maybe you should try again without making a very silly mistake?")
            exitProcess(1)
        }
    }
    println("Add")
    readln()
    println("Vides armati viri necant Troianos.")
    readln()
    print("Pugnas? Ita? Non?: ")
    when (readln()) {
        "ita" -> {
            combatSystem(100, 200)
        }
        "non" -> {
            when ((1..3).random()) {
                1,2 -> {
                    // Add success
                    println("You escaped ADD LATIN")
                }
                3 -> {
                    // Add failure
                    println("You died trying to escape ADD LATIN")
                }
            }
        }
        else -> {
            print("You had to enter either ita or non (lowercase) for that to work. Now you have to restart because I do not have time to learn how to implement some way of going back without it being clumsy and annoying. Sorry.")
            exitProcess(1)
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
    println("This is incomplete, and you should know that, so I will presume you accidentally typed in the wrong thing and will send you to the correct place")
    characterOneGame()
}

fun combatSystem(playerhealth: Int, opponenthealth: Int) {
    // temporary solution to problem with apparently immutable variables (this whole function is a mess!)
    var tempplayerhealth = playerhealth
    var tempopponenthealth = opponenthealth
    while (tempplayerhealth == tempplayerhealth) {
        var playerroll = (1..12).random()
        var playerdamageroll = playerroll*((1..12).random())
        var opponentroll = (1..12).random()
        var opponentdamageroll = opponentroll*((1..12).random())
        tempplayerhealth -= opponentdamageroll
        tempopponenthealth -= playerdamageroll
        println("You did $playerdamageroll damage, and your opponent did $opponentdamageroll. You have $tempplayerhealth health remaining, and your opponent has $tempopponenthealth.")
        if (tempplayerhealth <= 0) {
            return(println("Add Latin for Loss!"))
        } else if (tempopponenthealth <= 0) {
            return(println("Add Latin for Win!"))
        }
        println("Press enter to go again")
        readln()
    }
}