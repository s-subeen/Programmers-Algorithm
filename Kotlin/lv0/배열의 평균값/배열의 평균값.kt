class Solution {
    fun solution(numbers: IntArray): Double {
        var sum: Double = 0.0
        for (item in numbers) {
            sum += item
        }
        return sum / numbers.size
    }
}