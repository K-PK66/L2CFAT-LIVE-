import java.util.*
import kotlin.math.*

private fun <E> List<E>.toPair(): Pair<E, E> {
    return Pair(this[0], this[1])
}

private fun maxOf(ans: Pair<Int, Int>, b: Pair<Int, Int>): Pair<Int, Int> {
    return if (ans.first > b.first || ans.first == b.first && ans.second > b.second) ans
    else b
}

private fun <T1 : Comparable<T1>, T2 : Comparable<T2>> pairCmp(): Comparator<Pair<T1, T2>> {
    return Comparator { a, b ->
        val res = a.first.compareTo(b.first)
        if (res == 0) a.second.compareTo(b.second) else res
    }
}


private val readR = Scanner(System.`in`)
private const val BUFFER_SIZE = 1 shl 16
private val buffer = ByteArray(BUFFER_SIZE)
private var bufferPt = 0
private var bytesRead = 0
private fun read() = buildString {
    var c = readChar()
    while(c <= ' ') {
        if(c == Char.MIN_VALUE) return@buildString
        c = readChar()
    }
    do {
        append(c)
        c = readChar()
    } while(c > ' ')
}
private val INPUT = System.`in`
private tailrec fun readChar(): Char {
    if(bufferPt == bytesRead) {
        bufferPt = 0
        bytesRead = INPUT.read(buffer, 0, BUFFER_SIZE)
    }
    return if(bytesRead < 0) Char.MIN_VALUE
    else {
        val c = buffer[bufferPt++].toInt().toChar()
        if (c == '\r') readChar()
        else c
    }
}
private fun readln() = readLine()!!
private fun readInt() = read().toInt()
private fun readDouble() = read().toDouble()
private fun readLong() = read().toLong()
private fun readStrings(n: Int) = List(n) { read() }
private fun readLines(n: Int) = List(n) { readln() }
private fun readInts(n: Int) = List(n) { read().toInt() }
private fun readIntArray(n: Int) = IntArray(n) { read().toInt() }
private fun readDoubles(n: Int) = List(n) { read().toDouble() }
private fun readDoubleArray(n: Int) = DoubleArray(n) { read().toDouble() }
private fun readLongs(n: Int) = List(n) { read().toLong() }
private fun readLongArray(n: Int) = LongArray(n) { read().toLong() }
private fun printWithSpace(vararg x: Any?) = println(x.joinToString(" "))
//----------------Customizing Functions----------------
private fun absCf756B(x:Long):Long{
    return if(x>0){
        x
    }
    else{
        -x
    }
}
//-----------------------Solving-----------------------
private fun solve() {
    val(a,b)=readLongs(2)
    val ans:Long
    val difference=absCf756B(a-b)
    if(difference/2<a&&difference/2<b){
        ans = if(difference%2==0.toLong()){
            when(a>b){
                true->difference/2+(b-difference/2)/2
                else->difference/2+(a-difference/2)/2
            }
        }
        else{
            when(a>b){
                true->(difference-1)/2+(b-(difference-1)/2)/2
                else->(difference-1)/2+(a-(difference-1)/2)/2
            }
        }
    }
    else{
        ans=when(a>b){
            true->b
            else->a
        }
    }
    println(ans)
}
//-------------------The Result Stage------------------
fun main() {
    val t = readInt()
    repeat(t) { solve() }
}
