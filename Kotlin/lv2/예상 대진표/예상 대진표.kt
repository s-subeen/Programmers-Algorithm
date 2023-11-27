class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var numA = a
        var numB = b
        
        while(true) {
            numA = (numA + 1) / 2
            numB = (numB + 1) / 2
            answer++
            if (numA == numB) break
        }

        return answer
    }
}