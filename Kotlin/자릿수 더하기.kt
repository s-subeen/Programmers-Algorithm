class Solution {
    fun solution(n: Int): Int {
        val str: String = n.toString()
        val arr = str.toCharArray()
        var sum: Int = 0
        
        for (item in arr) {
            sum += item.toString().toInt()
        }

        return sum
    }
}