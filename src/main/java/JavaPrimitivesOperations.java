public class JavaPrimitivesOperations {
    public static void main(String[] args) {

        // Whole numbers
        System.out.println("\n" + "-Whole numbers-");
        byte byte_a = 1;   // 1 byte, -128 to 127 range
        short short_a = 2; // 2 bytes, from  -32768 to 32767 range
        int int_a = 3;     // 4 bytes, from -2147483648 to 2147483647 range
        long long_a = 1L; //  8 bytes,  from -9223372036854775808 to 9223372036854775808 range

        System.out.println("byte: " + byte_a + "\n" + "short: " + short_a + "\n" + "int: " + int_a + "\n" + "long: " + long_a);

        //Float numbers
        System.out.println("\n" + "-Float numbers-");
        float float_a = 1.1f; // fractional numbers from 3.4e−038 to 3.4e+038
        double double_a = 1.2d; // fractional numbers from 1.7e−308 to 1.7e+308

        System.out.println("float: " + float_a + "\n" + "double: " + double_a);

        //Overflow examples
        System.out.println("\n" + "-Overflow examples-");
        byte_a += 127;
        short_a += 32767;

        System.out.println("byte: " + byte_a + "\n" + "short: " + short_a);

        //Basic operations
        System.out.println("\n" + "-Basic operations-");
        int a = byte_a + 3;
        int b = int_a - 1;
        int c = int_a * 11;
        int d = c / 6;
        System.out.println("a = " + a + "\n" + "b = " + b + "\n" + "c = " + c + "\n" + "d = " + d);   // d has result without fraction

        // data types combination
        System.out.println("\n" + "-Data types combination-");
        int z = 53;
        float x = 14.23f;
        System.out.println("z * x = " + (z * x)); // result: 754.19
        System.out.println("z / x = " + (z / x)); // result: 3.7245257

        // Logical operations
        System.out.println("\n" + "-Logical operations");
        int b1 = 5;
        int b2 = 6;
        System.out.println("true example = " + (b1 > 4 && b2 > 3));  // true
        System.out.println("false example = " + !(b1 > 4 && b2 > 3)); // false


    }

}