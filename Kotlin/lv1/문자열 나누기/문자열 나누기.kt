class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var xCnt = 0
        var differCnt = 0
        var x = ""
        
        for (i in 0 until s.length) {
            if (x == "") x = s[i].toString()
            
            if (x == s[i].toString()) {
                xCnt++
            } else {
                differCnt++
            }
                    
            if (xCnt == differCnt || i == s.length - 1) {
                xCnt = 0
                differCnt = 0
                answer++
                x = ""
            }
        }
        
        return answer
    }
}