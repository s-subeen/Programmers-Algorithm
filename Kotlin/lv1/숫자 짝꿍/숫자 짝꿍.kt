import kotlin.math.*

class Solution {
    fun solution(X: String, Y: String): String {
        var answer: String = ""
        
        for (i in 9 downTo 0) {
            val n = min(X.count{it == i.toString()[0]}, Y.count{it == i.toString()[0]})
            answer += i.toString().repeat(n)
        }
        
        return when {
            answer == "" -> "-1"
            answer.replace("0", "") == "" -> "0"
            else -> answer
        }
    }
}