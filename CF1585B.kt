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
private fun eversionTNC2022ER3B(a:LongArray):LongArray{
    val x=a.last()
    val leftA=LongArray(a.size){ _ ->0.toLong()}
    val rightA=LongArray(a.size){ _ ->0.toLong()}
    var leftIndex=0
    var rightIndex=0
    for(i in a.indices){
        if(a[i]<=x){
            leftA[leftIndex]=a[i]
            leftIndex++
        }
        else{
            rightA[rightIndex]=a[i]
            rightIndex++
        }
    }
    val newResult=LongArray(a.size)
    var newResultIndex=0
    for(i in leftA.indices){
        if(leftA[i]==0.toLong()){
            break
        }
        newResult[newResultIndex]=leftA[i]
        newResultIndex++
    }
    for(i in rightA.indices){
        if(rightA[i]==0.toLong()){
            break
        }
        newResult[newResultIndex]=rightA[i]
        newResultIndex++
    }
    return newResult
}
//-----------------------Solving-----------------------
private fun solve() {
    val n=readInt()
    val a=readLongArray(n)
    var count=0.toLong()
    var max = 0.toLong()
    for(i in a.indices){
        if(a[n-1-i]>max){
            max=a[n-1-i]
            count++
        }
    }
    println(count-1)
}
//-------------------The Result Stage------------------
fun main() {
    val t = readInt()
    repeat(t) { solve() }
}
