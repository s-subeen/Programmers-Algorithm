class Solution {
    fun solution(elements: IntArray): Int {
        val n = elements.size
        val set = mutableSetOf<Int>()
        val array = IntArray(n * 2) { elements[it % n] }
        
        for (i in 0 until n) {
            for (j in 0 until n) {
                var sum = 0
                for (k in j..j+i) {
                    sum += array[k]
                }
                set.add(sum)
            }
        }
        
        return set.count()
    }
}