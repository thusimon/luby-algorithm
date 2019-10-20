/**
 * Created by Lu on 8/28/2018.
 */
import mergeBinaryTrees from './MergeBinaryTrees';
import TreeNode from '../common/TreeNode';
import * as TreeUtils from '../common/TreeUtils';

describe("testing binary tree merging", ()=>{
  //prepare trees
  let t1 = new TreeNode(1);
  t1.left = new TreeNode(3, new TreeNode(5));
  t1.right = new TreeNode(2);

  let t2 = new TreeNode(2);
  t2.left = new TreeNode(1, null, new TreeNode(4));
  t2.right = new TreeNode(3, null, new TreeNode(7));

  it("Should be the same tree", ()=>{
    let mergedTree = mergeBinaryTrees(t1, t2);
    let expectedTree = new TreeNode(3);
    expectedTree.left = new TreeNode(4, new TreeNode(5), new TreeNode(4));
    expectedTree.right = new TreeNode(5, null, new TreeNode(7));
    let isTreeSame = TreeUtils.treeEqual(mergedTree, expectedTree);
    expect(isTreeSame).toEqual(true);
  });
  it("should be not the same tree", ()=>{
    let mergedTree = mergeBinaryTrees(t1, t2);
    let expectedTree = new TreeNode(3);
    expectedTree.left = new TreeNode(4, new TreeNode(5), new TreeNode(4));
    expectedTree.right = new TreeNode(5, new TreeNode(7));
    let isTreeSame = TreeUtils.treeEqual(mergedTree, expectedTree);
    expect(isTreeSame).toEqual(false);
  });
});

