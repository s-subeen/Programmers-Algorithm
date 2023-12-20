class Solution {
    fun solution(s: String): String {
        val index = s.length / 2 
        
        if (s.length % 2 == 0) {
            return s.substring(index - 1, index + 1)
        } else {
            return s.get(index).toString()
        }
    }
}