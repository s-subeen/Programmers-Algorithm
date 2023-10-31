class Solution {
    fun solution(arr: IntArray): IntArray {
        val min = arr.sorted().get(0)
        var list = arr.toMutableList()
        list.remove(min)
        
        if (list.isEmpty()) {
            list.add(-1)
        } 
        
        return list.toIntArray()
    }
}