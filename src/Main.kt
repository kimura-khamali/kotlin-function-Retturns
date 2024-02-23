
//Functions
fun main() {
    text(test = "Ada")
    nameOf(num1 =26,
     num2 = 3)
     sumAll(num1 = 1 , 2 ,  3 ,num4= 4)
     interestingFact(set = "I love drawing and hiking")
}

fun text(test: String){
var text = "Hello ${test}"
    println(text)
}

fun nameOf(num1: Int , num2: Int ): Int {
    var result = num1 %num2
    println(result)
return (result)
}


fun sumAll(num1: Int ,num2: Int ,num3: Int ,num4: Int):Int {
    val sum = num1 + num2 + num3 + num4
    println(sum)
    return sum
}

fun interestingFact(set: String) {
    println(set)
}


