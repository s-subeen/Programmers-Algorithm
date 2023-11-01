import kotlin.math.pow

class Solution {
    fun solution(n: Int): Int {
        var num = n
        var result = ""
        var decimal : Double = 0.0
        
        while (num > 0) {
            result = (num % 3).toString() + result
            num /= 3
        }

        (0 until result.length).forEach { i -> 
            val number = result.get(i).toString().toDouble()
            decimal += (3.0).pow(i) * number
        }
        
        println("${n.toString(2)}")
        
        return decimal.toInt()
    }
}