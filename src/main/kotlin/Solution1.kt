class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        throw IllegalArgumentException("No solution")
    }
}

fun main(){
    val ret = Solution1().twoSum(intArrayOf(2,7,11,15)  , 9)
}

