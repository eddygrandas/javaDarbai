import java.lang.reflect.Array;
import java.util.*;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// skirtumas tarp dvieju elementu
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Integer> list = Arrays.asList(6,4,2,9,1,16,5,17,100,20,19);
        int diff=Math.abs(list.get(0)-list.get(1));
        int pirmas=0;
        int antras=0;
    for (int i = 0;i<list.size()-1;i++)
    {
        int skirtumas= Math.abs(list.get(i)-list.get(i+1));
        if (skirtumas<diff)
        {
            diff=skirtumas;
            pirmas=list.get(i);
            antras=list.get(i+1);
        }

    }
        System.out.println(pirmas);
        System.out.println(antras);
int toFind=5;
        Collections.sort(list);
        int mid = list.size()/2;
        if (list.get(mid)==toFind)
        System.out.println(list.get(mid));
    }
//    public int runBinarySearchIteratively(
//            int[] sortedArray, int key, int low, int high) {
//        int index = Integer.MAX_VALUE;
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            if (sortedArray[mid] < key) {
//                low = mid + 1;
//            } else if (sortedArray[mid] > key) {
//                high = mid - 1;
//            } else if (sortedArray[mid] == key) {
//                index = mid;
//                break;
//            }
//        }
//        return index;
//    }
}