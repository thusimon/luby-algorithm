/**
 * Created by Lu on 8/26/2018.
 */
import hammingDist from './solution_461';

describe("calculating hamming dist", ()=>{
  it("should return 2", ()=>{
    let x=1;
    let y=4;
    let dist = hammingDist(x, y);
    expect(dist).toEqual(2);
  });
});
