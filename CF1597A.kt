import java.util.*

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

private fun readDouble() = readln().toDouble()
private fun readStrings(n: Int) = List(n) { read() }
private fun readLines(n: Int) = List(n) { readln() }
private fun readLongs() = readWords().map { it.toLong() }
private fun readWords() = readln().split(" ")
private fun readInt() = readln().toInt()
private fun readLong() = readln().toLong()
private fun readln() = readLine()!!
private fun readInts() = readWords().map { it.toInt() }
private fun readIntArray(n: Int) = IntArray(n) { read().toInt() }
private fun readDoubles(n: Int) = readWords().map{it.toDouble()}
private fun readDoubleArray(n: Int) = DoubleArray(n) { read().toDouble() }
private fun readLongs(n: Int) = readWords().map{it.toLong()}
private fun readLongArray(n: Int) = LongArray(n) { read().toLong() }
private fun printWithSpaceSeparate(vararg x: Any?) = println(x.joinToString(" "))
//----------------Customizing Functions----------------
private fun GoodGradeTNC2022IRA(x:Int):Boolean {
    return x>=4
}
//-----------------------Solving-----------------------
private fun solve() {
    val n=readInt()
    val a=readIntArray(n)
    var giftCount:Int=0
    var Ndex=0
    do{
        if(GoodGradeTNC2022IRA(a[Ndex])&&GoodGradeTNC2022IRA(a[Ndex+1])&&GoodGradeTNC2022IRA(a[Ndex+2])){
            giftCount++
            Ndex+=2
        }
        Ndex++
    }while(Ndex<n-2)
    println(giftCount)
}
//-------------------The Result Stage------------------
fun main() {
    solve()
}
