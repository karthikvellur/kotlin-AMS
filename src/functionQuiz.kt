fun main(){
    println(getFortuneCookie())
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
    println("birthday: " + birthday)
    println("cookieFortunes.size: " + cookieFortunes.size)
    println("rem: " + birthday?.rem(cookieFortunes.size))
    birthday = birthday?.rem(cookieFortunes.size) ?: 1
    return cookieFortunes[birthday]
}