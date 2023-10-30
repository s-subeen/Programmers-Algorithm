class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var arr = LongArray(n)
        
        for (i in 0 until arr.size) {
            arr[i] = x.toLong() * (i + 1)
        }
        
        return arr
    }
}