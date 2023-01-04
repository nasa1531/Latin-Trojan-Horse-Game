import kotlin.system.exitProcess

fun main() {
    println("Salve, and welcome to the Trojan Horse Game!")
    print("This is a terminal based adventure game written (for the most part) in Latin. You will play as Aeneas, and will go through the events around the Trojan Horse and the destruction of Troy. You will have to interact with the terminal using your keyboard to instruct your character on what to do. There are multiple ways your quest may end, both good and bad. Good luck! To start, enter 1 into the terminal to select the normal game: ")
    when (readln()) {
        "1" -> { aeneasMainGame() }
        "2" -> {
            // This is for testing purposes
            println("Player Health: ")
            val health1 = readln().toInt()
            println("Opponent Health: ")
            val health2 = readln().toInt()
            when (combatSystem(health1, health2)) {
                true -> { println("Win") }
                false -> { println("Loss") }
            }
        }
        else -> {
            print("Uh oh! There may be some error here. Try again with a potentially more valid input, and if the issue persists, ask for help.")
            exitProcess(1)
        }
    }
}

fun aeneasMainGame() {
    var playerhealth = 200
    println("The game is beginning!")
    Thread.sleep(500)
    println("Everything from this point forward (except error messages, but hopefully none of those will appear) will be in Latin.")
    Thread.sleep(2000)
    println("Good luck!")
    Thread.sleep(500)
    println("(press enter to continue)")
    readln()
    println("Vides magnum ligneum equum.")
    readln()
    println("Equus est a portā Troiae.")
    readln()
    println("Cassandra et Laocoon narrant equum est malum.")
    readln()
    println("Cogitant Ulixem facibat equum et equus est decipulam.")
    readln()
    println("Ulixes dux Graecorum habet militiam fortem.")
    readln()
    print("Cogitas equum est malum? Ita? Non?: ")
    when (readln()) {
        "non","Non" -> {
            print("\n.")
            Thread.sleep(500)
            print(".")
            Thread.sleep(500)
            println(".")
            Thread.sleep(500)
            println("Nam magnus ligneus equus est in urbe.")
          }
        "ita","Ita" -> {
            println("\nNarras equum est malum, sed populus cogitant est donum et offertoriam ad deis.")
            readln()
            println("Populus aperit portam.")
            readln()
            print(".")
            Thread.sleep(500)
            print(".")
            Thread.sleep(500)
            println(".")
            Thread.sleep(500)
            println("\nNam magnus ligneus equus est in urbe.")
            readln()
            println("Paras pro pessimo.")
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
    println("Audis pugnas.")
    readln()
    print("Inquires? Ita? Non?: ")
    when (readln()) {
        "non","Non" -> {
            println("\nDormis.")
            readln()
            println("Miles intrat.")
            readln()
            println("Necaris a milito.")
            readln()
            println("Omnia venit ad termino.")
            readln()
            println("You have died. Try again next time! Vale!")
            exitProcess(3)
        }
    }
    println("\nTu ambulas ad viam.")
    readln()
    println("Vides armati viri necant Troianos gladiis.")
    readln()
    print("Pugnas? Ita? Non?: ")
    when (readln()) {
        "ita","Ita" -> {
            var remainingattempts = 5
            while (remainingattempts > 0) {
                println()
                if (!combatSystem(playerhealth, 220)) {
                    println("\nNecaris a armatis viris.")
                    readln()
                    println("Omnia venit ad termino.")
                    readln()
                    println("You have died. Try again next time! Vale!")
                    exitProcess(3)
                }
                remainingattempts -= 1
                if (remainingattempts == 0) { break }
                playerhealth -= 20
                println("\nNecas armatum virum cum furore.")
                readln()
                println("Audis multi armati viri.")
                readln()
                print("Pugnas? Ita? Non?: ")
                if (readln() == "non") { aeneasEscape() }
            }
            println("Necas armatum virum cum furore.")
            readln()
            println("Non audis armati viri.")
            readln()
            println("Omnes milites sunt mortui.")
            readln()
            println("Urbs Troianorum stat.")
            readln()
            println("Congratulations! You have won the Trojan Horse Game! That is quite the accomplishment, especially since you won it by going down the most difficult path. Hopefully you did not encounter any errors along your journey, weather they were in the code or in my Latin. Vale!")
            exitProcess(2)
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
            println("\nFugis urbem currisque ad montes.")
            readln()
            println("Convenis Troianos alios in montibus et videre mare.")
            readln()
            println("Decernis agere Troianos et condere novum Troianum in alia terra.")
            readln()
            println("Congratulations! You have won the Trojan Horse Game! Hopefully you did not encounter any errors along your journey, weather they were in the code or in my Latin. Vale!")
            exitProcess(2)
        }
        2 -> {
            println("Necaris a milito.")
            readln()
            println("Omnia venit ad termino.")
            readln()
            println("You have died. Try again next time! Vale!")
            exitProcess(3)
        }
    }
}

fun combatSystem(playerhealth: Int, opponenthealth: Int): Boolean {
    // temporary (now permanent, the more elegant solutions are unnecessary for this) solution to problem with the arguments sent to this function being immutable by default (this whole function is a mess!)
    var tempplayerhealth = playerhealth
    var tempopponenthealth = opponenthealth
    var giveinstructions = true
    while (true) {
        val playerroll = (1..12).random()
        val playerdamageroll = playerroll*((1..12).random())
        val opponentroll = (1..12).random()
        val opponentdamageroll = opponentroll*((1..12).random())
        tempplayerhealth -= opponentdamageroll
        tempopponenthealth -= playerdamageroll
        println("Aeneas: $playerdamageroll,$tempplayerhealth"+
                "\nAdversator: $opponentdamageroll,$tempopponenthealth") // CHECK "tu"
        if (tempplayerhealth <= 0) {
            return(false)
        } else if (tempopponenthealth <= 0) {
            return(true)
        }
        if (giveinstructions) {
            giveinstructions = false
            println("(Press enter to go again)")
            readln()
        } else { readln() }
    }
}