import kotlin.random.Random

class Die{
    var type: String
    var numberOfSides: Int = 6
    var currentSide: Int = 1

    constructor(){
        this.type = "d${numberOfSides}"
        this.numberOfSides = 6
        this.roll()
    }

    constructor(numberOfSides:Int){
        this.type = "d${numberOfSides}"
        this.numberOfSides = numberOfSides
        this.roll()
    }
    constructor(type:String, numberOfSides: Int){
        this.type = type
        this.numberOfSides = numberOfSides
        this.roll()
    }

    fun roll():Unit{
        this.currentSide = Random.nextInt( 1, numberOfSides +1)
    }
}