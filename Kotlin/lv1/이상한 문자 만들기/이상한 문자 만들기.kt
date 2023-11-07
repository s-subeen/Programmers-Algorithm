class Solution {
    fun solution(s: String): String {
        var answer = mutableListOf<String>()
        var list = s.split(" ")
        for (i in 0 until list.size) {
            var str = list[i]
            var result = ""
            for (j in 0 until str.length) {
                result += if (j % 2 == 0) {
                    str.get(j).toUpperCase()
                } else {
                    str.get(j).toLowerCase()
                }
            }
            answer.add(result)
        }
       
        return answer.joinToString(" ")
    }
}