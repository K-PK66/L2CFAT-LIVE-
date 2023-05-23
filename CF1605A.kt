private fun readInts() = readWords().map { it.toInt() }
private fun readLongs() = readWords().map { it.toLong() }
private fun readWords() = readln().split(" ")
private fun readInt() = readln().toInt()
private fun readLong() = readln().toLong()
private fun readln() = readLine()!!
private fun absCf754A(x:Int):Int{
    return if(x>0){
        x
    }
    else{
        -x
    }
}
private fun solve() {
    val (a,b,c) = readInts()
    var ans = absCf754A(2*b-a-c)
    ans = when(ans%3){
        0 -> 0
        else -> 1
    }
    println(ans)
}

fun main() {
    val t = readInt()
    repeat(t) { solve() }
}
