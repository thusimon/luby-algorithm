/**
 * Created by Lu on 9/17/2018.
 */
const twoSum = (numbers, target) => {
  // must have one
  let firstIdx = 0;
  while (numbers[firstIdx]<=target){
    let res = target-numbers[firstIdx];
    let secondIdx = firstIdx+1;
    while (secondIdx < numbers.length && numbers[secondIdx]<=res){
      if (numbers[secondIdx]==res){
        return [firstIdx+1, secondIdx+1];
      }
      secondIdx++;
    }
    firstIdx++;
  }
  return [];
};

export default twoSum;
