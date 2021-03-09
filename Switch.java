import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;
         double total = 0;
        int gradeCounter = 0;
        double grade = 0;

        Scanner sc = new Scanner(System.in);
        System.out.printf("%s%n%s%n   %s%n   %s%n", "Enter the integer grades in the range 0-100.", "Type the end-of-file indicator to terminate input:", "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter", "On Windows type <Ctrl> z then press Enter");
        while (gradeCounter<=6) {
            grade = sc.nextDouble();
            total =  total + grade;
            gradeCounter++;


                switch ((int) grade) {
                    case 9:
                    case 10:
                        ++aCount;
                        break;
                    case 8:
                        ++bCount;
                        break;
                    case 7:
                        ++cCount;
                        break;
                    case 6:
                        ++dCount;
                        break;
                    default:
                        ++fCount;
                        break;

                }
            }


            System.out.println("%nGrade Report%n");
        
        if(grade>=0) {
    double average = total / gradeCounter;
    System.out.printf("The total of %d grade entered is %d", gradeCounter, total);
    System.out.printf("class average is %d%n", average);
    System.out.printf("%n%s%ns%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
            "Number of students who received each grade:",
            "A: ", aCount,
            "B: ", bCount,
            "C: ", cCount,
            "D: ", dCount,
            "F: ", fCount);
}
             else    System.out.println("No grades were entered");
        }
    }
