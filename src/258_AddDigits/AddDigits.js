/**
 * Created by Lu on 9/5/2018.
 */
const AddDigits = (num)=>{
  let res = num;
  while(res>9){
    let tempres = res;
    res = 0;
    while (tempres>0){
      res+=tempres%10;
      tempres = Math.floor(tempres/10);
    }
  }
  return res;
};

export default AddDigits;
