/**
 * Created by Lu on 9/15/2018.
 */
const CanConstruct = (ransomNote, magazine) =>{
  let res = true;
  let magArr=[...magazine];
  for (let r=0;r<ransomNote.length;r++){
    let idx = magArr.indexOf(ransomNote[r]);
    if (idx>-1){
      magArr.splice(idx, 1);
    } else {
      return false;
    }
  }
  return true;
};

export default CanConstruct;
