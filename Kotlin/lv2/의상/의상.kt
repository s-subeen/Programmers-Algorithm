class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        return clothes.groupBy { array -> array[1] }.values.fold(1) { total, v -> total * (v.size + 1) } - 1
    }
}