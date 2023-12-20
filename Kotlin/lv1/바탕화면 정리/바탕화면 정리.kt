import kotlin.math.*
class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var start = Int.MAX_VALUE
        var end = Int.MIN_VALUE
        var left = Int.MAX_VALUE
        var right = Int.MIN_VALUE

        wallpaper.forEachIndexed { i, wall ->
            for (j in wall.indices) {
                if (wall[j] == '#') {
                    start = min(start, i)
                    end = max(end, i + 1)
                    left = min(left, j)
                    right = max(right, j + 1)
                }
            }
        }
        
        return intArrayOf(start, left, end, right)
    }
}