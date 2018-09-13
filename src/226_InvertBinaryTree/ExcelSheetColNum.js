/**
 * Created by Lu on 9/8/2018.
 */
const ExcelSheetColNum = (s)=>{
  let res = 0;
  for (let i=s.length-1,k=0;i>=0;i--,k++){
    let curbit = s[i].charCodeAt("0")-64;
    res+=curbit*Math.pow(26,k);
  }
  return res;
};
