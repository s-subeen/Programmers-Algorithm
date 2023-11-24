class Solution {
    fun solution(n: Int): Int {
        var array = IntArray(n + 1){1}
        
        for (i in 3..n) {
            array[i] = (array[i - 1] + array[i - 2]) % 1234567
        }
        
        return array[n]
    }
}