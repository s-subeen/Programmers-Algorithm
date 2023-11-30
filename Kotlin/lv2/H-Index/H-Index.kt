class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0
        val n = citations.size
        val sort = citations.sortedDescending()
        
        for (idx in n downTo 1) {
            val count = sort.filter{ it >= idx }.count()
            if (idx <= count) {
                return idx
            }
        }
        return answer
    }
}