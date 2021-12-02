package com.coforge.training.jfsd.HelloMaven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! from Maven Project" );
        System.out.println();
        
        Student s1=new Student(1,"saiteja","developer",98);
        
        s1.display();
    }
}
