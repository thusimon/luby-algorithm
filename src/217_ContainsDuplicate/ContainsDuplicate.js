/**
 * Created by Lu on 9/12/2018.
 */
const containsDuplicate = (nums)=>{
  return nums.length == new Set(nums).size;
};

export default containsDuplicate;
