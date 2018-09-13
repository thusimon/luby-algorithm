/**
 * Created by Lu on 9/8/2018.
 */
const LemonadeChange = (bills)=>{
  let num5=0,num10=0,num20=0;
  for(let i=0;i<bills.length;i++){
    if (bills[i]==5){
      num5++;
    } else if (bills[i]==10){
      if (num5>0){
        num5--;
      } else {
        return false;
      }
      num10++;
    } else {
      if (num10>0 && num5>0){
        num10--;
        num5--;
      } else if(num5>=3){
        num5-=3;
      } else {
        return false;
      }
      num20++;
    }
  }
  return true;
};

export default LemonadeChange;
