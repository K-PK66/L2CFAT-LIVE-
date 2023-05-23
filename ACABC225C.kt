import java.util.*

fun main () {
    var reader = Scanner(System.`in`)
    var N:Int
    var M:Int
    var (Nstr,Mstr) = readLine()!!.split(" ")
    N = Nstr.toInt()
    M = Mstr.toInt()
    var B = Array(N){LongArray(M)}
    for(i in 0 until N){
        for(j in 0 until M){
            B[i][j] = reader.nextLong()
        }
    }
    for(i in 0 until N){
        for(j in 0 until M){
            if(j>0 && B[i][j]-B[i][j-1]!=1.toLong()){
                println("No")
                return
            }
            if(i>0 && B[i][j]-B[i-1][j]!=7.toLong()){
                println("No")
                return
            }
            if(j>0 && B[i][j]%7 < B[i][j-1]%7 && B[i][j]%7!=0.toLong()){
                println("No")
                return
            }
            if(j>0 && B[i][j]%7==1.toLong() && B[i][j-1]%7==0.toLong()){
                println("No")
                return
            }
        }
    }
    println("Yes")
}
