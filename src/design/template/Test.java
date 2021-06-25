package design.template;
/*
It is a behavioral design pattern where child class have to use base template method no matter of implementation /.
Here it defines skeleton of an algorithm in a method , deferring some steps to subclaas .
Template method lets subclass redefine certain steps of an algorithm without chaning the algorithm's structure.
 */
public class Test {
    public static void main(String[] args) {
        DataRenderer renderer = new CSVDataRenderer();
        renderer.render();
        DataRenderer renderer1 = new XMLDataRenderer();
        renderer1.render();
    }
}
