class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(nums) < 3: return []
        nums.sort()
        result = []
        for i in range(len(nums)-2):
            left = i + 1
            right = len(nums) - 1
            if i != 0 and nums[i] == nums[i-1]: 
                continue
            while left<right:
                if nums[left] + nums[right] == -nums[i]:
                    result.append([nums[i],nums[left],nums[right]])
                    left = left+1
                    right = right-1
                    while nums[left] == nums[left-1] and left < right: 
                        left = left + 1
                    while nums[right] == nums[right+1] and left < right: 
                        right = right - 1
                elif nums[left] + nums[right] < -nums[i]:
                    left = left + 1
                else:
                    right = right - 1
        return result
        