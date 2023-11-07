class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var list = mutableListOf<Int>()
        var result = ArrayList<Int>()
        
        for (s in score) {
            if (list.size < k) {
                list.add(s)
            } else {
                if (s > list[0]) {
                    list.removeAt(0)
                    list.add(s)
                }
            }
            list.sort()
            result.add(list[0])
        }
        
        return result.toIntArray()
    }
}