/**
 * Created by Lu on 9/1/2018.
 */
import shortestDistToChar from './ShortestDistToChar';

describe("Shortest dist to char!",()=>{
  it("should return shortest dist 1",()=>{
    let S="loveleetcode";
    let C="e";
    let output = shortestDistToChar(S,C);
    let expectedOutput = [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0];
    expect(output).toEqual(expectedOutput);
  });
});
