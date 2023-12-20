class Solution {
    fun solution(angle: Int): Int {
        var answer: Int = 0
        when {
            (0 < angle && angle < 90) -> {
                answer = 1
            }
            angle == 90 -> {
                answer = 2
            }
            (90 < angle && angle < 180) -> {
                answer = 3
            }
            angle == 180 -> {
                answer = 4
            }
        }
        
        return answer
    }
}