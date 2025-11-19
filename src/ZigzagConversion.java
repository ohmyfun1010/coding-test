package org.src;

public class ZigzagConversion {

    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int curRow = 0;
        boolean goingDown = true;

        for (char c : s.toCharArray()) {

            rows[curRow].append(c);

            if (curRow == 0) {
                goingDown = true;
            } else if (curRow == numRows - 1) {
                goingDown = false;
            }

            curRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ZigzagConversion z = new ZigzagConversion();

        String s = "PAYPALISHIRING";
        int numRows = 3;

        String result = z.convert(s, numRows);
        System.out.println(result);
    }

}
