package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium(){

    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height} " +
            "Volume: ${myAquarium.volume}")

    myAquarium.height = 80
    println("Volume update due to height change: ${myAquarium.volume}")

    myAquarium.volume = 1000
    print("Height updated due to volume change via setter. ")
    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height} " +
            "Volume: ${myAquarium.volume}")

}