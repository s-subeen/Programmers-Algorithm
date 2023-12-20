class Solution {
    fun solution(answers: IntArray): IntArray {
        var result = ArrayList<Int>()
        var person = arrayOf(arrayOf(1, 2, 3, 4, 5),
                            arrayOf(2, 1, 2, 3, 2, 4, 2, 5),
                            arrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5))
        var count = arrayOf(0, 0, 0)
        var score = arrayOf(0, 0, 0)
        
        for (answer in answers) {
            for (i in person.indices) {
                if (answer.equals(person[i][count[i]])) {
                    score[i]++
                }
                count[i]++
                if (count[i] > person[i].size - 1) {
                    count[i] = 0
                }
            }
        }
        
        for (i in score.indices) {
            if (score.maxOrNull() == score[i]) {
                result.add(i + 1)
            } 
        }

        return result.toIntArray()
    }
}