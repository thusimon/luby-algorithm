/**
 * Created by Lu on 9/8/2018.
 */
const IntersectionTwoArr = (nums1,nums2)=>{
  return nums1.filter((a,idx)=>{
    return nums1.indexOf(a)==idx && nums2.indexOf(a)>-1;
  });
};

export default IntersectionTwoArr;
