package test;

import main.InstructionJava;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.*;

public class IntroductionJavaTest {




   @Test
    public  void should_print_one_asterisks(){
        System.out.print("*");

    }
    @Test
    public void when_intput_n_print_n_asterisks(){
        ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
        System.setIn(in);
        InstructionJava t=new InstructionJava();
        Assert.assertTrue(t.drawHorizontalLine(in, new PrintStream(System.out)));

    }

    @Test
    public void when_input_n_drive_vertical_line(){
        ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
        System.setIn(in);
        InstructionJava t=new InstructionJava();
        Assert.assertTrue(t.drawVerticalLine(in, new PrintStream(System.out)));
    }

    @Test
    public void when_input_n_drive_right_triangle(){
        ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
        System.setIn(in);
        InstructionJava t=new InstructionJava();
        Assert.assertTrue(t.drawRightTriangle(in, new PrintStream(System.out)));
    }
    @Test
    public void when_input_n_drive_isosceles_triangle(){
        ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
        System.setIn(in);
        InstructionJava t=new InstructionJava();
        Assert.assertTrue(t.drawIsoscelesTriangle(in, new PrintStream(System.out)));
    }

}
