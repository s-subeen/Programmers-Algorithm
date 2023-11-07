class Solution {
    fun solution(x: Int): Boolean {
        var num = x
        var list = ArrayList<Int>()
        var total: Int = 0
        while (num > 0) {
            list.add(num % 10)
            num /= 10
        }
        
        for (i in 0 until list.size) {
            total += list.get(i)
        }
        
        if (x % total == 0) {
            return true
        } else {
            return false
        }
    }
}