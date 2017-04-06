/* Insertion sort O(n^2)   
inefficient algorithm 
*/
public stataic void int InsertionSort(int[] a){
	for(int i=1; i<a.length; i++){
		int temp =a[i];
		int j;
		for(j=i-1; J>= 0 && temp<a[j]; j--){
			a[j+1]= a[j];
			a[j+1]= temp;
		}
	}
}

/*

*/