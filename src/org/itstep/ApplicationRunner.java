package org.itstep;

import java.sql.SQLOutput;

public class ApplicationRunner {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        long c = 12;
        double d = 12.5;
        double e = 16.1;

        double maxResult = 0;

        if (maxResult < a * b) {
            maxResult = a * b;
        }
        if (maxResult < a * c) {
            maxResult = a * c;
        }
        if (maxResult < a * d) {
            maxResult = a * d;
        }
        if (maxResult < a * e) {
            maxResult = a * e;
        }
        if (maxResult < b * c) {
            maxResult = b * c;
        }
        if (maxResult < b * d) {
            maxResult = b * d;
        }
        if (maxResult < b * e) {
            maxResult = b * e;
        }
        if (maxResult < c * d) {
            maxResult = c * d;
        }
        if (maxResult < c * e) {
            maxResult = c * e;
        }
        if (maxResult < d * e) {
            maxResult = d * e;
        }
        System.out.println("Max result is " + maxResult);
    }
    }

