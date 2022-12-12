fun main() {
    println("Welcome to the Trojan Horse Game!")
    // Add explanation & instructions on how to play here
    println("You can choose to play from a two  perspectives. Enter 1 for ADD, and enter 2 for ADD:") // Add
    when (readln()) {
        "1" -> { characterOneSetup() }
        "2" -> { characterTwoSetup() }
        else -> { println("Uh oh! There may be some error here. Try again with a potentially more valid input, and if the issue persists, ask for help.") }
    }
}

fun characterOneSetup() {
    println("You chose ADD!")
    // Add
    characterOneGame()
}

fun characterTwoSetup() {
    println("You chose ADD!")
    // Add
    characterTwoGame()
}

fun characterOneGame() {
    println("The game is beginning!")
}

fun characterTwoGame() {
    println("The game is beginning!")
}