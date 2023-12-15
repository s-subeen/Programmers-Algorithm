import java.util.*

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        val queue = PriorityQueue<Int>(Collections.reverseOrder())  // 우선순위 큐 

        for (priority in priorities) {
            queue.add(priority)
        }
        
        while (!queue.isEmpty()) {
            for (i in priorities.indices) {  // priorities를 순차적으로 탐색
                if (priorities[i] == queue.peek()) {  //큐의 우선순위와 priorities의 우선순위를 비교
                    answer++
                    queue.poll()  // 일치할 경우 제거
                    if (i == location) { // 원하는 위치의 요소를 찾을 경우 
                        return answer 
                    }
                }
            }
        }
        return answer
    }
}