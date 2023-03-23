public class ExpressTrain extends Train{
    private Double trainSpeedInKmph;

    public ExpressTrain(){
    }

    public ExpressTrain(ExpressTrain expressTrain){
        super(expressTrain);
        this.trainSpeedInKmph = expressTrain.trainSpeedInKmph;
    }

    public ExpressTrain clone(){
        return new ExpressTrain(this);
    }

    public Double getTrainSpeedInKmph() {
        return trainSpeedInKmph;
    }

    public void setTrainSpeedInKmph(Double trainSpeed) {
        this.trainSpeedInKmph = trainSpeed;
    }

    @Override
    public String toString() {
        return "ExpressTrain{" +
                "trainName='" + this.getTrainName() + '\'' +
                ", fare=" + this.getFare() +
                ", trainType='" + this.getTrainType() + '\'' +
                ", engineType='" + this.getEngineType() + '\'' +
                ", noOfSeats=" + this.getNoOfSeats() +
                ", timing=" + this.getTiming() +
                ", sourceStation='" + this.getSourceStation() + '\'' +
                ", destinationStation='" + this.getDestinationStation() + '\'' +
                "trainSpeed=" + trainSpeedInKmph +
                '}';

    }
}
