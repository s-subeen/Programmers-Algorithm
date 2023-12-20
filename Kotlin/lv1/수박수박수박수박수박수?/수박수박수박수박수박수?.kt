class Solution {
    fun solution(n: Int): String {
        var even = "수박"
        var odd = "수"
        
        return even.repeat(n/2) + if (n % 2 == 0) "" else odd 
    }
}