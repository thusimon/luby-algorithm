/**
 * Created by Lu on 9/12/2018.
 */
const QualNode = (val, isLeaf, topleft=null, topright=null, bottomleft=null, bottomright=null)=>{
  this.val = val;
  this.isLeaf = isLeaf;
  this.topLeft = topleft;
  this.topRight = topright;
  this.bottomLeft = bottomleft;
  this.bottomRight = bottomright;
};
const ConstructQuadTreeInternal = (grid, r,c,rlen,clen) =>{
  if (rlen==1&&clen==1){
    //single unit, return as leaf
    return new QualNode(grid[r][c], true);
  }

  // check if grid is uniform
  let gridVal = grid[r][c];
  let isUniform = true;
  for (let i=r;i<r+rlen;i++){
    for(let j=c;j<c+cLen;j++){
      let curGridVal = grid[i][j];
      if (curGridVal!=gridVal){
        isUniform = false;
        // not uniform, devide
        let halfRlen = rlen/2;
        let halfClen = clen/2;
        let uprightr = r;
        let uprightc = c;
        let upleftr = r;
        let upleftc = c+halfClen;
        let bottomleftr = r+halfRlen;
        let bottomleftc = c;
        let bottomrightr = r+halfRlen;
        let bottomrightc = c+halfClen;
        let upleft = ConstructQuadTreeInternal(grid, upleftr, upleftc, halfRlen, halfClen);
        let upright = ConstructQuadTreeInternal(grid, uprightr, uprightc, halfRlen, halfClen);
        let bottomleft = ConstructQuadTreeInternal(grid, bottomleftr, bottomleftc, halfRlen, halfClen);
        let bottomright = ConstructQuadTreeInternal(grid, bottomrightr, bottomrightc, halfRlen, halfClen);
        return new QualNode(curGridVal, false, upleft, upright, bottomleft, bottomleft);
      }
    }
  }
  //uniform, return as leaf
  return new QualNode(gridVal, true);
};
const ConstructQuadTree = (grid) =>{
  let rLen = grid.length;
  let cLen = grid[0].length;
  // check if grid is uniform
  let gridVal = grid[0][0];
  let isUniform = true;
  for (let i=0;i<rLen;i++){
    for(let j=0;j<cLen;j++){
      let curGridVal = grid[i][j];
      if (curGridVal!=gridVal){
        isUniform = false;
      }
    }
  }
  if (isUniform){
    return QualNode(gridVal, true);
  } else {
    // devide the grid into 4 sub grid

  }
};

export default ConstructQuadTree;
