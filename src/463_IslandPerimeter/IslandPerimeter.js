/**
 * Created by Lu on 9/2/2018.
 */
const IslandPerimeter = (grid) => {
  let islandNum = 0;
  let islandConnect = 0;
  let rLen = grid.length;
  let cLen = grid[0].length;
  for (let i=0; i<rLen; i++){
    for (let j=0; j<cLen; j++){
      if (grid[i][j]){
        islandNum++;
        let up = i-1>=0?grid[i-1][j]:0;
        let down = i+1<rLen?grid[i+1][j]:0;
        let left = j-1>=0?grid[i][j-1]:0;
        let right = j+1<cLen?grid[i][j+1]:0;
        islandConnect+=(up+down+left+right);
      }
    }
  }
  return islandNum*4-islandConnect;
};

export default IslandPerimeter;
