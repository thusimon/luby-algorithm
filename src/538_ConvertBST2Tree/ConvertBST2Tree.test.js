/**
 * Created by Lu on 9/12/2018.
 */
import convertBST2Tree from './ConvertBST2Tree';
import TreeNode from '../common/TreeNode';

describe("Convert BST to greater tree!",()=>{
  it("should return 20 18 13",()=>{
    let input = new TreeNode(5, new TreeNode(2), new TreeNode(13));
    let output = convertBST2Tree(input);
    expect(output.val).toEqual(18);
    expect(output.left.val).toEqual(20);
    expect(output.right.val).toEqual(13);
  });
  it("should return 24 20 18 13",()=>{
    let input = new TreeNode(5, new TreeNode(2, null, new TreeNode(4)), new TreeNode(13));
    let output = convertBST2Tree(input);
    expect(output.val).toEqual(18);
    expect(output.left.val).toEqual(24);
    expect(output.left.right.val).toEqual(22);
    expect(output.right.val).toEqual(13);
  });
});
