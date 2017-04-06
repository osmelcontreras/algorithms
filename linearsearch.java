//LINEAR SEARCH METHOD
   private int linearSearch(T searchValue)
   {
      // A STUB to return a value of the correct type
      // Here is the Linear Search for the given list
      if(searchValue==null)
      return -1;
      for(int i=0; i<=itemCount; i++)
      {
         if(searchValue.equals(listItem[i]))
return i; }
return 0; }
