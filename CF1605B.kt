import java.util.*

private fun readInts() = readWords().map { it.toInt() }
private fun readLongs() = readWords().map { it.toLong() }
private fun readWords() = readln().split(" ")
private fun readInt() = readln().toInt()
private fun readLong() = readln().toLong()
private fun readln() = kotlin.io.readLine()!!
private fun solve(){
    val n = readInt()
    var s = readln().toCharArray()
    var tmp=CharArray(n)
    for (i in s.indices){
        tmp[i]=s[i]
    }
    tmp.sort()
    var flag=0
    var k=0
    for(i in s.indices){
        if (s[i]!=tmp[i]){
            flag++
            break
        }
    }
    println(flag)
    if(flag==1){
        for(i in s.indices){
            if (s[i]!=tmp[i]){
                k++
            }
        }
        val ans = IntArray(k)
        var j=0
        for(i in s.indices){
            if(s[i]!=tmp[i]){
                ans[j]=i+1
                j++
            }
        }
        print("$k ")
        for(h in ans.indices){
            print("${ans[h]} ")
        }
        println("")
    }
}
fun main() {
    val t = readInt()
    repeat(t) { solve() }
}
