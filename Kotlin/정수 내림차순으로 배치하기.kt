class Solution {
    fun solution(n: Long): Long {
        var charArray = n.toString().toCharArray()
        
        charArray.sortDescending()
            
        return charArray.joinToString("").toLong()
    }
}