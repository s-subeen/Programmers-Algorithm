class Solution {
    fun solution(nums: LongArray): LongArray {
        val result = LongArray(nums.size)
        // 주어진 배열의 각 요소에 대해 반복
        for ((index, num) in nums.withIndex()) {
            // 현재 숫자의 가장 오른쪽 비트를 나타내는 변수
            var currentNum = 1L
            // 현재 숫자를 변경하기 위한 변수
            var newNum = num
            // 현재 숫자의 각 비트를 검사하여 0인 비트를 찾음
            while (true) {
                // 0인 비트를 찾으면 해당 비트를 1로 바꾸고 이전 비트를 0으로 바꿈
                if ((num and currentNum) == 0L) {
                    newNum = newNum or currentNum
                    // (currentNum shr 1)은 currentNum의 오른쪽으로 비트를 한 칸 이동한 값이며, 이전 비트를 나타냄 
                    newNum = newNum xor (currentNum shr 1)
                    break
                }
                // 다음 비트를 검사하기 위해 currentNum을 왼쪽으로 1 이동시킴
                currentNum = currentNum shl 1
            }
            // 수정된 숫자를 결과 배열에 저장
            result[index] = newNum
        }
        return result
    }
}