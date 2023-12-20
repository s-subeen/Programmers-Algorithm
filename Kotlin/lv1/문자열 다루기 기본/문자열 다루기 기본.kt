class Solution {
    fun solution(s: String): Boolean {
        return if (checkLength(s) && checkNumber(s)) true else false
    }
    
    fun checkLength(s: String): Boolean {
        return if (s.length == 4 || s.length == 6) true else false
    }
    
    fun checkNumber(s: String): Boolean {
        var result = s.replace("[0-9]".toRegex(), "")
        return if (result.length == 0) true else false
    }
}