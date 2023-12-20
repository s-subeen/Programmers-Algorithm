class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        var rank = HashMap<String, Int>()
        var player = HashMap<Int, String>()
        
        for (i in players.indices) {
            rank[players[i]] = i
            player[i] = players[i]
        }
        
        for (name in callings) {
            val position = rank[name]!!
            val head = player[position - 1]!!
            rank[head] = position
            rank[name] = position - 1
            player[position] = head
            player[position - 1] = name
        }
        
        return player.values.toTypedArray()
    }
}