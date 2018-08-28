/**
 * Created by Lu on 8/26/2018.
 */

const flippingImage = (img)=>{
  return img.map(row=>{
    let rowlen = row.length;
    let reverseRow = row.map((curValue, idx, arr)=>{
      return +!arr[rowlen-idx-1];
    });
    return reverseRow;
  });
};

export default flippingImage;
