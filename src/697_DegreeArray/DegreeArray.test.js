/**
 * Created by Lu on 9/17/2018.
 */
import expect from 'expect';
import degreeArray from './DegreeArray';

describe("Array Degree!",()=>{
  it("should return 2",()=>{
    let input = [1,2,2,3,1];
    expect(degreeArray(input)).toEqual(2);
  });
});
