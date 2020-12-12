package Aquarium

class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    // Everything is public by default
    // Visibility: https://kotlinlang.org/docs/reference/visibility-modifiers.html

    //Over-riding default getter
    var volume: Int
            get() = width * height * length / 1000
            set(value) {height = (value * 1000) / (width * length)}

    var water = volume * 0.9

    constructor(numberOfFish: Int): this(){
        // this() --> Call to default constructor
//        val water = numberOfFish * 2000 //cm3
//        val tank = water + water * 0.1
//        height = (tank / (length * width)).toInt()
    }
}