# Problem Statemnt : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
class Solution(object):
    def removeDuplicates(self, nums):
        """ Since it's sorted array try to compare the value  of first number with the third replace it with"""
        if len(nums)<=2:
            return len(nums)

        k = 2
        for i in range(2,len(nums)):
            if nums[i] != nums[k-2]:
                nums[k] = nums[i]
                k+=1
        print(nums)
                
        return k   
