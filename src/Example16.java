import java.util.Scanner;

public class Example16 {
    public static void main(String[] argv) {
        int grade;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Enter number 1 to 10");
        grade = inputValue.nextInt();

        switch(grade) {
            case 1 :
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4 :
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("ERROR");

        }

    }
}
