import java.util.*
import kotlin.*
import java.io.*
 
private fun <E> List<E>.toPair(): Pair<E, E> {
    return Pair(this[0], this[1])
}
 
private fun maxOf(ans: Pair<Int, Int>, b: Pair<Int, Int>): Pair<Int, Int> {
    return if (ans.first > b.first || ans.first == b.first && ans.second > b.second) ans
    else b
}
 
private fun <T1 : Comparable<T1>, T2 : Comparable<T2>> pairCmp(): java.util.Comparator<Pair<T1, T2>> {
    return Comparator { a, b ->
        val res = a.first.compareTo(b.first)
        if (res == 0) a.second.compareTo(b.second) else res
    }
}
private val OUTPUT = System.out!!
private const val yes = "YES"
private const val no = "NO"
private val INPUT = System.`in`
private val reader = INPUT.bufferedReader()
private val readR = Scanner(System.`in`)
private const val BUFFER_SIZE = 1 shl 16
private val buffer = ByteArray(BUFFER_SIZE)
private var bufferPt = 0
private var bytesRead = 0
private var st: StringTokenizer = StringTokenizer("")
private fun read(): String {
    while (st.hasMoreTokens().not())
        st = StringTokenizer(reader.readLine() ?: return "", " ")
    return st.nextToken()
}
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
private fun line() = reader.readLine()!!
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
private fun readCharArray(n:Int) = CharArray(n) {_->readChar()}
private fun solve() {
    /* Solution here */
    val n=readInt()
    val k=readInt()
    if(n%2==1){
        for(i in 1 until (n+1)/2){
            print("${n-i+1} $i ")
        }
        println((n+1)/2)
    }
    else{
        for(i in 1 until n/2){
            print("${n-i+1} $i ")
        }
        println("${n/2+1} ${n/2}")
    }
    /* End of solution */
}
fun main() {
    val t = readInt()
    repeat(t) { solve() }
}
