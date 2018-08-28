/**
 * Created by Lu on 8/26/2018.
 */
import expect from 'expect';
import judgeRouteCircle from './JudgeRouteCircle';

describe("judge route circle...", ()=>{
  it("should return to start", ()=>{
    let input = "UD";
    let result = judgeRouteCircle(input);
    expect(result).toEqual(true);
  });
  it("should not return to start", ()=>{
    let input = "LL";
    let result = judgeRouteCircle(input);
    expect(result).toEqual(false);
  });
});
