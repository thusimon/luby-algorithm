/**
 * Created by Lu on 9/2/2018.
 */
import islandPerimeter from './IslandPerimeter';

describe("Island Perimeter!",()=>{
  it("should return 16",()=>{
    let input = [[0,1,0,0],
      [1,1,1,0],
      [0,1,0,0],
      [1,1,0,0]];
    let output = islandPerimeter(input);
    expect(output).toEqual(16);
  });
});
