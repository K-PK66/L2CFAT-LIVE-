private fun readInts() = readWords().map { it.toInt() }
private fun readLongs() = readWords().map { it.toLong() }
private fun readWords() = readln().split(" ")
private fun readInt() = readln().toInt()
private fun readLong() = readln().toLong()
private fun readln() = kotlin.io.readLine()!!
fun main(){
    val (a,b,c)=readInts()
    if(a*b==c){
        println("Yes")
        println("$a $b $c")
    }
    else if(a*c==b){
        println("Yes")
        println("$a $c $b")
    }
    else if(b*c==a){
        println("Yes")
        println("$b $c $a")
    }
    else{
        println("No")
    }
}
