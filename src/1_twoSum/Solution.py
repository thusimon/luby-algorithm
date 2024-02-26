class Solution:
  def twoSum(self, nums: List[int], target: int) -> List[int]:
    dict = {}
    for num in enumerate(nums):
      if num in dict:
        dict[num] += 1
      else:
        dict[num] = 1    
    for idx, num in enumerate(nums):
      subtract = target - num
      if dict[subtract] >= 1:
        return [num, subtract]
    return []
  
