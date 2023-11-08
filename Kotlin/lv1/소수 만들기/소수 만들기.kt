class Solution {
    fun solution(nums: IntArray): Int {
        var count = 0
        var list = ArrayList<Int>()
 
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                for (k in j + 1 until nums.size) {
                    list.add(nums[i] + nums[j] + nums[k])
                }
            }
        }
        
        for (num in list) {
            var prime = true
            for (i in 2 until num) {
                if (num % i == 0) {
                    prime = false
                }
            }
            if (prime) {
                count++
            }
        }

        return count
    }
}