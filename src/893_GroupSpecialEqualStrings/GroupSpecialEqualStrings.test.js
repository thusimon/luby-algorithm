/**
 * Created by Lu on 8/30/2018.
 */
import expect from 'expect';
import groupSpecialEqualStrings from './GroupSpecialEqualStrings';

describe("Testing special equal strings", ()=>{
  it("should return 3",()=>{
    let input = ["a","b","c","a","c","c"];
    let output = groupSpecialEqualStrings(input);
    expect(output).toEqual(3);
  });
  it("should return 4",()=>{
    let input = ["aa","bb","ab","ba"];
    let output = groupSpecialEqualStrings(input);
    expect(output).toEqual(4);
  });
  it("should return 3",()=>{
    let input = ["abc","acb","bac","bca","cab","cba"];
    let output = groupSpecialEqualStrings(input);
    expect(output).toEqual(3);
  });
  it("should return 1",()=>{
    let input = ["abcd","cdab","adcb","cbad"];
    let output = groupSpecialEqualStrings(input);
    expect(output).toEqual(1);
  });
});
