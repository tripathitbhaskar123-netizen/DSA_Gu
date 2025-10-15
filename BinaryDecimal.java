public class Q10_BinaryDecimal {
    static int binaryToDecimal(int bin) {
        int dec = 0, base = 1;
        while (bin > 0) {
            int last = bin % 10;
            dec += last * base;
            base *= 2;
            bin /= 10;
        }
        return dec;
    }

    static String decimalToBinary(int dec) {
        String bin = "";
        while (dec > 0) {
            bin = (dec % 2) + bin;
            dec /= 2;
        }
        return bin;
    }

    public static void main(String[] args) {
        int bin = 1011;
        int dec = 13;
        System.out.println("Binary to Decimal: " + binaryToDecimal(bin));
        System.out.println("Decimal to Binary: " + decimalToBinary(dec));
    }
}
