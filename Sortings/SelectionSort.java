public class SelectionSort {
    public void sort(int[] array){
        for(var i=0; i<array.length; i++){
            var min_index = i;
            for(var j=i; j<array.length; j++)
                if(array[j] < array[min_index])
                    min_index = j;
            swap(array,i,min_index);
        }
    }

    private void swap(int[] array,int first,int second){
        var temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
