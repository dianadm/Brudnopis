package codewars;

public class Seven {

    public static String getMiddle(String word) {
        //Code goes here!
        int index = word.length() / 2;
        if (word.length() % 2 == 0) {
            return word.substring(index - 1, index + 1);
        }
        return word.substring(index, index + 1);
    }


    public static String rotateLeft(String m, int rotationNum) {
        String str = String.valueOf(m);
        String firstChars = str.substring(0, rotationNum);
        str = str.substring(rotationNum);
        String charToMove = str.substring(0, 1);
        return firstChars.concat(str.substring(1)).concat(charToMove);
    }

    public static long maxRot(long n) {
        String current = String.valueOf(n);
        long max = n;
        for (int i = 0; i < current.length(); i++) {
            String result = rotateLeft(current, i);
            current = result;
            if (Long.valueOf(result) > max) {
                max = Long.valueOf(result);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxRot(507992495));
//testing(MaxRotate.maxRot(38458215), 85821534);
        //testing(MaxRotate.maxRot(195881031), 988103115);
        //testing(MaxRotate.maxRot(896219342), 962193428);
        //testing(MaxRotate.maxRot(69418307), 94183076);
    }
}
