class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val newReport = report.distinct()
        val suspendedId = newReport.groupingBy {it.split(" ")[1]}.eachCount().filter {it.value >= k}
        val res = id_list.associate { it to 0 }.toMutableMap()
        
        newReport.forEach {
            val item = it.split(" ")
            if (item[1] in suspendedId) {
                res[item[0]] = res.getOrDefault(item[0], 0) + 1
            }
        }

        return res.values.toIntArray()
    }
}