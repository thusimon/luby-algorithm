/**
 * Created by Lu on 8/31/2018.
 */
import expect from 'expect';
import keyboardRow from './KeyboardRow';

describe("Keyboard row same",()=>{
  it("should have two words",()=>{
    let input = ["Hello", "Alaska", "Dad", "Peace"];
    let output = keyboardRow(input);
    expect(output).toEqual(["Alaska", "Dad"]);
  })
});
