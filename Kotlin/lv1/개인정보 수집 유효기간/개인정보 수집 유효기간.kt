class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer = ArrayList<Int>()
        
        for (idx in privacies.indices) {
            val date = privacies[idx].split(" ")[0]
            val type = privacies[idx].split(" ")[1]
            var term = 0
            for (tm in terms) {
                if (tm.contains(type)) {
                    term = tm.split(" ")[1].toInt()
                }
            }
            if (dateToDays(today) >= dateToDays(date) + term * 28) {
                answer.add(idx + 1)
            }
        }
        
        return answer.toIntArray()
    }
    
    fun dateToDays(date: String): Int {
        var item = date.split(".").map(String::toInt)
        return (item[0] * 12 * 28) + ((item[1] - 1) * 28) + item[2]
    }
}