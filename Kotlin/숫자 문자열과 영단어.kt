class Solution {
    fun solution(s: String): Int {
        var answer = s
        var words = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        
        words.forEachIndexed { index, w -> 
            answer = answer.replace(w, index.toString())
        }
        
        return answer.toInt()
    }
}