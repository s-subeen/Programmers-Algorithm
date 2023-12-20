class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var resultArray = arr1
        
        for (i in arr1.indices) {
            for (j in arr1[i].indices) {
                resultArray[i][j] = arr1[i][j] + arr2[i][j]
            }
        }
        return resultArray
    }
}