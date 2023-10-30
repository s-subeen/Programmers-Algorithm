class Solution {
    fun solution(n: Long): IntArray {
        var list = ArrayList<Int>()
        var num = n
        
        while(num > 0) {
            list.add((num%10).toInt())
            num /= 10
        }
        
        return list.toIntArray()
    }
}