/**
 * Created by Lu on 8/29/2018.
 */
const NumberLinesToWriteString = (widths, S)=>{
  let lines=[];
  let curLine="";
  let curLineUnit = 0;
  for(let i=0; i<S.length; i++){
    let curChar = S[i];
    let curCharUnit = widths[curChar.charCodeAt(0)-97];
    if (curLineUnit + curCharUnit >100){
      lines.push(curLine);
      curLine="";
      curLineUnit=0;
    }
    curLine+=curChar;
    curLineUnit+=curCharUnit;
  }
  if(curLine){
    lines.push(curLine);
  }
  return [lines.length, curLineUnit];
};

export default NumberLinesToWriteString;
