/**
 * Created by Lu on 9/3/2018.
 */
import expect from 'expect';
import nimGame from './NimGame';

describe("Nim Game!!",()=>{
  it("3-true",()=>{
    expect(nimGame(3,0)).toEqual(true);
  });
  it("5-true",()=>{
    expect(nimGame(5,0)).toEqual(true);
  });
  it("7-true",()=>{
    expect(nimGame(7,0)).toEqual(true);
  });
  it("8-false",()=>{
    expect(nimGame(8,0)).toEqual(false);
  });
});
