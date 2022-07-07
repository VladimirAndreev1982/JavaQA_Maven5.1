package ru.netology.sqr;

public class SQRService {

    public int calculate(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int iSqr = i * i;
            if (iSqr >= min) {
                if (iSqr <= max) {
                    count++;
                }
            }
        }
        return count;
    }
}