class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var num = n
        var result = 0
        var r = 0
        while (true) {
            r = num%a
            num /= a
            result += b * num
            num = num * b + r
            if (num < a) break
        }
        return result
    }
}