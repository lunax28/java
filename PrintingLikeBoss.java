
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {

        while (amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.println();

    }

    public static void printWhitespaces(int amount) {
        
        int sum = 0;
        while(sum < amount -1) {
            System.out.print(" ");
            sum++;
        }
    }

    public static void printTriangle(int size) {
        int num = size-1;
        int hold = 0;
        while(num >= 0) {
            printWhitespaces(size);
            printStars((size-(num))+hold);
            num--;
            size--;
            hold++;
        }
        
    }

    public static void xmasTree(int height) {
        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(4);
        /*
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
                */
    }
}