
import Die
fun main(){
var newGame = DiceGame()
    newGame.print()

}

class DiceGame{
 fun print(){
//     create dice with 0 paramenters
     var d1 = Die()
     println("Creating a default dice d${d1.numberOfSides}...")

//     create dice with 1 parameter
     var d2 = Die(numberOfSides = 20)
     println("Creating a d${d2.numberOfSides}...")

//     create dice with 2 parameters
     var d3 = Die(type="Pentagon", numberOfSides = 5)
     println("Creating ${d3.type} die (a special d${d3.numberOfSides})...")

     println("The current side up for d${d1.numberOfSides} is ${d1.currentSide}")
     println("The current side up for d${d2.numberOfSides} is ${d2.currentSide}")
     println("The current side up for d${d3.numberOfSides} is ${d3.currentSide}")

     println("\nTesting the roll method")

     println("\nRolling the d${d1.numberOfSides}...")
//     for d1 dice
     d1.roll()
     println("The new value is ${d1.currentSide}")
     println("Rolling the d${d2.numberOfSides}...")
//     for d2 dice
     d2.roll()
     println("The current side up for d${d2.numberOfSides} is ${d2.currentSide}")
//     for d3 dice
//     Roll the d3 dice
     d3.roll()
     println("Rolling the ${d3.type}...")
     println("The new value is ${d3.currentSide}")

     d2.currentSide = d2.numberOfSides
    println("\nSetting the d${d2.numberOfSides} to show ${d2.currentSide}...")
    println("The sid up is now ${d2.currentSide}.")



 }
}