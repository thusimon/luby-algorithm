/**
 * Created by Lu on 9/3/2018.
 */
import primeNumInBinary from './PrimeNumberInBinary';

describe("Prime number in binary!",()=>{
  it("should return 4",()=>{
    expect(primeNumInBinary(6,10)).toEqual(4);
  });
  it("should return 5",()=>{
    expect(primeNumInBinary(10,15)).toEqual(5);
  });
});
