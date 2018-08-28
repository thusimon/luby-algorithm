/**
 * Created by Lu on 8/26/2018.
 */
const JudgeRouteCircle = (move) =>{
  let pos = [0,0];
  for (let i=0; i<move.length; i++){
    let curMove = move[i];
    if (curMove == "R"){
      pos[0]++;
    } else if (curMove == "L"){
      pos[0]--;
    } else if (curMove == "U"){
      pos[1]++;
    } else if (curMove == "D"){
      pos[1]--;
    } else {
      //TODO
    }
  }
  return pos[0]==0 && pos[1]==0;
};

export default JudgeRouteCircle;
