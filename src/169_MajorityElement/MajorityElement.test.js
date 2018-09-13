/**
 * Created by Lu on 9/9/2018.
 */
import expect from 'expect';
import majorityElement from './MajorityElement';

describe("MajorityElement!!",()=>{
  it("should return 3",()=>{
    let input = [3,2,3];
    expect(majorityElement(input)).toEqual(3);
  });

});
