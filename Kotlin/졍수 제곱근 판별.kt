class Solution {
    fun solution(n: Long): Long {
        val x = Math.sqrt(n.toDouble())
        if (x % 1 == 0.0) {
            return Math.pow(x + 1, 2.0).toLong()
        } else {
            return -1
        }
    }
}