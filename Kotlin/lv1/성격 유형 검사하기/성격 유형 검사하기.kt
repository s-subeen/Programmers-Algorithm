class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""
        val map = mutableMapOf(1 to 3, 2 to 2, 3 to 1, 4 to 0, 5 to 1, 6 to 2, 7 to 3)
        val charList = arrayOf('R', 'T', 'C', 'F', 'J', 'M', 'A', 'N')
        var scoreList = IntArray(8) {0}
        
        for (i in survey.indices) {
            val choice = choices[i]
            if (choice == 4) {
                continue
            }
            val type = if (choice < 4) survey[i][0] else survey[i][1]
            val index = charList.indexOf(type)
            scoreList[index] += map[choice]!!
        }
        
        for (j in scoreList.indices step 2) {
            answer += if (scoreList[j] < scoreList[j + 1]) charList[j + 1] else charList[j]
        }
        
        return answer
    }
}