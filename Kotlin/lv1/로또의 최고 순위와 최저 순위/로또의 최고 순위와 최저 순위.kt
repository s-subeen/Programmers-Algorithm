class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var result = ArrayList<Int>()
        var match = 0
        var zero = 0
        
        for (lotto in lottos) {
            if (lotto == 0) {
                zero++
            } else if (lotto in win_nums) {
                match++
            }
        }
        
        result.add(ranking(match + zero))
        result.add(ranking(match))
        
        return result.toIntArray()
    }
    
    fun ranking(num: Int): Int {
        return when(num) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
    }

}