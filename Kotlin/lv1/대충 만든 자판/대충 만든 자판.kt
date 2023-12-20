import kotlin.math.*

class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer = ArrayList<Int>()
        var result = 0
        
        for (target in targets) {
            result = 0
            for (i in 0 until target.length) {
                var compare = Int.MAX_VALUE
                for (key in keymap) {
                    if (key.indexOf(target[i]) != -1) {
                        compare = min(compare, key.indexOf(target[i]))
                    }
                }
                if (compare == Int.MAX_VALUE) {
                    result = -1
                    break
                } else {
                    result += compare + 1
                }
            }
            answer.add(result)
        }
        
        return answer.toIntArray()
    }
}