class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = strings.toList()
        answer = answer.sortedWith(compareBy({it[n]}, {it}))
        
        return answer.toTypedArray()
    }
}