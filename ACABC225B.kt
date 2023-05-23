import java.util.*
fun main () {
    var reader = Scanner(System.`in`)
    val N = Integer.valueOf(readLine())
    var a:IntArray = IntArray(N-1)
    var b:IntArray = IntArray(N-1)
    for(i in 0 until N-1){
        a[i]=reader.nextInt()
        b[i]=reader.nextInt()
    }
    var connect:IntArray = IntArray(N) {i -> 0 * i}
    for(i in 0 until N-1){
        connect[a[i]-1]++
        connect[b[i]-1]++
    }
    for(i in 0 until N){
        if(connect[i]==N-1){
            println("Yes")
            return
        }
    }
    println("No")
}
