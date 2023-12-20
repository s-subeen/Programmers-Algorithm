class Solution {
    fun solution(num: Int): Int {
        if (num == 1) {
            return 0
        }
        
        var calc = num.toDouble()
        var cnt: Int = 0
        while (true) {
            if (calc % 2 == 0.0) {
                calc /= 2
            } else { 
                calc = (calc * 3) + 1
            }
            
            cnt++
            if (calc == 1.0) {
                break
            }
            if (cnt == 500) {
                cnt = -1
                break
            } 
        }
        
        return cnt
    }
}