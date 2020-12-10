fun main(args: Array<String>){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    println("Sorted by Length ${spices.filter { true }.sortedBy { it.length }}")
    println("Spices that start with 'c' and end with 'e', method1 ${spices.filter { it.startsWith('c')}.filter { it.endsWith('e') }}")
    println("Spices that start with 'c' and end with 'e', method2 ${spices.filter { it.startsWith('c') && it.endsWith('e') }}")
    println("Take first 3 elements and return the ones which start with c ${spices.take(3).filter { it.startsWith('c') }}")
//    for(i in 1..10){
//        var fortune = getFortuneCookie(getBirthday())
//        println("Fortune: " + fortune)
//        if(fortune.contains("Take it easy") ){
//            break
//        }
//    }
//    var fortune: String = ""
//    repeat(10){
//        fortune = getFortuneCookie(getBirthday())
//        println("\n Your fortune is: $fortune")
//        if(fortune.contains("Take it easy")) break;
//    }

    // Function parameters default arguments
//    println("Your mood today ? : ")
//    println(whatShouldIDoToday(readLine()!!))
//    println(whatShouldIDoToday("happy"))
//    println(whatShouldIDoToday("sad"))
//    println(whatShouldIDoToday("happy", weather = "cloudy"))
//    println(whatShouldIDoToday("sad", "rainy", 0))
//    println(whatShouldIDoToday(mood = "exciting", temperature = 40))
}

fun getFortuneCookie(birthday: Int?): String{
    val cookieFortunes = mutableListOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    return when(birthday){
        28, 31 -> cookieFortunes[0]
        in 1..7 -> cookieFortunes[2]
        else -> cookieFortunes[5]
    }
}

fun getBirthday(): Int?{
    print("Enter your birthday: ")
    var input: String? = readLine()
    var birthday = input!!.toIntOrNull()
    return birthday
}

/**
 * mood == "sad" && weather == "rainy" && temperature == 0
 * -> "stay in bed"
 * temperature > 35 -> "go swimming"
 */

fun isHappySunny(mood: String, weather: String) = (mood == "happy" && weather == "sunny")

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String{

    fun isSadRainyCold() = (mood == "sad" && weather == "rainy" && temperature == 0)
    fun isSwimmingFeasible(temperature: Int) = temperature > 35

    return when {
        isHappySunny(mood, weather) -> "go for walk"
        isSadRainyCold() -> "stay in bed"
        isSwimmingFeasible(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}