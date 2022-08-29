class Solution326 {
    fun power(n: Int): Boolean {
        var num = n
        while (num % 3 == 0) {
            num /= 3
        }
        return num == 1
    }
}

fun main(){
    val ret = Solution326().power(27)
}