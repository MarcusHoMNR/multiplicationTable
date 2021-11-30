package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        if (isValid(start, end)) {
            return generateTable(start, end);
        }
        return null;
    }

    public Boolean isValid(int start, int end) {
        return isStartNotBiggerThanEnd(start, end) && isInRange(start) && isInRange(end);
    }

    public Boolean isInRange(int number) {
        return number >= 1 && number < +1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        StringBuilder multiplicationTable = new StringBuilder();
        for (int i = start; i <= end; i++) {
            multiplicationTable.append(i == end ? generateLine(start, i) : generateLine(start, i) + "\r\n");
        }
        return multiplicationTable.toString();
    }

    public String generateLine(int start, int row) {
        StringBuilder multiplicationLine = new StringBuilder();

        for (int multiplicand = start; multiplicand <= row; multiplicand++) {
            multiplicationLine.append(multiplicand == row ? generateSingleExpression(multiplicand, row) : generateSingleExpression(multiplicand, row) + "  ");
        }
        return multiplicationLine.toString();
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return multiplicand + "*" + multiplier + "=" + multiplicand * multiplier;
    }
}
