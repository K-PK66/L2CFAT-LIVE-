import java.*
import kotlin.*
private fun readInts() = readWords().map { it.toInt() }
private fun readLongs() = readWords().map { it.toLong() }
private fun readWords() = readln().split(" ")
private fun readInt() = readln().toInt()
private fun readLong() = readln().toLong()
private fun readln() = kotlin.io.readLine()!!
fun main(){
    val(N,K,A)=readInts()
    val lastRoundRemain = K%N+A-1
    if(lastRoundRemain==0){
        println(1)
    }
    else if(lastRoundRemain>N){
        println(lastRoundRemain-N)
    }
    else {
        println(lastRoundRemain)
    }
}
