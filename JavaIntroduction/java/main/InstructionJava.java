package main;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class InstructionJava {

    public boolean drawHorizontalLine(InputStream in, PrintStream out) {
        Scanner keyboard = new Scanner(in);
        out.println("Give a number more than 0");
        int input = keyboard.nextInt();

        for (int i = 0; i < input; i++) {
            out.print("*");
        }
        return true;
    }

    public boolean drawVerticalLine(InputStream in, PrintStream out) {
        Scanner keyboard = new Scanner(in);
        out.println("Give a number more than 0");
        int input = keyboard.nextInt();

        for (int i = 0; i < input; i++) {
            out.println("*");
        }
        return true;
    }

    public boolean drawRightTriangle(InputStream in, PrintStream out) {
        Scanner keyboard = new Scanner(in);
        out.println("Give a number more than 0");
        int input = keyboard.nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < i + 1; j++) {
                out.print("*");
            }
            out.println();
        }
        return true;
    }
    //IsoscelesTriangle

    public boolean drawIsoscelesTriangle(InputStream in, PrintStream out) {
        Scanner keyboard = new Scanner(in);
        out.println("Give a number more than 0");
        int input = keyboard.nextInt();

        for (int i = 1; i < input + 1; i++) {
            for (int j = 0; j < input - i; j++) {
                out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                out.print("*");
            }
            out.println();
        }
        return true;
    }

    public boolean drawDiamond(InputStream in, PrintStream out) {
        Scanner keyboard = new Scanner(in);
        out.println("Give a number more than 0");
        int input = keyboard.nextInt();

        for (int i = 1; i < input + 1; i++) {
            for (int j = 0; j < input - i; j++) {
                out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                out.print("*");
            }
            out.println();
        }
        for (int i = 2 * (input - 1) - 2; i > 0; i--) {
            for (int j = i; j < 2 * input - 3; j++) {
                out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                out.print("*");
            }
            out.println();
        }
        return true;
    }

    public boolean drawDiamondWithName(InputStream in, PrintStream out) {
        Scanner keyboard = new Scanner(in);
        out.println("Give a number more than 0");
        int input = keyboard.nextInt();

        for (int i = 1; i < input; i++) {
            for (int j = 0; j < input - i; j++) {
                out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                out.print("*");
            }
            out.println();
        }
        out.println("Dandan Liu");
        for (int i = 2 * (input - 1) - 2; i > 0; i--) {
            for (int j = i; j < 2 * input - 3; j++) {
                out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                out.print("*");
            }
            out.println();
        }
        return true;
    }

    public boolean fizzBuzz() {
        for (int i = 1; i < 101; i++) {
            if (i % 12 == 0) {
                System.out.println("FizzBuzz");
            }else{
                if (i % 3 == 0) {
                    System.out.println("Fizz");
                }else{
                    if (i % 4 == 0) {
                        System.out.println("Buzz");
                    }else{
                        System.out.println(i);
                    }
                }
            }
        }
        return true;
    }

    public List<Integer> primeFactorsExercise(int input){


        List<Integer> list=new ArrayList<>();

        for(int i=2;i<input/2+1;i++){
            if(input%i==0){
                int temp=input/i;
                list.addAll(primeFactorsExercise(i));
                list.addAll(primeFactorsExercise(temp));
                break;
            }
        }
        if(list.size()==0) list.add(input);
        return list;

    }

}
