class Solution {
    fun solution(seoul: Array<String>): String {
        val str: String = "Kim"
        var index: Int = 0
        
        for (i in 0 until seoul.size) {
            if (str.equals(seoul.get(i))) {
                index = i
            }
        }
        return "김서방은 ${index}에 있다"
    }
}