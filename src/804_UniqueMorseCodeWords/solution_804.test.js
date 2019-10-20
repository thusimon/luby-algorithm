/**
 * Created by Lu on 8/26/2018.
 */
import UniqueMorseCodeWords from './solution_804';

describe("number of unique morse code", ()=>{
  it("should return 2", ()=>{
    let words = ["gin", "zen", "gig", "msg"];
    let uniqueMorseNum = UniqueMorseCodeWords(words);
    expect(uniqueMorseNum).toEqual(2);
  });
});
