package design.template;

public class Test {
    public static void main(String[] args) {
        DataRenderer renderer = new CSVDataRenderer();
        renderer.render();
        DataRenderer renderer1 = new XMLDataRenderer();
        renderer1.render();
    }
}
