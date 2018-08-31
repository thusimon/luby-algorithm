const NumberComplement = (n)=>{
  let reversed = [];
  while (n>0){
    let bit = n%2;
    reversed.push(bit?0:1);
    n = n>>1;
  }
  let reversedNum = reversed.reverse().join("");
  return parseInt(reversedNum,2);
};
export default NumberComplement;
