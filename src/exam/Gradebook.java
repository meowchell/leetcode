package exam;

import java.util.Scanner;

public class Gradebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students:");
        int count = scanner.nextInt();
        Grade[] grades = new Grade[count];
        int i = 0;
        System.out.println("-----Gradebook------");
        while (i <count){
            Grade g = new Grade();
            System.out.print("Enter the name of students:");
            g.name = scanner.next();
            System.out.print("Enter the grade of students:");
            g.grade = scanner.nextInt();
            grades[i++] = g;
        }


        System.out.println("-----Final letter Grade------");
                for (Grade g:grades){
                    System.out.print(g.name+"'s final grade is: ");
                    if (g.grade >= 90) {
                        System.out.print("A");
                    }else if (g.grade>=80){
                        System.out.print("B");
                    }else if (g.grade>=70){
                        System.out.print("C");
                    }else if (g.grade>=60){
                        System.out.print("D");
                    }else {
                        System.out.print("F");
                    }
                    System.out.println();
                }




    }
}
