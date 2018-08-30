/**
 * Created by Lu on 8/29/2018.
 */
import expect from 'expect';
import numberLinesToWriteString from './NumberLinesToWriteString';

describe("Testing number of lines to write string", ()=>{
  it("should return [3,60]", ()=>{
    let widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10];
    let S="abcdefghijklmnopqrstuvwxyz";
    let output = numberLinesToWriteString(widths,S);
    expect(output).toEqual([3,60]);
  });
});
