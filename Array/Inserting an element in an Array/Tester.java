class ArrayTest{
    public static void insert(String[] ar, int pos, char val){
        for(int i=ar.length-1; i>=pos; i--){
            ar[i] = ar[i-1];
        }
        ar[pos-1] = val;
    }
}
class Tester{
    public static void main(){
        Array arr[] = new Array[6];
        arr[0] = 'A';
        arr[1] = 'B';
        arr[2] = 'C';
        arr[3] = 'D';
        arr[4] = 'E';

        ArrayTest.insert(arr, 4, 'M');
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}