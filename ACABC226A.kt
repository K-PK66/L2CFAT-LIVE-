import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    val x = reader.nextDouble()
    var notDecimal:Int = 0
    val tmp = x.toInt()
    if(x-tmp<0.5){
        println(tmp)
    }
    else{
        println(tmp+1)
    }
}
