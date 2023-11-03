class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        
        for (char in s) {
            var decimal = char.toInt()
            var distance = decimal + n
            if (decimal == 32) {
                answer += " "
            } else if (decimal >= 65 && decimal <= 90) {
               answer += if (distance > 90) (distance - 26).toChar() else distance.toChar()
            } else if (decimal >= 97 && decimal <= 122) {
                answer += if (distance > 122) (distance - 26).toChar() else distance.toChar()
            }
        }
        
        return answer
    }
}