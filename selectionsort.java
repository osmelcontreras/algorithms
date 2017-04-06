//SELECTION SORT ALGORITHM


abstract protected void sortSublist(int lowIndex, int highIndex);
   //MY CODE starts Here
   abstract class SortableArrayListWithSelectionSort<T> extends
SortableArrayList{
      protected void sortSublist(int lowIndex, int highIndex){
      String[] tempArray=new String[itemCount];
      for(int i=0; i<=itemCount-1; i++)
      {
         String first=tempArray[lowIndex];
            for(int j=i+1; j<itemCount; j++)
            {
} }
} }
