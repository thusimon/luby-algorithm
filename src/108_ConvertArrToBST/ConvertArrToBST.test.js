/**
 * Created by Lu on 9/19/2018.
 */
import TreeNode from '../common/TreeNode';
import convertArrToBst from './ConvertArrToBST';
import expect from 'expect';

describe("Convert sorted array to BST!",()=>{
  it("should return [0,-10,5,null,-3,null,9]",()=>{
    let input = [-10,-3,0,5,9];
    let output = convertArrToBst(input);
    console.log(output);
    expect(output.val).toEqual(0);
  });
});
