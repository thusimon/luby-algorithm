/**
 * Created by Lu on 9/2/2018.
 */
const DistributeCandies = (candies) =>{
  let sisterCandyNum = candies.length/2;
  let candyType = new Set(candies);
  return Math.min(sisterCandyNum, candyType.size);
};

export default DistributeCandies;
