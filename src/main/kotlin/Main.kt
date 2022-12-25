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
        "ita" -> {
            when (combatSystem(100, 100)) {
                true -> {
                    // Add win condition
                }
                false -> {
                    println("Necaris a armatis viris.")
                    readln()
                    println("You have died. Try again next time!")
                    exitProcess(1)
                }
            }
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
            print("Uh oh! An error has occurred. You probably entered an invalid input. Try again and watch your spelling!")
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

fun combatSystem(playerhealth: Int, opponenthealth: Int): Any {
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
            return(false)
        } else if (tempopponenthealth <= 0) {
            return(true)
        }
        println("Press enter to go again")
        readln()
    }
    // Temporary solution to some random problem ive never seen before
    return(println("Uh Oh! An error has occurred. Please try again doing something differently and see if it repeats."))
}