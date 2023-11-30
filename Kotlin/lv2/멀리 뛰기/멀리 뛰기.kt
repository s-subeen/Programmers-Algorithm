class Solution {
    fun solution(n: Int): Long {
        var answer: Long = 0
        var array = LongArray(n + 1) {1}
        
        for (i in 2..n) {
            array[i] = (array[i - 1] + array[i - 2]) % 1234567
        }
         
        return array[n]
    }
}