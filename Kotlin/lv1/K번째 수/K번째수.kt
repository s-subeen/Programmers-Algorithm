class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var result = ArrayList<Int>()
        
        for (n in commands.indices) {
            var list = ArrayList<Int>()
            val i = commands[n][0]
            val j = commands[n][1] 
            val k = commands[n][2]
            
            (i-1..j-1).forEach {m -> 
                list.add(array[m])
            }
            result.add(list.sorted().get(k - 1))
        }
         
        return result.toIntArray()
    }
}