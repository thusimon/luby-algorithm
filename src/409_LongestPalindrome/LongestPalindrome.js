/**
 * Created by Lu on 9/19/2018.
 */
const longestPalindrome = (s)=>{
  let cfreq = new Array(52).fill(0);
  for (let i=0;i<s.length;i++){
    let c = s[i].charCodeAt(0);
    if (c<=122 && c>=97){
      cfreq[c-97]++;
    } else if (c<=90 && c>=65){
      cfreq[c-65+26]++;
    } else {

    }
  }
  let res = 0;
  let maxOdd = 0;
  for (let i=0;i<52;i++){
    let freq = cfreq[i];
    res += Math.floor(freq/2)*2;
    if (freq%2!=0){
      maxOdd=1;
    }
  }
  return res+maxOdd;
};

export default longestPalindrome;
