/**
 * Created by Lu on 9/8/2018.
 */
const isValid = (num)=>{
  if (/[347]+/.test(num)){
    return false;
  }
  if (!(/[2569]+/).test(num)){
    return false;
  }
  return true;
};
const rotateDigits = (N)=>{
  let res = 0;
  for (let i=1;i<N;i++){
    let stri = i.toString();
    if (isValid(stri)){
      res++;
    }
  }
  return res;
};

export default rotateDigits;
