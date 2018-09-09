/**
 * Created by Lu on 9/5/2018.
 */
const findArea = (grid,rl,cl,x, y, visit)=>{
  if (grid[x][y]&&!visit[x][y]){
    visit[x][y] = 1;
    let up = x-1>=0?x-1:0;
    let down = x+1<rl?x+1:rl-1;
    let left = y-1>=0?y-1:0;
    let right = y+1<cl?y+1:cl-1;
    return 1+findArea(grid,rl,cl,up,y,visit)+
        findArea(grid,rl,cl,down,y,visit)+
        findArea(grid,rl,cl,x,left,visit)+
        findArea(grid,rl,cl,x,right,visit);
  } else{
    return 0;
  }
};

const MaxAreaIsland = (grid)=>{
  let rl = grid.length;
  let cl = grid[0].length;
  // create an array to record visit
  let visit = new Array(rl);
  for (let i=0;i<rl;i++){
    visit[i] = new Array(cl);
  }
  let maxArea = 0;
  for (let i=0;i<rl;i++){
    for (let j=0;j<cl;j++){
      maxArea = Math.max(maxArea, findArea(grid,rl,cl,i,j,visit));
    }
  }
  return maxArea;
};

export default MaxAreaIsland;
