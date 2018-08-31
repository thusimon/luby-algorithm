/**
 * Created by Lu on 8/30/2018.
 */
import expect from 'expect';
import maxDepthOfNTree from './MaxDepthOfNTree';
import TreeNodeN from '../common/TreeNodeN';

describe("Testing Tree max depth", ()=>{
  it("should return 1", ()=>{
    let node1 = new TreeNodeN(1);
    let maxDepth = maxDepthOfNTree(node1);
    expect(maxDepth).toEqual(1);
  });
  it("should return 3", ()=>{
    let leafNodes = [new TreeNodeN(5),new TreeNodeN(6)];
    let nodesLayer2 = [new TreeNodeN(3,leafNodes), new TreeNodeN(2), new TreeNodeN(4)];
    let root = new TreeNodeN(1, nodesLayer2);
    let maxDepth = maxDepthOfNTree(root);
    expect(maxDepth).toEqual(3);
  });
  it("should return 4", ()=>{
    let leafNodes = [new TreeNodeN(5),new TreeNodeN(6)];
    let leafNodes2 = [new TreeNodeN(9, [new TreeNodeN(0)])];
    let nodesLayer2 = [new TreeNodeN(3,leafNodes), new TreeNodeN(2), new TreeNodeN(4, leafNodes2)];
    let root = new TreeNodeN(1, nodesLayer2);
    let maxDepth = maxDepthOfNTree(root);
    expect(maxDepth).toEqual(4);
  })
});
