public class mergesort {
    public static void main(String[] args){


        int[] arr = { 70, 50, 30, 10, 20, 40, 60 };

        int[] merged = mergeSort(arr, 0, arr.length - 1);

        for (int val : merged) {
            System.out.print(val + " ");
        }
    }
    public static int[] Mergetwosortedarray(int[] one,int[] two)
    {
        int[] sorted =new int[one.length+two.length];
        int i= 0,j=0,k=0;
        while(i<one.length && j <two.length){
            if(one[i]<two[j])//compare first array and second array values
            {
                sorted[k] = one[i];
                k++;
                i++;
            }
            else
            {
                sorted[k] = two[j];
                k++;
                j++;
            }
        }
        if(i == one.length){
            while(j<two.length){
                sorted[k] = two[j];
                k++;
                i++;
            }
        }
        if(j == two.length){
            while (i<one.length){
                sorted[k] = one[i];
                k++;
                i++;
            }
        }
        return sorted;
    }

    public static int[] mergeSort(int[] arr, int i, int k)
    {
    if(i == k) {
        int[] br = new int[1];
        br[0] = arr[i];
        return br;
    }
    int mid =(i+k)/2;
    int[] fh = mergeSort(arr, i, mid);
    int[] sh = mergeSort(arr, mid+1, k);
    int[] merge = Mergetwosortedarray(fh,sh);
    return merge;
    }


}
