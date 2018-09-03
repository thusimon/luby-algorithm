/**
 * Created by Lu on 9/2/2018.
 */
const FizzBuzz = (n)=>{
  let result = [];
  for(let i=1;i<=n;i++){
    let mod3 = i%3;
    let mod5 = i%5;
    if (mod3!=0&&mod5!=0){
      result.push(i+"");
    } else if (mod3!=0){
      result.push("Buzz");
    } else if (mod5!=0){
      result.push("Fizz");
    } else{
      result.push("FizzBuzz");
    }
  }
  return result;
};
