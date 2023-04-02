public class Map {
    public String mode;

    public Map(String mode) {
        this.mode = mode;
    }

    public PathCalculatorStrategy createPathCalculatorFactory(){
        return PathCalculatorFactory.getPathCalculator(mode);
    }
}
