fun abs(x:Int):Int{
    if(x>0){
        return x
    }
    else{
        return -x
    }
}
fun main() {
    for(i in 1..(Integer.valueOf(readLine()))) {
        var sample = readLine()
        var s = readLine()
        var actual:IntArray = IntArray(s!!.length)
        var ans:Int = 0
        for(j in 0 until s!!.length){
            for(k in 0 until sample!!.length){
                if(s[j]==sample[k]){
                    actual[j]=k+1
                }
            }
        }
        for(j in 1 until s!!.length){
            ans+=abs(actual[j]-actual[j-1])
        }
        println(ans)
    }
}
