class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        var total = 0
        var list = tangerine.toMutableList().groupingBy { it }.eachCount().entries.sortedWith(compareByDescending { it.value }).forEach {
            total += it.value
            answer++
            if (k <= total) return answer
        }
        return answer
    }
}