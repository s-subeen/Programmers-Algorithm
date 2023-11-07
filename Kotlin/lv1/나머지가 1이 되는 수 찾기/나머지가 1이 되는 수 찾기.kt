class Solution {
    fun solution(n: Int): Int {
        var guess: Int = 1
        while(guess <= n) {
            if (n % guess == 1) {
                break
            }
            guess++
        }
        
        return guess
    }
}