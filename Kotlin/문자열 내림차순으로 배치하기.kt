class Solution {
    fun solution(s: String): String {
        val upper = s.split("").sortedDescending().joinToString("")

        return upper
    }
} 