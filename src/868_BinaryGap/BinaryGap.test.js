/**
 * Created by Lu on 9/1/2018.
 */
import binaryGap from './BinaryGap';

describe("Binary Gap testing",()=>{
  it("22 should return 2",()=> {
    let input = 22;
    let output = binaryGap(input);
    expect(output).toEqual(2);
  });
  it("5 should return 2",()=> {
    let input = 5;
    let output = binaryGap(input);
    expect(output).toEqual(2);
  });
  it("6 should return 1",()=> {
    let input = 6;
    let output = binaryGap(input);
    expect(output).toEqual(1);
  });
  it("8 should return 0",()=> {
    let input = 8;
    let output = binaryGap(input);
    expect(output).toEqual(0);
  });
});
