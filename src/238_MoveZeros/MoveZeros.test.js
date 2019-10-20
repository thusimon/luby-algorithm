/**
 * Created by Lu on 9/5/2018.
 */
import moveZeros from './MoveZeros';

describe("Move Zeros!",()=>{
  it("should return [1,3,12,0,0]", ()=>{
    let input = [0,1,0,3,12];
    let expectOutput = [1,3,12,0,0];
    expect(moveZeros(input)).toEqual(expectOutput);
  });
  it("should return [1,3,12,0,0]", ()=>{
    let input = [1,0,0,3,12];
    let expectOutput = [1,3,12,0,0];
    expect(moveZeros(input)).toEqual(expectOutput);
  });
  it("should return [1,3,12,0,0]", ()=>{
    let input = [0,1,3,0,12];
    let expectOutput = [1,3,12,0,0];
    expect(moveZeros(input)).toEqual(expectOutput);
  });
});
