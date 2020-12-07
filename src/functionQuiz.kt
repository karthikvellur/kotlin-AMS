fun main(args: Array<String>){
    for(i in 1..10){
        var fortune = getFortuneCookie(getBirthday());
        println("Fortune: " + fortune)
        if(fortune.contains("Take it easy") ){
            break
        }
    }

    // Function parameters default arguments
    println(whatShouldIDoToday("happy"));
    println(whatShouldIDoToday("sad"));
    println(whatShouldIDoToday("happy", weather = "cloudy"));
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

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String{
    return when {
        mood.equals("happy") && weather.equals("sunny") -> "go for walk"
        else -> "Stay home and read."
    }
}