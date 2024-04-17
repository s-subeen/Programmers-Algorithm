import java.util.*

class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var time = 0
        
        val bridgeQueue: Queue<Int> = LinkedList()
        val waitingTrucks: Queue<Int> = LinkedList(truck_weights.toList())
        
        repeat(bridge_length) {
            bridgeQueue.offer(0)
        }
        
        while (bridgeQueue.isNotEmpty()) {
            time++
            val passedTruckWeight = bridgeQueue.poll()
            val currentWeight = bridgeQueue.sum()
            
            if (waitingTrucks.isNotEmpty()) {
                val nextTruckWeight = waitingTrucks.peek()
                if (currentWeight + nextTruckWeight <= weight) {
                    bridgeQueue.offer(waitingTrucks.poll())
                } else {
                    bridgeQueue.offer(0)
                }
            }
        }
        
        return time
    }
}