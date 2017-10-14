public class Additional_Helping {

    public static void main(String[] args){
        int[] array = getArrayOfNumeralsOfNumber(435);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int[] getArrayOfNumeralsOfNumber(int number){

        int numberlength = Integer.toString(number).length();

        int[] arrayOfNumerals = new int[numberlength];

        int i = 0;
        while (number != 0){
            arrayOfNumerals[i++] = number%10;
            number /= 10;
        }

        return arrayOfNumerals;

    }

}
