/**
 * Created by Lu on 9/1/2018.
 */
import expect from 'expect';
import baseballGame from './BaseballGame';

describe("Baseball game!",()=>{
  it("should return 30", ()=>{
    let input = ["5","2","C","D","+"];
    let output = baseballGame(input);
    expect(output).toEqual(30);
  });
  it("should return 27", ()=>{
    let input = ["5","-2","4","C","D","9","+","+"];
    let output = baseballGame(input);
    expect(output).toEqual(27);
  });
});
