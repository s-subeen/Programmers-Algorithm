class Solution {
    private var answer = 0
    private lateinit var number: String
    private lateinit var visit: BooleanArray
    private val answerSet = mutableSetOf<Int>()

    fun solution(numbers: String): Int {
        number = numbers
        visit = BooleanArray(numbers.length)

        for (i in numbers.indices) {
            visit[i] = true
            dfs(numbers[i].toString().toInt())
            visit[i] = false
        }
        return answerSet.size
    }

    private fun dfs(num: Int) {
        if (isPrime(num)) {
            answerSet.add(num)
        }

        for (i in number.indices) {
            if (!visit[i]) {
                val t = num.toString() + number[i]
                visit[i] = true
                dfs(t.toInt())
                visit[i] = false
            }
        }
    }

    private fun isPrime(num: Int): Boolean {
        if (num < 2) return false
        for (i in 2 until num) {
            if (num % i == 0) {
                return false
            }
        }
        return true
    }
}