import java.util.Arrays

class Solution {
    fun solution(numbers: IntArray): String {
        val answer = numbers.map { it.toString() }
            .sortedWith(Comparator { o1, o2 ->
                (o2 + o1).compareTo(o1 + o2)
            })
            .reduce { acc, s -> acc + s }

        return if (answer.startsWith("0")) "0" else answer
    }
}