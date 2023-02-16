import javax.print.attribute.standard.Sides

class Die{
    var type: String = "d6"
    var numberOfSides: Int = 6
    constructor(){
        this.type = "d6"
        this.numberOfSides = 6
    }
    constructor(noOfSides: Int){
        this.numberOfSides = numberOfSides
        this.type = "d$numberOfSides"
    }
    fun roll(){

    }
}