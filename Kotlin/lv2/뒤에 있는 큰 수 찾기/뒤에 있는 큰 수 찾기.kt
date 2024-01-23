import java.util.*
class Solution {
    fun solution(numbers: IntArray): IntArray {
        val answer = mutableListOf<Int>() 
        val stack = Stack<Int>() // 스택을 생성하여 탐색한 값 저장 

        for(i in numbers.lastIndex downTo 0) { // 배열을 뒤에서부터 순회 
            var maxNum = -1
            while(stack.isNotEmpty()){ // 스택이 비어있지 않을 때 까지
                if(stack.peek() > numbers[i]) { // 스택의 맨 위의 값이 현재 원소보다 크다면 
                    maxNum = stack.peek() // 찾은 값으로 maxNum 갱신 
                    break // 더 이상 순회가 필요 없으므로 탈출 
                } else { 
                    stack.pop() // pop 해서 계속 순회 
                }
            }
            answer.add(maxNum) // 큰 값을 결과 리스트에 추가
            stack.push(numbers[i]) // 현재 값을 스택에 추가 
        }
        return answer.reversed().toIntArray() // 결과 리스트를 뒤집고 배열로 변환 
    }
}