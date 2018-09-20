/**
 * Created by Lu on 9/16/2018.
 */
const floodFillInternal = (image,sr,sc,originColor,newColor)=>{
  if (sr<0||sr>=image.length||sc<0||sc>=image[0].length){
    return image;
  }
  if (image[sr][sc]!=originColor){
    //flood on invalid pixel
    return image;
  }
  if (image[sr][sc]==newColor){
    //already visited
    return image;
  }
  image[sr][sc]=newColor;
  floodFillInternal(image,sr-1,sc,originColor,newColor);
  floodFillInternal(image,sr+1,sc,originColor,newColor);
  floodFillInternal(image,sr,sc-1,originColor,newColor);
  floodFillInternal(image,sr,sc+1,originColor,newColor);
  return image;
};
const floodFill = (image,sr,sc,newColor)=>{
  let originColor = image[sr][sc];
  return floodFillInternal(image,sr,sc,originColor,newColor);
};

export default floodFill;
