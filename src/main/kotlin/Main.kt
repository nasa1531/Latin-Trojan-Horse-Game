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
    println("You chose to play as Aeneas!\n" +
            "Your goal as Aeneas is to first try and defend Troy, and if that fails, try to bring your people to the sea, where you can then bring them to another land.")
    Thread.sleep(3000)
    println("The game is beginning!\n" +
            "Everything from this point forward will be in Latin.\n" +
            "Good luck!")
    Thread.sleep(3000)
    println("Add")
}

fun characterTwoGame() {
    println("You chose to play as a random Greek solder!\n" +
            "Your goal as this random Greek solder is to take over Troy, and if that succeeds, to track down and stop Aeneas and his people from escaping.")
    Thread.sleep(3000)
    println("The game is beginning!\n" +
            "Everything from this point forward will be in Latin.\n" +
            "Good luck!")
    Thread.sleep(3000)
    println("Add")
}