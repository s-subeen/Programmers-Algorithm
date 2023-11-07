class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = ArrayList<Int>()
        for (i in 0 until numbers.size) {
            for (j in i + 1 until numbers.size) {
                answer.add(numbers[i] + numbers[j])
            }
        }
        
        var result = answer.distinct().sorted()
        return result.toIntArray()
    }
}