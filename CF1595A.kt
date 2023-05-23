import java.util.*
import java.lang.*

fun main () {
    var n : Int = Integer.valueOf(readLine())
    if(n % 3 != 0){
        println(-1)
    }
    else{
        var b : Int = n / 3
        var a : Int = b - 1
        var c : Int = b + 1
        println("$a $b $c")
    }

}
