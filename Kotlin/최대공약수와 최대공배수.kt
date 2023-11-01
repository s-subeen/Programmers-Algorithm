class Solution {
    fun solution(n: Int, m: Int): IntArray {
        return intArrayOf(gcd(n, m), n * m / gcd(n, m))
    }
    
    fun gcd(a: Int, b: Int): Int {
        if (a > b) {
            return if (a % b == 0) b else gcd(b, a % b)
        } else {
            return if (b % a == 0) a else gcd(a, b % a)
        }
    }
}