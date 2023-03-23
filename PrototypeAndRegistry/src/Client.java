import java.time.LocalTime;

public class Client {

    public static void main(String[] args) {

        TrainRegistry registry = new TrainRegistry();
        LocalTime timing;

        Train localTrain = new Train();
        localTrain.setFare(20.0);
        localTrain.setTrainType("Local");
        localTrain.setEngineType("Electic");
        localTrain.setNoOfSeats(1000);

        Train fastLocal = localTrain.clone();
        fastLocal.setTrainName("FastLocal");
        timing = LocalTime.of(10, 30);
        fastLocal.setTiming(timing);
        fastLocal.setSourceStation("Dadar");
        fastLocal.setDestinationStation("Mumbai Cental");

        System.out.println(fastLocal.toString());

        Train slowLocal = localTrain.clone();
        slowLocal.setTrainName("SlowLocal");
        timing = LocalTime.of(11, 30);
        slowLocal.setTiming(timing);
        slowLocal.setSourceStation("Bandra");
        slowLocal.setDestinationStation("Mumbai Cental");
        System.out.println(slowLocal.toString());


        Train femaleSpecial = localTrain.clone();
        femaleSpecial.setTrainName("femaleSpecial");
        timing = LocalTime.of(12, 30);
        femaleSpecial.setTiming(timing);
        femaleSpecial.setSourceStation("Byculla");
        femaleSpecial.setDestinationStation("Mumbai Cental");
        System.out.println(femaleSpecial.toString());

        ExpressTrain expressTrain = new ExpressTrain();
        expressTrain.setFare(100.0);
        expressTrain.setTrainType("Express");
        expressTrain.setEngineType("Electic");
        expressTrain.setNoOfSeats(700);

        ExpressTrain rajdhaniTejas = expressTrain.clone();
        rajdhaniTejas.setTrainName("Rajdhani Tejas");
        timing = LocalTime.of(17, 30);
        rajdhaniTejas.setTiming(timing);
        rajdhaniTejas.setSourceStation("New Delhi");
        rajdhaniTejas.setDestinationStation("Mumbai Cental");
        rajdhaniTejas.setTrainSpeedInKmph(130D);
        System.out.println(rajdhaniTejas.toString());

        registry.save(localTrain);
        registry.save(expressTrain);
    }
}
