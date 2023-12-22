import kotlin.math.*
class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        val convert = n.toString(k)
        convert.split("0").forEach {
            if (it.isNotBlank() && isPrime(it.toLong())) {
                answer++
            }
        }
        
        return answer
    }
    
    fun isPrime(num: Long): Boolean {
        if (num <= 1) return false
        val sqrt = sqrt(num.toDouble()).toLong()
        for(i in 2..sqrt) {
            if(num % i == 0L) return false
        }
        return true
    }
}