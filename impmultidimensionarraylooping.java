public class impmultidimensionarraylooping {
    public static void main(String[] args) {
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        System.out.println("length of array is : " + myNumbers.length);
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) // here myNumbers[i] means myNumber[1] then
                                                          // myNumbers[i].length will be 4 then firt (0,0): (0,1)
                                                          // :(0,2):(0,4)
            {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
