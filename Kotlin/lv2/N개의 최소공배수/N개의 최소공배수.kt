class Solution {
    fun solution(arr: IntArray): Int {
        var answer = arr[0]
        
        for(item in arr) {
            answer = lcm(answer, item)
        }

        return answer
    }
    
    fun lcm(n: Int, m: Int): Int {
        return (n * m) / gcd(n, m)
    }

    fun gcd(a: Int, b: Int): Int {
        return if (a < b) {
            if (a == 0) b else gcd(a, b % a)
        } else {
            if (b == 0) a else gcd(b, a % b)
        }
    }
}