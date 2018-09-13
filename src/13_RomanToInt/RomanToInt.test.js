/**
 * Created by Lu on 9/9/2018.
 */
import expect from 'expect';
import romanToInt from './RomanToInt';

describe("Roman to int!!",()=>{
  it("should return 3",()=>{
    let input="III";
    expect(romanToInt(input)).toEqual(3);
  });
  it("should return 4",()=>{
    let input="IV";
    expect(romanToInt(input)).toEqual(4);
  });
  it("should return 9",()=>{
    let input="IX";
    expect(romanToInt(input)).toEqual(9);
  });
  it("should return 58",()=>{
    let input="LVIII";
    expect(romanToInt(input)).toEqual(58);
  });
  it("should return 1994",()=>{
    let input="MCMXCIV";
    expect(romanToInt(input)).toEqual(1994);
  });
});
