package Aquarium

// Interface Delegation & Composition
// https://proandroiddev.com/composition-over-inheritance-in-kotlin-way-fe341159bf1c
/*
Composition over inheritance is an important principle in Object-oriented programming.
Instead of implementing all the functionalities of desired interfaces inside one monolithic class,
these functionalities should be implemented independently in various instances, and then use these objects to eventually empower the target class with all the provided functionalities.
This principle make the code more reusable and maintainable.
 */
fun main(args: Array<String>){
    delegate()
}

fun delegate() {
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

// "by" indicates that all calls go through that particular implementation
// default constructor argument is set to GoldColor implementation
// FishAction too has an implementation
class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("a lot of algae"),
    FishColor by fishColor

// Mimicks singleton pattern, only one object can be created
// "object" keyword is used to indicate that it is a singleton class
object GoldColor: FishColor {
    override val color = "gold"
}

object RedColor: FishColor {
    override val color = "red"
}

// Since there is a member variable food whose value can differ, class cannot be declared as singleton (cannot use "object" keyword)
// This will be useful when using different values of food
class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}

