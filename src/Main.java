public class Main {

    public static void main(String[] args) {
	    int [] a = {0, 1, 5, 8, 10, 15, 20, 23};
	    int key = 12;
        System.out.println(binarySearch(a, key, 0, a.length-1));
    }

    public static int binarySearch (int [] a, int key, int firstElement, int lastElement) {
        if (firstElement<=lastElement){
            int middle = firstElement + (lastElement - firstElement)/2;
            if (key == a[middle])
                return middle;
            else if (key < a[middle])
                return binarySearch(a, key, firstElement, middle-1);
            else
                return binarySearch(a, key, middle+1, lastElement);
        } else
            return -1;
    }
}
