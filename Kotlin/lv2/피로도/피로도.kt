class Solution {
    var answer: Int = 0
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        dfs(dungeons, k, 0, Array(dungeons.size){false})        
        
        return answer
    }
    
    fun dfs(dungeons: Array<IntArray>, tired: Int, count: Int, isVisited: Array<Boolean>) {
        if (count > answer) answer = count
        
        for (i in dungeons.indices) {
            if (!isVisited[i] && dungeons[i][0] <= tired) {
                isVisited[i] = true
                dfs(dungeons, tired - dungeons[i][1], count + 1, isVisited)
                isVisited[i] = false
            }
        }
    }
}