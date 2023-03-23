import java.time.LocalTime;

public class Train implements Prototype<Train>{
    private String trainName;
    private Double fare;
    private String trainType;

    private String engineType;
    private Integer noOfSeats;

    private LocalTime timing;
    private String sourceStation;

    private String destinationStation;

    public Train(){
    }
    public Train(Train train){
        this.fare = train.fare;
        this.trainType = train.trainType;
        this.engineType = train.engineType;
        this.noOfSeats = train.noOfSeats;
    }

    @Override
    public Train clone(){
        return new Train(this);
    }
    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public LocalTime getTiming() {
        return timing;
    }

    public void setTiming(LocalTime timing) {
        this.timing = timing;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainName='" + trainName + '\'' +
                ", fare=" + fare +
                ", trainType='" + trainType + '\'' +
                ", engineType='" + engineType + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", timing=" + timing +
                ", sourceStation='" + sourceStation + '\'' +
                ", destinationStation='" + destinationStation + '\'' +
                '}';
    }
}
