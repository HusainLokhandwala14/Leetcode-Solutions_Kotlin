class Solution48 {
    fun rotate(matrix: Array<IntArray>): Unit {
        if (matrix.isEmpty() || matrix[0].isEmpty())
            return
        val n = matrix.size
        for (i in 0..(n / 2 - 1)) {
            for (j in i..n - 2 - i) {
                val temp = matrix[i][j]
                println("temp:" + temp)
                println("matrix[n-1-j ][i]:" + matrix[n - 1 - j][i])
                matrix[i][j] = matrix[n - 1 - j][i]
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j]
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i]
                matrix[j][n - 1 - i] = temp
            }
        }
    }
}


fun main(){
    val mat1 = arrayOf(intArrayOf(1,2,3) , intArrayOf(4,5,6) , intArrayOf(7,8,9))
    val soln = Solution48().rotate(mat1)
    println(mat1)
}
