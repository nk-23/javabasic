public class average {
    public static void main(String[] args) {
        int[] numarray = arrayutiliyt.inputArray();
        int avg = average(numarray);
        System.out.println(avg);

    }
    public static int average(int[]numarray){
        int sum =0;
        int average =0;
        for(int  i =0;i<numarray.length;i++){
            sum+=numarray[i];
            average = sum/numarray.length;
        }
        return average;
    }
}

