public class PathCalculatorFactory {

    public static PathCalculatorStrategy getPathCalculator(String mode){
        PathCalculatorStrategy pathCalculatorStrategy;
        if(mode.equalsIgnoreCase("CAR")){
            pathCalculatorStrategy = CarPathCalculator.getInstance();
        }
        else if(mode.equalsIgnoreCase("BIKE")){
            pathCalculatorStrategy = BikePathCalculator.getInstance();
        }
        else if(mode.equalsIgnoreCase("WALK")){
            pathCalculatorStrategy = WalkPathCalculator.getInstance();
        }
        else{
            throw new ModeNotFound("Mode not Found");
        }

        return pathCalculatorStrategy;

    }
}
