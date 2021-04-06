package org.teaching.access;

class EntryPoint {
    public static void main(String[] args) {
        int a; // Declaring a.
        {
            int b; // Declaring b.
            a = 3; // Writing data to outer, accessible field.
            {
                int c;
                b = 4; // Writing data to outer, accessible field.
            }
            System.out.println("I have access to a and b: " + a + ", " + b);
            // c = 4; // One is not able to write to inner, inaccessible field.
        }
        System.out.println("I have access to a only: " + a);
    }
}