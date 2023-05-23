fun main () {
    var S = readLine()
    var s = S!!.toCharArray()
    if(s[0]==s[1]&&s[1]==s[2]){
        println(1)
    }
    else if((s[0]==s[1]&&s[1]!=s[2])||(s[1]==s[2]&&s[0]!=s[1])||(s[0]==s[2]&&s[1]!=s[2])){
        println(3)
    }
    else{
        println(6)
    }
}
