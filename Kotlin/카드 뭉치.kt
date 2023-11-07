class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var c1 = 0
        var c2 = 0
        
        for (word in goal) {
            if (c1 < cards1.size && word.equals(cards1[c1])) {
                c1++
            } else if (c2 < cards2.size &&word.equals(cards2[c2])) {
                c2++
            } else {
                return "No"
            }
        }

        return "Yes"
    }
}