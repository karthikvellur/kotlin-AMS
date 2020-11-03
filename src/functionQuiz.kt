fun main(){
    for(i in 1..10){
        var fortune = getFortuneCookie(getBirthday());
        println("Fortune: " + fortune)
        if(fortune.contains("Take it easy") ){
            break
        }
    }
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
        28 -> cookieFortunes[0]
        31 -> cookieFortunes[0]
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