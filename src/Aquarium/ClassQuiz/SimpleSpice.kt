package Aquarium.ClassQuiz

class SimpleSpice {

    var spice: String = "curry"
    var spiciness: String = "mild"
    var heat: Int = 0
        get(){
            return when (spiciness){
                "less" -> 2
                "mild" -> 5
                "more" -> 8
                else -> 1
            }
        }

}

fun main(args: Array<String>){
    val simpleSpice = SimpleSpice()
    simpleSpice.spiciness = "less"

    println("Spiciness: ${simpleSpice.spiciness}")
    println("heat: ${simpleSpice.heat}")
}