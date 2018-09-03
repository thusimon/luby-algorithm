/**
 * Created by Lu on 9/1/2018.
 */
import expect from 'expect';
import TreeNodeN from '../common/TreeNodeN';
import naryTreePostorder from './NaryTreePostorderTraversal';

describe("N-ary trees post order traverse",()=>{
  it("should return post order 1",()=>{
    let leafs = [new TreeNodeN(5),new TreeNodeN(6)];
    let layer2 = [new TreeNodeN(3, leafs), new TreeNodeN(2), new TreeNodeN(4)];
    let root = new TreeNodeN(1, layer2);
    let output = naryTreePostorder(root);
    let expectOutput = [5,6,3,2,4,1];
    expect(output).toEqual(expectOutput);
  })
});
