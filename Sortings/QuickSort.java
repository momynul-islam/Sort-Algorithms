public class QuickSort {
    public void sort(int[] array){
        sort(array,0,array.length-1);
    }

    private void sort(int[] array, int start, int end){
        if(start >= end) return;
        var partition_index = partition(array,start,end);

        sort(array,0,partition_index-1);
        sort(array,partition_index+1,end);
    }
    private int partition(int[] array,int start,int end){
        var pivot = array[end];
        var boundary = start-1;
        for(var i=start; i<=end; i++){
            if(array[i] <= pivot)
                swap(array,i,++boundary);
        }
        return boundary;
    }
    private void swap(int[] array,int first,int second){
        var temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
