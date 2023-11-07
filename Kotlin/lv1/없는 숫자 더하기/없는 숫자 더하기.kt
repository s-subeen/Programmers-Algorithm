class Solution {
    fun solution(numbers: IntArray): Int {
        var total: Int = 0
        for (i in 0..9) {
            if (!numbers.contains(i)) {
                total += i
            }
        }
        
        return total
    }
}