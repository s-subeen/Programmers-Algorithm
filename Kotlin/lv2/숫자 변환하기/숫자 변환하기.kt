import java.util.*

class Solution {
    fun solution(x: Int, y: Int, n: Int): Int {
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        val visited = mutableSetOf<Int>()
        queue.offer(x to 0)
        visited.add(x)

        while (queue.isNotEmpty()) {
            val (current, operations) = queue.poll()

            if (current == y) return operations

            val nextOperations = operations + 1
            val items = listOf(current + n, current * 2, current * 3)

            for (next in items) {
                if (next <= y && next !in visited) {
                    queue.offer(next to nextOperations)
                    visited.add(next)
                }
            }
        }
        return -1
    }
}