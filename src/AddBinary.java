package org.src;

public class AddBinary {

    public String addBinary(String a, String b) {

        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (aIndex >= 0 || bIndex >= 0 || carry > 0) {

            int aBit = 0;
            int bBit = 0;

            if (aIndex >= 0) {
                aBit = a.charAt(aIndex) - '0';
                aIndex--;
            }

            if (bIndex >= 0) {
                bBit = b.charAt(bIndex) - '0';
                bIndex--;
            }

            int sum = aBit + bBit + carry;

            if (sum == 2) {
                carry = 1;
                result.append("0");
            } else if (sum == 0) {
                carry = 0;
                result.append("0");
            } else if (sum == 1) {
                carry = 0;
                result.append("1");
            } else if (sum == 3) {
                carry = 1;
                result.append("1");
            }
        }

        return result.reverse().toString();

    }

    public static void main(String[] argc){
        AddBinary main = new AddBinary();
        System.out.println(main.addBinary("1111","1111"));

    }

}
