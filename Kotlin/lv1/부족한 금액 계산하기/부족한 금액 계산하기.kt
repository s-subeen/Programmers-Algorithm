class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var total: Long = 0
        for (num in 1..count) {
            total += num * price.toLong()
        }
        
        return if (money < total) total - money else 0
    }
}