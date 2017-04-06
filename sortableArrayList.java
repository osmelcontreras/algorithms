/**
  SortableArrayList is an implementation of a sortable list
  using arrays.
*/
abstract class SortableArrayList<T extends Comparable<T>>
{
   protected T[] listItem;
	
	protected int itemCount;
	
	private static int DEFAULT_CAPACITY = 50;
	
	private boolean isSorted;
	
	// Constructs a list with the specified capacity
	public SortableArrayList(int capacity)
	{
	   @SuppressWarnings("unchecked")
	   T[] tempList = (T[]) new Comparable[DEFAULT_CAPACITY];
		listItem = tempList;
		itemCount = 0;
		isSorted = false;
   }

   // Constructs a list with the default capacity	
	public SortableArrayList()
	{
	   this(DEFAULT_CAPACITY);
	}
	
   /* Adds item to end of list
	   pre-contition: itemCount < listItem.length() - 1
		post-contition: itemCount == itemCount@pre + 1
		                item added to end of list
	*/	
	public void append(T newItem)
	{
	  listItem[itemCount] = newItem;
	  itemCount++;
    //List may no longer be sorted
	  isSorted = false;  
	}
	
	/* Return item in given position
	   If position is out of range, return null
	*/
	public T getItem(int position)
	{
	   if (0 <= position && position < itemCount)
		  return listItem[position-1];
		else
		  return null;
	}
	
	// Return length of list
	public int getLength()
	{
	  return itemCount;
	}
	
	// Sort list
	public void sort()
	{
	  sortSublist(0,itemCount-1);
	  
	}
	
	// Sort sublist from lowIndex to highIndex
	abstract protected void sortSublist(int lowIndex, int highIndex);
	//MY CODE starts Here
	
	abstract class SortableArrayListWithSelectionSort<T> extends SortableArrayList{
	
		protected void sortSublist(int lowIndex, int highIndex){
	
	 	String[] tempArray=new String[itemCount];
		for(int i=0; i<=itemCount-1; i++)
		{
			String first=tempArray[lowIndex];
				for(int j=i+1; j<itemCount; j++)
				{
					String next=tempArray[highIndex];
				
					if(first.compareTo(next)>0)
					{
						lowIndex=j;
					}
				
					String temp=tempArray[lowIndex];
					tempArray[lowIndex]=tempArray[i];
					tempArray[i]=temp;
				
				}
		}
		
	}
	}
	
	/*
	  Returns the position of the item with the given value.
	  If the item is not in the list, returns -1.
	*/
	public int search(T searchValue)
	{
	   if (isSorted)
		{
		  return binarySearch(searchValue,0,itemCount-1);
		}
		else
		{
		  return linearSearch(searchValue);
		}
	}
	
	/*
	  Searches for the index of the given value using the binary search algorithm
	*/ 
	private int binarySearch(T searchValue, int lowIndex, int highIndex)
	{
	
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
		
		return 0;
	}
	
	// Searches for the index of the given value using linear search
	private int linearSearch(T searchValue)
	{
	   // A STUB to return a value of the correct type
		// Here is the Linear Search for the given list
		if(searchValue==null)
		return -1;
		
		for(int i=0; i<=itemCount; i++)
		{
			if(searchValue.equals(listItem[i]))
			return i;
		}
		
		return 0;
	}
	
	// Returns a string of the items in the list -- 
	public String toString()
	{
	   StringBuilder returnStringBuilder = new StringBuilder();
		
		for (int i = 0; i < itemCount; i++)
		{
		   returnStringBuilder.append(listItem[i].toString() + "\n");
	   }
		
		return returnStringBuilder.toString();
	}	  
}
