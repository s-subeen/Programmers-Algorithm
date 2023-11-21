class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var map = mapOf("N" to intArrayOf(-1, 0), "S" to intArrayOf(1, 0),
                       "W" to intArrayOf(0, -1), "E" to intArrayOf(0, 1))
        for (i in park.indices) {
            for(j in park[i].indices) {
                if (park[i][j] == 'S') {
                    answer = intArrayOf(i, j)
                }
            }
        }
        
        for (route in routes) {
            val op = map[route.split(" ")[0]]!!
            val n = route.split(" ")[1].toInt()
            var x = answer[0]
            var y = answer[1]

            for (i in 0 until n) {
                x += op[0]
                y += op[1]

                if (x < 0 || x >= park.size || y < 0 || y >= park[0].length
                   || park[x][y] == 'X') {
                    x = answer[0]
                    y = answer[1]
                    break
                }
            }
            answer = intArrayOf(x, y)
        }
        
        return answer
    }
}