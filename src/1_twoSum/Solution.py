class Solution:
  def twoSum(self, nums: List[int], target: int) -> List[int]:
    dict = {}
    for idx, n in enumerate(nums):
      dict[idx] = n
    for key in dict.keys():
      pass