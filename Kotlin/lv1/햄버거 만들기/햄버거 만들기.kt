class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        var list = ArrayList<Int>()
        var sequence = listOf(1, 2, 3, 1)
        
        for (number in ingredient) {
            list.add(number)
            if (list.size > 3 && list.takeLast(4) == sequence) {
                answer++
                for (i in 0..3) {
                    list.removeLast()
                }
            }
        }
        
        return answer
    }
}