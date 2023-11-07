class Solution {
    fun solution(t: String, p: String): Int {
        var list = mutableListOf<String>()
        for (i in 0..t.length - p.length) {
            val str = t.substring(i, i + p.length)
            if (str.toLong() < p.toLong() || str.toLong() == p.toLong()) {
                list.add(str)
            }
        }
        
        return list.count()
    }
}