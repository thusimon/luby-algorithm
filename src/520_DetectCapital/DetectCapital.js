/**
 * Created by Lu on 9/6/2018.
 */
const DetectCapital = (word) =>{
  if (word.length<=1){
    return true;
  }
  let firstCheck = /[a-z]/.test(word[0]);
  let secondCheck = /[a-z]/.test(word[1]);
  for (let i=1;i<word.length;i++){
    if (firstCheck){
      //first lower
      if (/[A-Z]/.test(word[i])){
        return false;
      }
    } else {
      //first upper
      if (/[a-z]/.test(word[i])!=secondCheck){
        return false;
      }
    }
  }
  return true;
};

export default DetectCapital;
