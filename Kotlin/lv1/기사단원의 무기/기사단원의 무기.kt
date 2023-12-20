import kotlin.math.*

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var divisor = ArrayList<Int>()
        
        (1..number).forEach { i -> 
            var count = 0
            val x = sqrt(i.toDouble()).toInt()
            (1..x).forEach { j -> 
                if (i % j == 0) {
                    count += if (j * j == i) 1 else 2
                }
            }
            if (count > limit) {
                divisor.add(power)
            } else {
                divisor.add(count)
            }
        }
        
        return divisor.sum()
    }
}