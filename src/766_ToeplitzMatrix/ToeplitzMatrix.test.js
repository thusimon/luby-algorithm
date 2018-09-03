/**
 * Created by Lu on 9/1/2018.
 */
import expect from 'expect';
import toeplitzMatrix from './ToeplitzMatrix';

describe("Toeplitz Matrix",()=>{
  it("should return true",()=>{
    let input = [
      [1,2,3,4],
      [5,1,2,3],
      [9,5,1,2]
    ];
    let output = toeplitzMatrix(input);
    expect(output).toEqual(true);
  });
  it("should return false",()=>{
    let input = [
      [1,2],
      [2,2]
    ];
    let output = toeplitzMatrix(input);
    expect(output).toEqual(false);
  });
  it("should return flase",()=>{
    let input = [[11,74,0,93],[40,11,74,7]];
    let output = toeplitzMatrix(input);
    expect(output).toEqual(false);
  });
});
