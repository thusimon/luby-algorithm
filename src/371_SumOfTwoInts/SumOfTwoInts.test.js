/**
 * Created by Lu on 9/8/2018.
 */
import sumOfTwoInts from './SumOfTwoInts';

describe("Sum of two ints!",()=>{
  it("should return 3",()=>{
    expect(sumOfTwoInts(1,2)).toEqual(3);
  });
  it("should return 1",()=>{
    expect(sumOfTwoInts(-1,2)).toEqual(1);
  });
});
