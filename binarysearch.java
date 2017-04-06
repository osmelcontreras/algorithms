//Binary Search Method

private int binarySearch(T searchValue, int lowIndex, int highIndex)
   {
      // A stub to return a value of the correct type
      //Here is the recursive algorithm for Binary Search
      if(lowIndex>highIndex)
      return -1;
while(lowIndex<highIndex){
int midIndex=lowIndex+(highIndex-lowIndex)/2;
   if(listItem[midIndex].equals(searchValue)){
      return midIndex;
   }else if(listItem[midIndex].compareTo(searchValue)>0){
     return binarySearch(searchValue, lowIndex, midIndex-1);
   }else{
      return binarySearch(searchValue, midIndex+1, highIndex);
      }
}
return 0; }
