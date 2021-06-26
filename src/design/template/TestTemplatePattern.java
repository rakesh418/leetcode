package design.template;
/*
The template method pattern is a behavioural pattern. And as the name itself says it provides a base template method.
When we are working with inheritance in our applications we provide a base template method that should be used by the child classes.
The child classes can override certain methods but they should use the base template method as is
 */
public class TestTemplatePattern {
    public static void main(String[] args) {
        DataRenderer renderer = new CSVDataRenderer();
        renderer.render();
        DataRenderer renderer1 = new XMLDataRenderer();
        renderer1.render();
    }
}
