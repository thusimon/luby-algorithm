/**
 * Created by Lu on 8/26/2018.
 */

import expect from 'expect';
import numJeweIsInStones from './solution_771';

describe('Jewels and stones test', ()=>{
  it("should return 3", ()=>{
    let J= "aA", S = "aAAbbbb";
    let jewelsNum = numJeweIsInStones(J, S);
    expect(jewelsNum).toEqual(3);
  });
  it("should return 0", ()=>{
    let J = "z", S = "ZZ";
    let jewelsNum = numJeweIsInStones(J, S);
    expect(jewelsNum).toEqual(0);
  });
});
