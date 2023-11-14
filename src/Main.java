public class Main {

    public static void main(String[] args) {

        //Task 1.1
        int[] myArray = new int[5];
        myArray [2] = 3;
        for (int counter = 0; counter < 5; counter++){
            System.out.println("Counter is " + counter);
            System.out.println("The element value is " + myArray[counter]);
        }

        //Task 1.2
        String[] nameArray = new String[5];
        nameArray [0] = "Mark";
        for (int name = 4; name >=0 ; name--){
            System.out.println("Counter is " + name );
            System.out.println("The element value is " + nameArray[name]);
        }

        //Task 2
        String str = "Hello, World!";
        char[] charArray = str.toCharArray();
        char targetChar = 'o';
        boolean charFound = false;
        for (char chars : charArray) {
            if (chars == targetChar) {
                charFound = true;
                break;
            }
        }
        if (charFound) {
            System.out.println("The character '" + targetChar + "' occurs in the string");
        }
        else {
            System.out.println("The character '" + targetChar + "' occurs in the string");
        }
    }
}
