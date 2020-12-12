package Aquarium.ClassQuiz

class Spice(val name: String, val spiciness: String = "mild") {
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
}

fun makeSalt() = Spice("Salt")

fun main(args: Array<String>){
    val listOfSpices = listOf<Spice>(Spice("spice1"), Spice("spice2", "less"), Spice("spice3", "more"))
    val lessSpicyList = listOfSpices.filter { it.heat <= 5 }
    for(Spice in lessSpicyList){
        println("Less spicy name: ${Spice.name}")
    }
    println("Salt spice: ${makeSalt().name}")
}