/**
 * Created by Lu on 8/30/2018.
 */
const SubdomainVisitCount = (cpdomains) => {
  let domains={};
  for (let i=0; i<cpdomains.length; i++){
    let cpdomain = cpdomains[i].split(' ');
    let count = parseInt(cpdomain[0]);
    let domain = cpdomain[1].split('.');
    for (let j=domain.length-1; j>=0; j--){
      let domainParts = domain.slice(j,domain.length).join('.');
      domains[domainParts] = domains[domainParts] ?
        (domains[domainParts]+count) : count
    }
  }
  let result=[];
  for (let key in domains){
    let domainCount = domains[key];
    result.push(domainCount + " " + key);
  }
  return result;
};

export default SubdomainVisitCount;
