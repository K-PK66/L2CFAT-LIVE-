import java.util.*
fun abs(x:Long):Long{
    if(x>=0){
        return x
    }
    else{
        return -x
    }
}
fun isOdd(x:Long):Boolean{
    if(abs(x)%2==0.toLong()){
        return false
    }
    else{
        return true
    }
}
fun main() {
    val reader = Scanner(System.`in`)
    for(i in 1..(Integer.valueOf(readLine()))) {
        var ans:Long = 0
        var x0:Long = reader.nextLong()
        var n: Long = reader.nextLong()
        ans+=x0
        //odd->(even->even->odd->odd)->(even->...
        //1 2 0 -3 1...
        //A+X-(X+1)-(X+2)+(X+3)=A
        //even->(odd->odd->even->even)->(odd->...
        //0 -1 1 4 0 ...
        //A-X+(X+1)+(X+2)-(X+3)=A
        ans += when(n%4){
            0.toLong()->0
            1.toLong()->if(isOdd(x0)){n}else{-n}
            2.toLong()->if(isOdd(x0)){-1}else{1}
            else->if(isOdd(x0)){-n-1}else{n+1}
        }
        println(ans)
    }
}
