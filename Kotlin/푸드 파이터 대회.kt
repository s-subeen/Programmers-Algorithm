class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        
        food.forEachIndexed { index, number ->
            answer += index.toString().repeat(number / 2)
        }
        
        answer += "0" + answer.reversed()
        
        return answer 
    }
}