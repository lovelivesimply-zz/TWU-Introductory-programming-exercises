package main;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class InstructionJava {

    public boolean drawHorizontalLine(InputStream in, PrintStream out){
        Scanner keyboard = new Scanner(in);
        out.println("Give a number more than 0");
        int input = keyboard.nextInt();

        for(int i=0;i<input;i++){
            out.print("*");
        }
        return true;
    }

    public boolean drawVerticalLine(InputStream in,PrintStream out){
        Scanner keyboard=new Scanner(in);
        out.println("Give a number more than 0");
        int input=keyboard.nextInt();

        for(int i=0;i<input;i++){
            out.println("*");
        }
        return true;
    }
    public boolean drawRightTriangle(InputStream in,PrintStream out){
        Scanner keyboard=new Scanner(in);
        out.println("Give a number more than 0");
        int input=keyboard.nextInt();

        for(int i=0;i<input;i++){
            for(int j=0;j<i+1;j++){
                out.print("*");
            }
            out.println();
        }
        return true;
    }
    //IsoscelesTriangle

    public boolean drawIsoscelesTriangle(InputStream in,PrintStream out){
        Scanner keyboard=new Scanner(in);
        out.println("Give a number more than 0");
        int input=keyboard.nextInt();

        for(int i=1;i<input+1;i++){
            for(int j=0;j<input-i;j++){
                out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                out.print("*");
            }
            out.println();
        }
        return true;
    }

    public boolean drawDiamond(InputStream in,PrintStream out){
        Scanner keyboard=new Scanner(in);
        out.println("Give a number more than 0");
        int input=keyboard.nextInt();

        for(int i=1;i<input+1;i++){
            for(int j=0;j<input-i;j++){
                out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                out.print("*");
            }
            out.println();
        }
        return true;
    }
}
