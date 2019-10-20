/**
 * Created by Lu on 8/26/2018.
 */
import toLowerCase from './solution_709';

describe("To lower case test", ()=>{
  it("should return hello",()=>{
    let res = toLowerCase("Hello");
    expect(res).toEqual("hello");
  });
  it("should return here",()=>{
    let res = toLowerCase("here");
    expect(res).toEqual("here");
  });
  it("should return lovely",()=>{
    let res = toLowerCase("LOVELY");
    expect(res).toEqual("lovely");
  });
});
