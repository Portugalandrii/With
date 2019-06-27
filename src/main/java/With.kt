import java.util.*
var n:Int=2
var list:MutableList<Int> = ArrayList<Int>()
fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    println("Enter a number: ")
    var a: Int = reader.nextInt()
    naturalNumber(list,a)
}
fun naturalNumber(list:MutableList<Int>, number:Int):MutableList<Int>{
var a = number
    do {
        if (a % n == 0 && a / n >= 2){
            a=a/n
            list.add(n)
        }
        else {
            do
                n++
            while (!isprime(n))
        }
    } while (a / n > 2)
    list.add(a)
    println(list)
    return list
}
fun isprime(n: Int): Boolean {
    if (n == 1)
        return false
    for (d in 2..(n - 1)) {
        if (n % d == 0)
            return false
    }
    return true;
}