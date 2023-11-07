class Solution {
    fun solution(left: Int, right: Int): Int {
        var sum: Int = 0
        for (index in left..right) {
            if (getCountDivisor(index) % 2 == 0) {
                sum += index
            } else {
                sum -= index
            }
        }
        
        return sum
    }
    
    fun getCountDivisor(num: Int): Int {
        var count: Int = 0
        for (index in 1..num) {
            if (num % index == 0) {
                count++
            }
        }
        
        return count
    }
}