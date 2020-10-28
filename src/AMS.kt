import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]} !!")
    dayOfWeek()

    val isUnit = println("This is an expression")
    println(isUnit)

    val temp = 50;
    var result = if (temp > 30) true else false
    println(result)

    val resultStr = "The temp is ${ if (temp > 30) "hot" else "cold"} "
    println(resultStr)

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

fun feedTheFish(){
    val day = "Tuesday"
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}