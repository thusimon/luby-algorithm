/**
 * Created by Lu on 9/2/2018.
 */
import expect from 'expect';
import avgLevelBinaryTree from './AvgLevelBinaryTree';
import TreeNode from '../common/TreeNode';

describe("Average level of binary tree!",()=>{
  it("should return [3,14.5,11]",()=>{
    let input = new TreeNode(3,
      new TreeNode(9),
      new TreeNode(20, new TreeNode(15), new TreeNode(7))
    );
    let output = avgLevelBinaryTree(input);
    expect(output).toEqual([3,14.5,11]);
  });
});
