/**
 * Created by Lu on 9/2/2018.
 */
import trimBST from './TrimBST';
import TreeNode from '../common/TreeNode';

describe("Trim BST!",()=>{
  it("should return 1 2",()=>{
    let input  = new TreeNode(1, new TreeNode(0), new TreeNode(2));
    let output = trimBST(input, 1, 2);
    expect(output.val).toEqual(1);
    expect(output.left).toEqual(null);
    expect(output.right.val).toEqual(2);
  });
  it("should return 3 2 1",()=>{
    let input  = new TreeNode(3,
      new TreeNode(0, null, new TreeNode(2, new TreeNode(1))),
      new TreeNode(4));
    let output = trimBST(input, 1, 3);
    expect(output.val).toEqual(3);
    expect(output.right).toEqual(null);
    expect(output.left.val).toEqual(2);
    expect(output.left.left.val).toEqual(1);
  });
  it("should return 2",()=>{
    let input  = new TreeNode(1, null, new TreeNode(2));
    let output = trimBST(input, 2, 4);
    expect(output.val).toEqual(2);
  });
  it("should return 3 4",()=>{
    let input  = new TreeNode(3,
      new TreeNode(1, null, new TreeNode(2)),
      new TreeNode(4));
    let output = trimBST(input, 3, 4);
    expect(output.val).toEqual(3);
    expect(output.left).toEqual(null);
    expect(output.right.val).toEqual(4);
  });
});
