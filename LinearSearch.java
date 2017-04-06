/* linear search O(1) O(n)
 
 **Linear search needs to go through the whole list n times! 
 **Linear search is inefficient algo

 Linear Search(value, list)
if the list is empty, return ^;
else if the item of the list has the desired value,
return its location;
else 
return linearsearch(value, reminder of the list) */

public LinearSearch(final data, key){
	for(int i= 0; i<data.length; i++){
		if (data[i] >key){
			return -1;
		}
	else 
		if(data[i] == key) {
			return i;
		}
	return -1;
}

