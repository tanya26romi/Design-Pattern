public class Client {

    public static void main(String[] args) {
        Map map = new Map("Bike");
        PathCalculatorStrategy pathCalculatorStrategy = map.createPathCalculatorFactory();
        pathCalculatorStrategy.findPath("ABC", "XYZ");

    }
}
