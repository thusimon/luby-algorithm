/**
 * Created by Lu on 9/3/2018.
 */
import binaryNumberAlterBits from './BinaryNumberAlterBits';

describe("Binary number with alternating bits!",()=>{
  it("5 is true",()=>{
    expect(binaryNumberAlterBits(5)).toEqual(true);
  });
  it("7 is false",()=>{
    expect(binaryNumberAlterBits(7)).toEqual(false);
  });
  it("11 is false",()=>{
    expect(binaryNumberAlterBits(11)).toEqual(false);
  });
  it("10 is true",()=>{
    expect(binaryNumberAlterBits(10)).toEqual(true);
  });
});
