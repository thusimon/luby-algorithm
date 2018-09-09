/**
 * Created by Lu on 9/6/2018.
 */
import expect from 'expect';
import empImportance from './EmployeeImportance';

describe("Employee importance!",()=>{
  it("should return 11",()=>{
    let input = [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]];
    expect(empImportance(input, 1)).toEqual(11);
  });
});
