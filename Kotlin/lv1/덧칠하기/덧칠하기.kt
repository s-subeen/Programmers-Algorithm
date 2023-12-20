class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var count = 0
        var end = 0
        
        for (index in section) {
            if (index < end) {
                continue
            }
            end = index + m
            count++
        }
        
        return count
    }
}