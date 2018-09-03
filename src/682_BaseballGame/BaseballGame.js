/**
 * Created by Lu on 9/1/2018.
 */
const BaseballGame = (ops)=>{
  let stack = [];
  while(ops.length>0){
    let op = ops.shift();
    if (op=="C"){
      stack.pop();
    } else if (op=="D"){
      let lastRound = stack[stack.length-1] || 0;
      stack.push(lastRound*2);
    } else if (op=="+"){
      let lastRound = stack[stack.length-1] || 0;
      let lastRound2 = stack[stack.length-2] || 0;
      stack.push(lastRound+lastRound2);
    } else {
      stack.push(parseInt(op));
    }
  }
  return stack.reduce((accu, cur)=>accu+cur, 0);
};
export default BaseballGame;
