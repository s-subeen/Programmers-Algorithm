class Solution {
    fun solution(phone_number: String): String {
        val answer = phone_number
        val cnt = answer.length - 4
        val char = "*"
        
        return char.repeat(cnt) + answer.substring(cnt , answer.lastIndex + 1)
    }
}