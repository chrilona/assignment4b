fun main(){
    println(findSum(arrayOf(7.0,3.3,33,false,"lona")))
    println(findProduct(arrayOf(3,4,2)))

    println(takeCharacters(arrayOf('a','b','c','d','e','f','g','h','i','j','h','i','j','k','o','u')))

}
fun findProduct(digits:Array<Int>):Int{
    var product = 1
    digits.forEach { digit->
        product*=digit
    }
    return product
}
fun findSum(numbers:Array<Any>):Double {
    var sum = 0.0
    numbers.forEach { num ->
        if (num is Double) {
            sum += num
        }
    }
    return sum
}



fun takeCharacters(lineS:Array<Char>):Int {
    var total = 0
    lineS.forEach { line ->
        if (line == 'a' || line == 'e' || line == 'i' || line == 'o' || line == 'u') {
            total++
        }

    }
    return total

}