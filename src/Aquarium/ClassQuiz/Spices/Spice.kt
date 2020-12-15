package Aquarium.ClassQuiz.Spices

abstract class Spice(val name: String, val spiciness: String = "mild") {
    var heat: Int = 0
        get() {
            return when(spiciness){
                "less" -> 2
                "mild" -> 5
                "more" -> 8
                else -> 1
            }
        }

    init {
        println("Name: ${name}, spiciness: ${spiciness}")
    }

    abstract fun prepareSpice()
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    abstract val color: String
}

object YellowSpiceColor: SpiceColor {
    override val color: String = "Yellow"
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor): Spice(name, spiciness), Grinder, SpiceColor by color{

    override fun grind() {
        println("Grinding")
    }

    override fun prepareSpice() {
        println("Preparing spice")
        grind()
    }
}

object RedSpiceColor: SpiceColor{
    override val color = "Red"
}

fun main(args: Array<String>){
    val curry = Curry("curry1", "less")
    println("Curry color: ${curry.color}")

    val curry2 = Curry("curry2", "more", RedSpiceColor)
    println("Curry color: ${curry2.color}")
}