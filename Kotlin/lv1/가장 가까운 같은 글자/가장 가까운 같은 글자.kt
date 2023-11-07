class Solution {
    fun solution(s: String): IntArray {
        var answer = ArrayList<Int>()
        for (i in 0 until s.length) {
            var index = -1
            for (j in 0 until i) {
                if (s.get(i) == s.get(j)) {
                    index = i - j
                }
            }
            answer.add(index)
        }
        return answer.toIntArray()
    }
}