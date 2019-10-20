/**
 * Created by Lu on 8/26/2018.
 */
import flippingImage from './FlippingImage';

describe("Flipping image...",()=>{
  it("should flipped image", ()=>{
    const input = [[1,1,0],[1,0,1],[0,0,0]];
    const output = flippingImage(input);
    const expect_output = [[1,0,0],[0,1,0],[1,1,1]];
    expect(output).toEqual(expect_output);
  });
});
