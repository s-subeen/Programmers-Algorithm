class Solution {
    fun solution(s: String): IntArray {   
        var count = 0
        var zero = 0
        var str = s
        
        while (str != "1") {
            count += 1
            zero += str.count { it == '0' }
            str = str.replace("0", "").length.toString(2)
        }
        
        return intArrayOf(count, zero)
    }
}