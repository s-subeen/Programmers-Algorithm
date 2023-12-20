class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var sorted = score.sortedArrayDescending()
        var profit = 0
        for (i in m-1 until sorted.size step m) {
            profit += sorted[i] * m
        }
        return profit
    }
}