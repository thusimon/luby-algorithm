/**
 * Created by Lu on 9/6/2018.
 */
import expect from 'expect';
import detectCapital from './DetectCapital';

describe("Detect Captial!",()=>{
  it("should return true",()=>{
    expect(detectCapital("FFFFFFFFFFFFFFFFFFFFf")).toEqual(false);
  });
});
