class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        
        for (char in s) {
            var ch = char
            var count = index
            while (count > 0) {
                ch += 1
                if (ch > 'z') {
                    ch = 'a'
                }
                
                if (ch !in skip) {
                    count--
                }
            }
            answer += ch
        }
        
        return answer
    }
}