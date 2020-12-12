package Aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {

    // friendly is defined with val, so it becomes a property of the class
    // volumeNeeded is not defined with val or var, so it does NOT become a property of the class

    val size: Int

    init {
        println("first init block")
    }

    constructor(): this(true, 9){
        println("running secondary constructor")
    }


    init {
        if (friendly){
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }

    init {
        println("constructed fish of size $volumeNeeded final size ${this.size}")
    }

    init {
        println("last init block")
    }
}

fun fishExample(){
    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
}

fun main(args: Array<String>){
    val fish = Fish(false, 10)
}