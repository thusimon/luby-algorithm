/**
 * Created by Lu on 8/28/2018.
 */
const PeakIndexInMountainArray = (A) => {
  // can use Math.max and indexOf
  return A.indexOf(Math.max(...A));
};

export default PeakIndexInMountainArray;
