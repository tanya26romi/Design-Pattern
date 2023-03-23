import java.util.HashMap;
import java.util.Map;

public class TrainRegistry {

    private Map<String, Train> registry;

    public TrainRegistry(){
        this.registry = new HashMap<>();
    }

    public Train get(String trainType){
        return registry.get(trainType);
    }
    public void save(Train train){
        registry.put(train.getTrainType(), train);
    }
}
