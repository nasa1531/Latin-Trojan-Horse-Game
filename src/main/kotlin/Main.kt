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
    println("You chose to play as Aeneas!\n" +
            "Your goal as Aeneas is to first try and defend Troy, and if that fails, try to bring your people to the sea, where you can then bring them to another land.")
    Thread.sleep(3000)
    println("The game is beginning!\n" +
            "Everything from this point forward will be in Latin.\n" +
            "Good luck!")
    Thread.sleep(3000)
    println("Vides magnum ligneum equum.")
    Thread.sleep(2000)
    println("Magnus ligneus equus est ab portam.")
    Thread.sleep(2000)
    println("Cassandra et Laocoon narrant magnum ligneum equum est malum.")
    Thread.sleep(2000)
    print("Cogitas magnum ligneum equum est malum? Ita? Minime?: ")
    when (readln()) {
      "ita" -> { 
      println("Nam magnus ligneus equus est in urbe.")
      }
      "minime" -> { 
      println("Narras magnum ligneum equum est malum, sed populus cogitant est donum et vulnt(check) est.")
      Thread.sleep(4000)
      println("Nam magnus ligneus equus est in urbe.")
      Thread.sleep(2000)
      println("Paras nam pessime lumi (check).")
      }
    }
    Thread.sleep(2000)
    println("Nox venit.")
}

fun characterTwoGame() {
    println("You chose to play as a random Greek solder!\n" +
            "Your goal as this random Greek solder is to take over Troy, and if that succeeds, to track down and stop Aeneas and his people from escaping.")
    Thread.sleep(3000)
    println("The game is beginning!\n" +
            "Everything from this point forward will be in Latin.\n" +
            "Good luck!")
    Thread.sleep(3000)
    println("TO DO")
}