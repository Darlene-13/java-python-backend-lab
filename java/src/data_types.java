// This are some basic data types in java
public class data_types {
    public static void main(String[] args){

        // Primitive data types
        byte b = 5; // 1 byte
        int numbers = 10; // 4 bytes
        boolean isgood = true; // 1 byte
        char c = 'A'; // 2 bytes
        float f = 5.99f; // 4 bytes
        double d = 19.99; // 8 bytes
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);

        // Objects
        String filename = "document.txt";
        byte[] dataArray = new byte[1024]; // 1 KB array


        // Creating new arrays
        byte[] fileData = new byte[1000];
        int[] numArray = new int[10];

        // Working with arrays
        fileData[0] = 1;
        numArray[0] = 10;
        System.out.println("First element in numArray: " + numArray[0]);
 
        //Methods and functions in java
        public static int countFrequency(byte[], data, byte, target){
            int count = 0;
            for (byte b: data) {
                if (b== target) {
                    count ++
                }
            }
            return count;
        }
 
    }
}

