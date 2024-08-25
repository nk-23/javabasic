public class twodArray {
    public static void main(String[] args) {
        //int[][]arr=new int[2][3];
        //arr[0][0]=5;
      //  int[][]inArray = {{1,2,5},{8,9,4}};
        int[][]arr1= {{1,2,3},{4,5,6},{8,9,8}};
       // System.out.println(arr[0].length);
        //traversal in 2d array
        for(int i =0;i<arr1.length;i++){
            for(int j =0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
