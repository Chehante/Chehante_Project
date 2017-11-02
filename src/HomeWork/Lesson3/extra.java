package HomeWork.Lesson3;

public class extra {
    public static String scripting(String a, String b){
        byte[] abyte = a.getBytes();
        byte[] bbyte = b.getBytes();

        for (int i = 0; i < abyte.length; i++){
            abyte[i] ^= bbyte[i % bbyte.length];
        }
        return new String(abyte);
    }

    public static int[] bubblesoring(int[] array, boolean increase) {
        for (int k = array.length - 1; k >= 0; k--) {
            for (int j = 0; j <= k - 1; j++) {
                if (increase) {
                    if (array[j] > array[j + 1]) {
                        int t = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = t;
                    }
                }
                else{
                    if (array[j] < array[j + 1]) {
                        int t = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = t;
                    }
                }

            }
        }
        return array;
    }

    static int sumOfIntArray(int[] array){
        int sum = 0;
        for (int k:
                array) {
            sum += k;
        }
        return sum;
    }

}
