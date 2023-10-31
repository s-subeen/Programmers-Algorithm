class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var list = ArrayList<Int>()
        for (index in 0 until arr.size) {
            if (arr[index] % divisor == 0) {
                list.add(arr[index])
            }
        }
        
        if (list.isEmpty()) {
            list.add(-1)
        }
        return list.sorted().toIntArray()
    }
}