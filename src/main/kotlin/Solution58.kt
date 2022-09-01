class Solution58 {

    fun lengthOfLastWord(s: String): Int {
        val pattern = Regex("\\s+")
        var txt = pattern.split(s).filter { it.isNotBlank() }
        txt.forEach(){
            return txt.last().length
        }
        return -1
    }
}


fun main(){
    val x = Solution58().lengthOfLastWord("This is a sentence")
    println(x)
}

