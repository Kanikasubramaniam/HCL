public class AllOperatorsExample {
    public static void main(String[] args) {

        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("\nRelational Operators:");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("\nLogical Operators:");
        System.out.println("(a > b && b > 0) = " + (a > b && b > 0));
        System.out.println("(a > b || b < 0) = " + (a > b || b < 0));
        System.out.println("!(a > b) = " + !(a > b));
        System.out.println("\nAssignment Operators:");
        int x = 10;
        x += 5;  // x = x + 5
        System.out.println("x += 5: " + x);
        x -= 3;
        System.out.println("x -= 3: " + x);
        x *= 2;
        System.out.println("x *= 2: " + x);
        x /= 4;
        System.out.println("x /= 4: " + x);
        System.out.println("\nUnary Operators:");
        int y = 5;
        System.out.println("y = " + y);
        System.out.println("++y = " + (++y)); // pre-increment
        System.out.println("y++ = " + (y++)); // post-increment
        System.out.println("--y = " + (--y)); // pre-decrement
        System.out.println("y-- = " + (y--)); // post-decrement
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max value = " + max);
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("\nShift Operators:");
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));

    }
}