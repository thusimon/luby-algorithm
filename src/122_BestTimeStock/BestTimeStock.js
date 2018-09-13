/**
 * Created by Lu on 9/11/2018.
 */
const maxProfit = (prices) =>{
  if (!prices || prices.length<2){
    return 0;
  }
  let profit=0;
  for (let i=0;i<prices.length-1;i++){
    let curprice = prices[i];
    let nextprice = prices[i+1];
    if(curprice<nextprice){
      profit+=(nextprice-curprice);
    }
  }
  return profit;
};

export default maxProfit
