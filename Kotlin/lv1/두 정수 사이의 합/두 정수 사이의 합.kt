class Solution {
    fun solution(a: Int, b: Int): Long {
        if (a == b) {
            return a.toLong()
        } else {
            if (a > b) {
                return comparison(b, a)
            } else {
                return comparison(a, b)
            }
        }
    }
    
    fun comparison(sValue: Int, bValue: Int): Long {
        var total: Long = 0
        for (i in sValue..bValue) {
            total += i.toLong()
        }
        return total
    }
}