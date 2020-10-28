fun main(){
    for(i in 1..10){
        var fortune = getFortuneCookie();
        println("Fortune: " + fortune)
        if(fortune.contains("Take it easy") ){
            break
        }
    }
}

fun getFortuneCookie(): String{
    val cookieFortunes = mutableListOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    print("Enter your birthday: ")
    var input: String? = readLine()
    var birthday = input!!.toIntOrNull()
    birthday = birthday?.rem(cookieFortunes.size) ?: 1
    return cookieFortunes[birthday]
}