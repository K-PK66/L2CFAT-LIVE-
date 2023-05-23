import java.util.*
import java.lang.*
fun main (){
    val X=Integer.valueOf(readLine())
    if(X<100){
        println("No")
    }
    else if(X % 100!=0){
        println("No")
    }
    else{
        println("Yes")
    }
}
