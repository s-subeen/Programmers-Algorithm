class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var total: Int = 0
        
        for (index in 0 until absolutes.size) {
            total += getSigns(absolutes.get(index), signs.get(index))
        }
        
        return total
    }
    
    fun getSigns(num: Int, sign: Boolean): Int {
        if (sign) {
            return num
        } else {
            return -num
        }
    }
}