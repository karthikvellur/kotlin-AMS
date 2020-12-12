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

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium: ${smallAquarium.volume} litres")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("Small Aquarium 2: ${myAquarium2.volume} litres with, " +
            "Length: ${myAquarium2.length} " +
            "Width: ${myAquarium2.width} " +
            "Height: ${myAquarium2.height} "
            )
}