/* Merge sort (divide and conquer I)
- divide list into n sublists
- Repetedly merge sublist to produce new sorted sublists
*/

public static void MergeSort(int[] data, int first, int n){
	int n1;
	int n2;
	if(n>1){
		n1=n12;
		n2= n-n1;
		MergeSort(data, first, n1) // data[first] --> data[first+ n1] +-1
		MergeSort(data, first+n1, n2) //data[first+n1] --> to the end;
		merge(data, first, n1, n1);
	}
}

private static void merge(int[] data, int fist, int n1, int n2){
//precondition: data has at least n1+n2 components stating at data
// memory n1+n2 ints
	int [] temp = new int[n1+n2];
	int copy1 = 0;
	int copy2 = 0;
	int copy3 = 0;
	//merge elements

	while(copy1<n1) &&(copy2<n2){                          //CHECK WHAT THIS DOES!
		if(data[first+copy1] <data[first+n+copy2])
			temp[copied++]= data[first+copied1++]);
	else
		temp[copied++] == data[first+n1+(coppied++)];
	while(copied<n1)
		temp[copied++]=data[first+(copied++)];
	while(copied2<n2)
		temp[copied++]=temp[first+n1+(copied2++)];
	}
}