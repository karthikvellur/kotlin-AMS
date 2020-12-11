package Aquarium

class Aquarium {

    // Everything is public by default
    // Visibility: https://kotlinlang.org/docs/reference/visibility-modifiers.html

    var width: Int = 20
    var height: Int = 20
    var length: Int = 20

    //Over-riding default getter
    var volume: Int
            get() = width * height * length / 1000
            set(value) {height = (value * 1000) / (width * length)}
}