package org.teaching.figure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EntryPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Choose side a > ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Choose side b > ");
        int b = Integer.parseInt(reader.readLine());
        System.out.print("Choose side c > ");
        int c = Integer.parseInt(reader.readLine());
        System.out.print("Choose side d > ");
        int d = Integer.parseInt(reader.readLine());

        QuadrangleInfo info = calculateQuadrangleInfo(a, b, c, d);
        System.out.println("Calculated following info:");
        System.out.println("Kite          : " + info.isKite());
        System.out.println("Parallelogram : " + info.isParallelogram());
        System.out.println("Rhombus       : " + info.isRhombus());
    }

    public static QuadrangleInfo calculateQuadrangleInfo(int a, int b, int c, int d) {
        if (a <= 0 || b <= 0 || c <= 0 || d <= 0) {
            throw new IllegalArgumentException("Some argument is less or equal to zero: " + a + ", " + b + ", " + c + ", " + d);
        }
        QuadrangleInfo info = new QuadrangleInfo();
        info.setKite((a == b && c == d) || (b == c && d == a));
        info.setParallelogram(a == c && b == d);
        info.setRhombus(info.isKite() && info.isParallelogram());

        return info;
    }
}
