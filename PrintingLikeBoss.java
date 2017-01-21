
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
        while(sum < amount) {
            System.out.print(" ");
            sum++;
        }
    }

    public static void printTriangle(int size) {
        int num = size-1;
        int hold = 0;
        while(num >= 0) {
            printWhitespaces(size-1);
            printStars((size-(num))+hold);
            num--;
            size--;
            hold++;
        }
        
    }

    public static void xmasTree(int height) {
        int copyheight = height;
        int num = copyheight-1;
        int hold = 0;
        int xmas = 0;
        while(num >= 0) {
            printWhitespaces(copyheight-1);
            printStars(((copyheight-(num))+hold)+xmas);
            num--;
            copyheight--;
            hold++;
            xmas++;
        }
        num = height-1;
        int stand = 0;
        while (stand<2) {
            printWhitespaces(num-1);
            printStars(3);
            stand++;
            
        }
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(4);
        
        System.out.println("---");
        xmasTree(4);
        
        System.out.println("---");
        xmasTree(10);
                
    }
}
