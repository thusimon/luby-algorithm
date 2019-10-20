/**
 * Created by Lu on 8/29/2018.
 */
import projectionAreaOf3D from './ProjectionAreaOf3D';

describe("Testing projecting area of 3d", ()=>{
  it("should return 5", ()=>{
    let input = [[2]];
    let output = projectionAreaOf3D(input);
    expect(output).toEqual(5);
  });
  it("should return 17", ()=>{
    let input = [[1,2],[3,4]];
    let output = projectionAreaOf3D(input);
    expect(output).toEqual(17);
  });
  it("should return 8", ()=>{
    let input = [[1,0],[0,2]];
    let output = projectionAreaOf3D(input);
    expect(output).toEqual(8);
  });
  it("should return 14", ()=>{
    let input = [[1,1,1],[1,0,1],[1,1,1]];
    let output = projectionAreaOf3D(input);
    expect(output).toEqual(14);
  });
  it("should return 21", ()=>{
    let input = [[2,2,2],[2,1,2],[2,2,2]];
    let output = projectionAreaOf3D(input);
    expect(output).toEqual(21);
  });
  it("should return XX", ()=>{
    let input = [[36,38,8,6,32,36,24,8,30,18,32,3,40,41,6,20,40,24,47,26,47,28,6,32,30,14,3,15,19,10,12,45,50,46,3,42,23,49,38,19,5,9,3,21,12,47,1,41,4,16],[21,13,40,26,24,21,0,49,26,4,28,38,23,10,31,49,17,49,8,40,23,41,50,40,41,26,37,20,6,36,32,44,19,48,28,41,8,47,42,45,22,42,10,41,6,13,32,49,22,31],[3,28,40,11,14,41,37,33,37,3,4,12,20,20,40,20,36,37,50,12,19,27,29,6,33,39,30,24,32,40,41,17,11,47,41,28,49,4,23,24,35,39,17,21,29,38,47,17,32,19],[24,35,30,37,4,34,31,10,44,9,13,31,14,4,34,35,46,28,44,49,50,11,21,32,42,17,48,4,41,27,0,40,5,50,35,40,2,33,6,30,39,13,47,2,49,19,20,18,36,20],[27,45,26,1,9,29,14,40,32,41,0,45,40,7,22,34,27,27,43,14,11,32,26,2,16,5,15,23,13,27,18,36,13,14,10,16,11,13,29,26,43,32,47,9,20,23,31,27,40,8],[37,14,14,35,8,20,24,36,31,20,29,38,24,10,46,46,48,20,24,40,49,40,20,27,31,23,25,17,46,20,19,42,24,50,3,42,18,28,2,33,24,43,42,13,38,35,13,9,10,2],[23,28,37,48,18,19,3,43,6,4,9,44,18,5,4,12,38,46,36,9,16,6,40,11,48,49,39,32,23,31,7,41,43,28,3,7,31,23,46,24,28,48,7,10,35,44,20,40,49,26],[10,41,43,41,48,13,7,32,14,43,7,23,2,3,35,25,26,7,4,35,19,16,9,40,10,22,28,29,7,22,30,37,44,43,41,12,6,35,6,12,33,21,3,43,15,39,28,34,32,17],[4,43,2,40,46,4,20,32,49,8,23,11,7,8,15,3,37,30,24,38,9,11,38,40,17,7,45,0,39,26,40,23,46,44,21,44,6,5,10,14,29,43,25,11,20,2,2,41,40,43],[33,8,41,50,32,11,43,14,14,0,10,24,18,8,0,35,41,18,33,22,10,1,7,30,28,23,25,38,17,26,43,34,2,5,39,38,6,1,20,7,25,15,9,20,13,48,44,46,28,27],[50,42,39,16,38,20,37,23,4,22,33,25,27,48,16,44,3,33,37,2,7,10,40,1,30,15,27,13,0,0,48,13,41,7,14,29,45,17,49,16,9,19,17,4,46,29,12,50,6,37],[12,16,48,16,20,28,15,15,34,30,36,18,5,28,38,33,26,42,24,37,30,22,1,24,43,44,40,16,14,21,48,44,33,30,16,22,38,11,28,21,7,8,46,11,8,41,1,37,48,22],[33,26,35,36,34,34,3,34,11,4,23,8,25,6,46,15,1,25,48,18,12,43,24,29,14,50,23,1,17,4,12,36,38,22,2,21,26,23,42,39,32,14,33,36,46,37,21,46,33,34],[27,15,46,22,18,11,29,42,10,15,14,29,34,44,22,44,43,21,47,24,32,32,16,28,38,45,19,29,20,19,42,42,6,27,9,6,34,16,16,32,9,30,30,29,2,37,29,29,30,9],[30,34,31,32,25,46,5,20,14,38,16,25,15,27,12,0,1,31,24,13,12,20,42,35,32,16,8,8,16,18,42,11,24,8,44,16,30,37,9,17,29,17,12,48,30,41,1,18,4,22],[29,33,7,38,10,23,25,28,9,35,14,25,32,5,13,3,29,3,7,32,28,10,21,16,18,19,44,26,16,30,39,48,43,11,46,46,32,38,9,29,6,13,33,36,19,38,8,32,31,2],[49,17,5,50,28,13,36,7,50,16,29,29,25,45,14,16,48,2,30,14,8,43,38,31,42,33,44,41,38,42,10,35,18,42,35,3,31,14,19,36,15,2,48,12,12,34,34,31,11,2],[47,2,23,10,42,13,32,36,17,8,33,10,24,26,9,16,1,14,1,45,26,4,16,32,21,30,27,50,18,41,32,37,44,44,22,50,41,32,45,7,7,1,42,5,29,18,17,45,24,39],[11,40,15,29,8,48,46,9,15,34,43,32,15,5,13,31,32,6,35,42,32,31,22,24,29,42,12,9,3,7,10,27,43,28,41,50,27,12,13,50,42,17,21,44,11,33,41,42,24,45],[31,38,26,10,22,36,9,34,22,17,13,50,29,48,30,27,6,14,2,22,3,23,31,31,38,2,34,29,0,15,50,44,50,17,19,4,15,15,41,7,45,5,14,6,27,21,42,29,26,25],[8,32,34,1,34,47,29,39,41,38,26,24,24,7,43,17,35,30,42,4,19,4,47,25,3,34,28,4,33,19,39,38,29,4,26,3,41,14,42,44,31,16,10,9,30,24,4,1,38,2],[6,18,23,11,20,24,6,23,9,21,6,7,12,49,1,6,24,1,17,44,17,36,38,8,14,12,41,16,1,10,49,32,48,15,17,48,38,11,22,23,41,36,12,41,27,15,7,46,20,11],[9,42,6,47,8,34,24,14,30,32,31,40,3,27,29,48,47,13,20,29,6,9,1,22,46,8,10,25,20,23,33,25,0,21,2,30,11,30,26,46,50,18,18,42,21,12,26,0,42,8],[22,32,40,3,7,2,13,37,3,14,50,0,22,25,50,18,18,10,1,45,35,2,24,19,26,36,29,12,40,50,5,28,42,10,35,0,17,42,40,15,5,41,34,50,43,29,30,45,30,35],[42,16,44,8,39,31,30,19,40,20,31,7,29,8,36,10,29,34,21,22,47,44,34,34,11,19,39,47,9,11,18,35,23,39,19,23,8,3,2,24,42,0,18,39,2,24,25,0,46,23],[4,2,43,1,42,24,17,18,35,5,35,44,22,43,21,33,44,37,5,10,42,33,23,40,10,39,48,46,16,45,14,26,32,26,38,48,35,43,37,25,22,0,47,3,17,7,24,1,43,26],[33,36,29,41,16,7,19,41,35,2,30,8,6,14,5,8,40,39,12,10,32,50,41,44,7,37,15,27,13,45,27,16,21,47,7,1,23,15,33,13,12,17,10,38,41,6,44,29,30,8],[12,42,40,48,0,27,33,44,21,15,2,26,27,8,10,34,49,19,2,20,41,17,25,32,40,45,40,12,24,22,19,42,27,11,44,47,17,10,33,44,13,4,42,23,9,34,19,35,13,36],[48,37,26,2,35,14,17,5,5,8,28,48,44,47,7,13,19,13,34,42,4,30,42,23,11,7,31,41,14,34,3,8,27,23,6,36,13,25,9,44,16,1,47,13,47,12,42,35,32,20],[13,41,0,24,16,20,41,43,14,5,47,46,5,2,21,38,45,21,12,16,11,4,3,40,26,22,30,36,17,30,19,15,34,16,1,14,42,9,0,32,4,22,11,2,43,37,40,28,31,30],[21,50,26,29,4,16,39,22,49,43,15,20,36,40,46,50,26,2,24,8,28,22,26,9,44,0,18,47,26,15,34,31,41,27,45,27,41,39,29,46,37,8,40,19,25,5,23,7,30,11],[11,48,13,47,0,21,49,40,39,8,31,33,2,36,11,23,15,30,33,8,10,46,40,32,35,28,3,40,17,8,45,22,30,23,47,25,18,0,30,40,1,5,19,50,46,44,13,42,20,49],[2,37,14,22,10,46,13,49,34,42,25,39,26,10,44,28,14,43,39,22,8,4,28,32,35,24,19,43,43,24,35,48,12,39,20,44,22,20,34,32,3,28,5,41,21,26,5,13,31,42],[4,33,21,46,4,27,26,34,27,21,7,10,44,44,12,22,36,48,1,14,0,41,5,9,34,23,36,48,34,42,35,43,12,3,50,22,17,23,21,43,30,6,3,4,5,3,9,0,27,43],[21,48,26,49,35,6,32,39,46,32,50,12,34,33,50,2,29,1,18,7,3,13,50,49,7,43,50,44,27,5,26,15,40,15,20,12,24,50,5,21,48,39,5,5,1,9,24,9,50,16],[25,10,37,31,18,50,40,41,38,41,9,22,21,44,18,27,3,48,34,44,9,19,29,48,18,20,13,19,20,44,24,0,33,11,19,17,15,22,44,42,29,0,8,1,12,1,28,16,50,40],[8,27,45,30,23,46,41,48,27,31,31,7,6,7,2,39,46,31,37,19,24,4,24,18,44,38,7,44,39,27,35,30,11,49,29,20,14,32,27,13,21,46,27,48,3,7,4,6,24,18],[21,3,39,39,26,38,34,27,21,14,40,19,6,36,21,5,28,45,42,44,44,5,16,5,27,31,28,49,16,26,45,45,25,25,49,39,30,5,28,11,46,30,0,20,27,21,35,20,46,49],[8,6,24,39,50,24,45,8,42,29,29,10,28,17,23,12,44,44,41,18,9,48,43,31,16,10,6,23,29,11,13,5,45,5,41,32,46,8,19,26,21,14,10,40,23,27,36,17,22,12],[9,5,49,5,16,5,19,7,36,1,19,40,37,13,36,39,28,28,46,44,29,19,23,21,4,31,26,46,34,1,14,26,27,19,3,8,12,22,34,44,41,2,50,28,41,46,50,33,47,38],[11,11,38,39,45,15,29,19,27,3,38,28,37,13,8,9,23,2,4,42,3,19,26,43,47,43,39,14,17,39,7,14,30,25,24,46,36,46,16,14,47,48,33,42,45,8,28,21,23,3],[16,13,38,10,38,30,6,33,6,47,48,40,38,13,29,41,34,4,39,40,13,21,1,9,33,0,3,44,20,5,16,27,34,2,32,22,33,29,3,17,10,35,23,12,50,17,0,0,24,20],[40,46,7,40,10,38,42,39,44,42,13,21,0,3,18,45,23,36,35,14,41,18,42,39,41,32,19,34,7,16,6,8,28,16,26,6,43,0,30,24,7,21,18,50,21,30,10,35,24,15],[10,18,23,7,5,35,5,36,34,50,8,50,28,21,48,20,50,6,25,6,40,35,40,1,24,1,16,17,49,40,40,11,21,26,46,31,15,38,25,9,41,31,17,11,0,11,1,2,50,12],[42,27,37,31,11,15,4,7,40,13,20,27,19,34,30,31,5,39,15,38,23,7,28,2,48,14,5,50,0,3,36,20,16,21,11,32,24,22,39,29,41,29,20,14,35,33,6,48,25,0],[31,1,19,34,43,5,23,0,15,36,49,46,49,8,19,40,49,15,2,16,31,16,44,18,13,20,41,14,13,24,2,27,14,49,11,45,1,35,20,41,42,37,38,24,21,37,18,0,18,6],[1,30,39,41,34,38,0,24,6,2,16,45,13,2,14,27,20,2,8,11,30,22,50,35,48,41,11,6,18,12,29,24,30,29,9,29,39,44,36,45,22,30,4,7,26,30,22,1,38,30],[8,29,36,50,34,12,4,15,11,48,16,28,44,27,25,39,15,25,14,24,12,17,36,41,8,48,45,36,35,35,46,32,45,10,19,36,37,19,42,25,21,33,19,2,2,15,29,4,6,36],[48,34,37,22,39,41,20,18,44,24,32,30,6,36,30,41,35,32,37,29,14,28,27,15,13,2,48,19,11,41,35,22,24,45,15,5,29,5,48,44,13,31,30,43,29,17,10,9,19,1],[42,36,44,48,38,25,30,17,17,29,13,42,8,40,2,10,10,16,29,31,27,4,21,46,47,15,32,40,47,42,34,48,21,1,19,24,42,10,9,10,6,46,0,12,27,18,47,24,45,19]];
    let output = projectionAreaOf3D(input);
  })

});
