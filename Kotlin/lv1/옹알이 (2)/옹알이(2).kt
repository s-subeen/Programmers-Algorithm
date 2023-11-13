class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        var regex = "aya|ye|woo|ma".toRegex()
        var repetRegex = "ayaaya|yeye|woowoo|mama".toRegex()
        
        for (babble in babbling) {
            if (babble.contains(repetRegex)) {
                continue
            }
            val res = babble.replace(regex, "")
            if (res.length == 0) {
                answer++
            }
        }
        
        return answer
    }
}