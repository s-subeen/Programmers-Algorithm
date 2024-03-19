class Solution {
    fun solution(topping: IntArray): Int {
        var answer = 0
        val toppingCount = mutableMapOf<Int, Int>()
        val brother1 = mutableSetOf<Int>()
        val brother2 = mutableSetOf<Int>()

        topping.forEach {
            toppingCount[it] = (toppingCount[it] ?: 0) + 1
            brother1.add(it)
        }
        
        for (toppingItem in topping) {
            brother2.add(toppingItem)
            toppingCount[toppingItem] = (toppingCount[toppingItem] ?: 0) - 1
            if (toppingCount.getOrDefault(toppingItem, 0) == 0)
                brother1.remove(toppingItem)
            if (brother1.size == brother2.size) answer++
        }

        return answer
    }
}