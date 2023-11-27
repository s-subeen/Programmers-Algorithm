class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()

        for (idx in 1..yellow) {
            if (yellow % idx != 0) {
                continue
            }
            
            if (brown == (yellow / idx * 2) + (idx * 2) + 4) {
                answer = intArrayOf(yellow / idx + 2, idx + 2)
                break
            } 
        }
        
        return answer
    }
}