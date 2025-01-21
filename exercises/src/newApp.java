public class newApp {
    public static void main(String[] args) {
        long[] arr;
        arr = new long[100];
        int nelements=0;
       
        long searchKey;

        arr[0] = 77; 
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nelements=10;

        for (int i=0; i<nelements; i++){
            System.out.print(arr[i]+" ");
            System.out.println("");
        }

        searchKey=66;
        for (int i = 0; i < nelements; i++) {
            if (arr[i]==searchKey) {
                break;
            }
            if (i==nelements) {
                System.out.println("Can't find");
            }
            else{
                System.out.println("Found"+searchKey);
            }
        }

    }
}
