/* Quick Sort    

**Efficient Sorting  ---->   O(nlong n)

function partition(array, left, right,pivot index)
pivotValue = array[pivotIndex];
swap array[pivotIndex] and array[right]
storeIndex = left;
for(i from left to right-1)
	if array[i]= pivot value
	swap array[i] and array[storeIndex]
	storeIndex = storeIndex +1;

swap array[storeIndex] and array[right]
	return storeIndex;
function quickSort(array, left, right)
	if(left<right)
*/
public static void QuickSort(int[] a, int p, int r){
	if(p<r){
		int q= partiiton(a, p, r);
		QuickSort(a,p,q);
		QuickSort(a,q+1,r);
	}
}
private static partition(int[] a, int p. int r){
	int x= a[p];
	int i= p-1;
	int j = r+1;
}
while(true){
	i++;
	while(i<r && a[i]<x)
		i++;
	j--;
	while(j>p && a[j]>x)
		j--;
	if(i<j)
		swap(a,i,j);
	else
		return j;
}
}
private static void swap(int []a, int i, int j){
	int temp =a[i];
	a[i]=a[j];
	a[j]= temp;
	//O(n^2)  ---> O(n log n)
}
}
