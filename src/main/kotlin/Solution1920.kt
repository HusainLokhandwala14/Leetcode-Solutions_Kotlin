class Solution {
    fun buildArray(nums: IntArray): IntArray {
         val arr  = MutableList(nums.size){0}
        for (i in nums){
            arr[i]= nums[nums[i]]


        }
        return arr.toIntArray()
    }
}

fun main(){
    val ans = Solution().buildArray(intArrayOf(5,0,1,2,3,4))
    println(ans.contentToString())
}

