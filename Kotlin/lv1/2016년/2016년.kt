class Solution {
    fun solution(a: Int, b: Int): String {
        var answer = ""
        var month = arrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        var week = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")
        var day = 0
        for (i in 0 until a - 1) {
            day += month[i]
        }
        
        day += b - 1
        answer = week[day % 7]
        
        return answer
    }
}