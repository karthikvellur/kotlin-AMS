import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]} !!")
//    feedTheFish()
    println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(3,3,3), 3))
    println(canAddFish(10.0, listOf(), 7 , true))
}

fun dayOfWeek(){
    println("What day is it today?")
    println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    when(Calendar.getInstance().get(4)){
        3 -> println("Tuesday")
        else -> println("Not Tuesday")
    }
}

// Good practice to have default arguements at the end
fun shouldChangedWater(
        day: String,
        temperature: Int = 50,
        dirty: Int = 20) : Boolean {
    return true
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    shouldChangedWater(day, 20, 50)
    shouldChangedWater(day, 20)
    shouldChangedWater(day, dirty=50)
    if(shouldChangedWater(day="Monday")){
        println("Change the water today")
    }
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String) : String {
    var food = "fasting"

    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }

}

fun canAddFish(tankSize: Double, currentFishList: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true) : Boolean{
    // 1. Get currentFishList size
    var totalCurrentFishSize = 0
    for(currentFishSize in currentFishList){
        totalCurrentFishSize += currentFishSize
    }
    var expectedTotalFishSize = totalCurrentFishSize + fishSize

    if(hasDecorations && (expectedTotalFishSize <= tankSize*0.8)){
        return true
    }else if(!hasDecorations && (expectedTotalFishSize <= tankSize)){
        return true
    }

    return false
}