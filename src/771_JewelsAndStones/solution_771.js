/**
 * Created by Lu on 8/26/2018.
 */
const numJeweIsInStones = (J, S) =>{
  return [...S].reduce((accumulater, current)=>{
    return accumulater + J.includes(current);
  },0);
};

export default numJeweIsInStones;
