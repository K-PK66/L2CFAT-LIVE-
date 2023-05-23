@file:Suppress("NOTHING_TO_INLINE", "EXPERIMENTAL_FEATURE_WARNING", "OVERRIDE_BY_INLINE", "DEPRECATION")

import java.io.PrintWriter
import java.util.*
import kotlin.math.*
import kotlin.random.*

@JvmField val INPUT = System.`in`
@JvmField val OUTPUT = System.out

@JvmField val reader = INPUT.bufferedReader()
fun readLine(): String? = reader.readLine()
fun readLn() = reader.readLine()!!
@JvmField var _tokenizer: StringTokenizer = StringTokenizer("")
@JvmField
val writer = PrintWriter(OUTPUT, true)

// ----------------------------------------------------------------------------

class UnionFind {

    private val parents = mutableMapOf<Int, Int>()
    private val sizes = mutableMapOf<Int, Int>()

    fun union(a: Int, b: Int) {
        val fa = find(a)
        val fb = find(b)
        if (fa != fb) {
            parents[fa] = fb
            sizes[fb] = (sizes[fb] ?: 1) + (sizes[fa] ?: 1)
        }
    }

    fun find(a: Int): Int {
        fun getOrDefault(value: Int) = parents.getOrDefault(value, value)

        var parent = getOrDefault(a)
        while (parent != getOrDefault(parent)) {
            parents[parent] = getOrDefault(getOrDefault(parent))
            parent = parents[parent]!!
        }
        return parent
    }

    fun connected(a: Int, b: Int): Boolean {
        return find(a) == find(b)
    }

    fun getSize(a: Int): Int {
        return sizes[find(a)] ?: 1
    }
}

class Trie() {

    /** Initialize your data structure here. */
    private val root = Node()

    /** Inserts a word into the trie. */
    fun insert(word: String) {
        var node = root
        for (char in word) {
            if (!node.children.contains(char)) {
                node.children[char] = Node()
            }
            node = node.children[char]!!
        }
        node.hasWord = true
    }

    /** Returns if the word is in the trie. */
    fun search(word: String): Boolean {
        return findNode(word)?.hasWord ?: false
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    fun startsWith(prefix: String): Boolean {
        return findNode(prefix) != null
    }

    private fun findNode(prefix: String): Node? {
        var node = root
        for (char in prefix) {
            node = node.children[char] ?: return null
        }
        return node
    }

    private class Node(
        var hasWord: Boolean = false,
        val children: MutableMap<Char, Node> = mutableMapOf<Char, Node>()
    )
}

// All functions' index start from 0
// query(index): sum[0, index]
class BinaryIndexedTree {

    private val bit: IntArray

    constructor(n: Int) {
        this.bit = IntArray(n + 1)
    }

    constructor(nums: IntArray) {
        this.bit = IntArray(nums.size + 1)
        val prefix = IntArray(bit.size)
        for (i in 1 until nums.size + 1) {
            prefix[i] = prefix[i - 1] + nums[i - 1]
            bit[i] = prefix[i] - prefix[i - lowbit(i)]
        }
    }

    fun query(index: Int): Int {
        var result = 0
        var i = index + 1
        while (i > 0) {
            result += bit[i]
            i -= lowbit(i)
        }
        return result
    }

    fun update(index: Int, x: Int) {
        val value = query(index) - query(index - 1)
        add(index, x - value)
    }

    fun add(index: Int, x: Int) {
        var i = index + 1
        while (i < bit.size) {
            bit[i] += x
            i += lowbit(i)
        }
    }

    private fun lowbit(x: Int): Int {
        return x.and(-x)
    }
}

// ----------------------------------------------------------------------------

private fun PrintWriter.printNums(nums: List<Int>) {
    nums.forEach {
        print(it)
        print(' ')
    }
    println()
}

private fun fastPow(a: Long, exp: Long, mod: Long): Long {
    var result = 1L % mod
    var base = a % mod
    var remain = exp
    while (remain != 0L) {
        if (remain % 2L == 1L) {
            result = (result * base) % mod
        }
        base = (base * base) % mod
        remain /= 2L
    }
    return result
}


private fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

private fun lcm(a: Int, b: Int): Int {
    return ((a.toLong() * b.toLong()) / gcd(a, b)).toInt()
}

private fun wordToCharCount(word: String): IntArray {
    val charCount = IntArray(26)
    for (char in word) {
        charCount[char.toIndex()]++
    }
    return charCount
}

private fun Char.toIndex(): Int {
    return this.toInt() - 'a'.toInt()
}

private fun Char.toDigit(): Int {
    return this.toInt() - '0'.toInt()
}

private val DIR = listOf(
    listOf(0, 1), listOf(1, 0), listOf(0, -1), listOf(-1, 0)
)

private const val MOD = 998244353
private const val MODL = 998244353L
private fun readInts() = readWords().map { it.toInt() }
private fun readLongs() = readWords().map { it.toLong() }
private fun readWords() = readln().split(" ")
private fun readInt() = readln().toInt()
private fun readLong() = readln().toLong()
private fun readln() = kotlin.io.readLine()!!
private fun readIntArray(n: Int) = IntArray(n) { read().toInt() }
private fun read(): String {
    while (_tokenizer.hasMoreTokens().not()) _tokenizer = StringTokenizer(reader.readLine() ?: return "", " ")
    return _tokenizer.nextToken()
}
fun main(){
    val N = readInt()
    val S = readIntArray(N)
    var ans=0
    var flag:Int
    for(i in S.indices){
        flag=0
        for(a in 1..S[i]/3+1){
            for(b in 1..S[i]/3+1){
                if(4*a*b+3*a+3*b==S[i]){
                    flag++
                }
            }
        }
        if (flag==0){
            ans++
        }
    }
    println(ans)
}
