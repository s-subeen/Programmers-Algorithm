class Solution {
    val chars = charArrayOf('A','E','I','O','U')
    var count = 0
    var isStop = false
    
    fun solution(word: String): Int {
        dfs(0, "", word)
        return count
    }
    
    fun dfs(depth: Int, next: String, target: String) {
        if(depth == 6) return

        if(next == target) {
            isStop = true
            return
        }

        for (char in chars) {
            if(isStop) return
            
            if(depth + 1 < 6) count++
            dfs(depth + 1, next.plus(char), target)
        }
    }
}