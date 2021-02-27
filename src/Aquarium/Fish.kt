package Aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {

    // friendly is defined with val, so it becomes a property of the class
    // volumeNeeded is not defined with val or var, so it does NOT become a property of the class

    // Best practice is to use one constructor and init blocks
    // Use helper functions with default values instead of creating constructors with different default value or additional arguments

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

/**
 * Helper Function (Instead of default constructor)
 * Make use of the functions instead of declaring one more constructor having default values
 * Basically, since default values can be assigned in constructors, no need to declare default constructors
 *  ***** For good Kotlin code, one constructor with helper functions is sufficient *****
 */
fun makeDefaultFish() = Fish(true, 50)

fun fishExample(){
    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
}

fun main(args: Array<String>){
    val fish = Fish(false, 10)
    makeDefaultFish()
}