/**
 * Created by Lu on 9/6/2018.
 */
const getImportanceInternal = (empMap, id) =>{
  let employee = empMap.get(id);
  let empImp = employee[1];
  let subs = employee[2];
  if (subs && subs.length>0){
    for(let i=0;i<subs.length;i++){
      empImp += getImportanceInternal(empMap,subs[i]);
    }
  }
  return empImp;
};
const getImportance = (employees, id) => {
  // map employee array to map
  let empMap = new Map();
  for (let i=0;i<employees.length;i++){
    let employee = employees[i];
    empMap.set(employee[0],employee);
  }
  return getImportanceInternal(empMap, id);
};

export default getImportance;
