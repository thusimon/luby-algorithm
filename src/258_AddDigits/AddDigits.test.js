/**
 * Created by Lu on 9/5/2018.
 */
import expect from 'expect';
import addDigit from './AddDigits';

describe("Add Digit!!!",()=>{
  it("should return 2", ()=>{
    expect(addDigit(38)).toEqual(2);
  });
  it("should return 5", ()=>{
    expect(addDigit(1121)).toEqual(5);
  });
});
