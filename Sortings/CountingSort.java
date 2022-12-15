import java.util.Arrays;
import java.util.Collections;

public class CountingSort {
    public void sort(int[] array){
        var max = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++)
            if(array[i] > max) max = array[i];

        int[] counts = new int[max+1];
        for(var item: array)
            counts[item]++;

        var k = 0;
        for(var i=0; i<counts.length; i++)
            for(var j=0; j<counts[i]; j++)
                array[k++] = i;
    }
}
