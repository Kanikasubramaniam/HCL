 import java.util.Scanner;
class Main{

        /*int  a = 10;
        float b = 20.5f;
        long c=100000000000000L;
        double d = 3.14159;
        char e  = 'A';
        boolean f = true;
        String g  = "hello world";
        System.out.println(a);
        int h = (int) b;
        double  i = (double) a;
        System.out.println(h); 
        System.out.println(i);*/

      /*  Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else if (marks >= 0) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid marks");
        }

        sc.close();*/

        /*int[] marks = {85, 78, 92, 66, 74};

        int total = 0;
        for (int m : marks) {
            total += m;
        }

        double average = (double) total / marks.length;

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        // Grade calculation
        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else if (average >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }*/

    public static double calculateAverage(int[] marks) {
        int total = 0;

        for (int m : marks) {
            total += m;
        }

        return (double) total / marks.length;
    }

    // Method to calculate grade
    public static String calculateGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        int[] marks = {85, 78, 92, 66, 74};

        double avg = calculateAverage(marks);
        String grade = calculateGrade(avg);

        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}
    
