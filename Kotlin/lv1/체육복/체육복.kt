class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var lostList = lost.filter { it !in reserve }.toMutableList()
        var reserveList = reserve.filter { it !in lost }.toMutableList()
        var answer = n - lostList.size
        
        lostList.sort()
        reserveList.sort()
        
        for (item in reserveList) {
            when {
                item - 1 in lostList -> {
                    lostList.remove(item - 1)
                    answer++
                }
                item + 1 in lostList -> {
                    lostList.remove(item + 1)
                    answer++
                }
            }
        }
        
        return answer
    }
}