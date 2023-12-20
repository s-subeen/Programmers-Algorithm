class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var max = ArrayList<Int>()
        var min = ArrayList<Int>()
        for (i in 0 until sizes.size) {
            if (sizes[i][0] > sizes[i][1]) {
                max.add(sizes[i][0])
                min.add(sizes[i][1])
            } else {
                max.add(sizes[i][1])
                min.add(sizes[i][0])
            }
        }

        return max.sorted().get(max.size - 1) * min.sorted().get(min.size - 1)
    }
}