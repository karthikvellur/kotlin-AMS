import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]} !!")
    feedTheFish()
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