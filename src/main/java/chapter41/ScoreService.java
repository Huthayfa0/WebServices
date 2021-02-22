package chapter41;
import javax.jws.*;
import java.util.HashMap;

@WebService(name = "ScoreService", serviceName = "ScoreWebService")
public class ScoreService {
    private HashMap<String,Double> scores=
            new HashMap<>();

    public ScoreService() {
        scores.put("Huth",90.0);
        scores.put("Ameer",99.0);
        scores.put("Hello",10.0);
    }
    @WebMethod(operationName = "findScore")
    public double findScore(String name){
        Double d=scores.get(name);
        if (d==null) {
            System.out.println("Student " + name + " is not found");
            return -1;
        }
        System.out.println("Student " + name + "'s score is " +d);
        return d;
    }
}
