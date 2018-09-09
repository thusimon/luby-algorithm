/**
 * Created by Lu on 9/8/2018.
 */
const SumOfTwoInts = (a,b) => {
  // a=0101001
  // b=1011111
  // a^b i bit is correct, but without carry added
  // a&b i bit is the carry to i+1
  // 1. a^b =           111000
  // 2. carry: 1001<<1 = 10010
  // 3. a^b =           101010
  // 4. carry: 10000<<1=100000
  while(b!=0){
    let tempa = a;
    a=a^b;
    b=(tempa&b)<<1;
  }
  return a;
};

export default SumOfTwoInts;
