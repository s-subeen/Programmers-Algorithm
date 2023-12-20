class Solution {
    fun solution(arr: IntArray): Double {
        var average: Double = 0.0
        var sum: Int = 0
        for (item in arr) {
            sum += item
        }
        average = sum.toDouble() / arr.size
        
        return average
    }
}