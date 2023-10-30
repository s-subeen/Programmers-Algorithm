class Solution {
    fun solution(n: Int): Int {
        var list = ArrayList<Int>()
        var sum: Int = 0
        var num = n
        
        while (num > 0) {
            sum += num % 10
            num /= 10
        }

        return sum
    }
}