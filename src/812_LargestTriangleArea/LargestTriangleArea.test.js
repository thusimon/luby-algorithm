/**
 * Created by Lu on 9/5/2018.
 */
import expect from 'expect';
import largetTriangleArea from './LargestTriangleArea';

describe("larget triangle area",()=>{
  it("should return 2",()=>{
    let input = [[0,0],[0,1],[1,0],[0,2],[2,0]];
    expect(largetTriangleArea(input)).toEqual(2);
  });
});
