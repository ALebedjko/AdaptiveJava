public class BitShift {

    public static void main(String[] args) {

        int val = 25;   // binary: 0001 1001, decimal: 25

        val = val << 1; // binary: 0011 0010, decimal: 50
        val = val << 2; // binary: 1100 1000, decimal: 200
        System.out.println("val = " + val);

        val = 40; // binary: 0010 1110, decimal: 40
        int anotherVal = val >> 1; // binary: 0111, decimal: 20, same as 40 / 2
        int secondAnotherVal = val >> 2; // binary: 1010, decimal: 10, same as 40 / 4
        int thirdAnotherVal = val >> 3; // binary: 0101, decimal: 5, same as 40 / 8

        System.out.println("anotherVal = " + anotherVal);
        System.out.println("oneMoreAnotherVal = " + secondAnotherVal);
        System.out.println("thirdAnotherVal = " + thirdAnotherVal);
    }
}
