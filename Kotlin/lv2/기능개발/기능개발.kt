class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var days = ArrayList<Int>()
        var results = ArrayList<Int>()
        
        for ((progress, speed) in progresses.zip(speeds)) {
            var complete = progress
            var count: Int = 0
            while (complete < 100) {
                complete += speed
                count++
            }
            
            val index = days.size - 1
            if (days.isEmpty() || count > days[index]) {
                days.add(count)
                results.add(1)
            } else {
                results[index]++
            }
        }
        
        return results.toIntArray()
    }
}