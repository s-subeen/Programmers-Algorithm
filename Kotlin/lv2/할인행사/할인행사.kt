class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0
        var wantMap = mutableMapOf<String, Int>()
        for (i in want.indices) {
            wantMap[want[i]] = number[i]
        }
        
    for(i in 0..discount.size - 10){
        val copyMap = wantMap.toMutableMap()
        for(j in i until i + 10 ){ 
            copyMap[discount[j]] = copyMap[discount[j]]?.minus(1) ?: continue
        }
        if(copyMap.all { it.value === 0 }) answer++
    }
        
        return answer
    }
}