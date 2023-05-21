import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
public class EquationSolver {
    private double a;
    private double b;

    public EquationSolver(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public JSONObject solve() {
        JSONObject result = new JSONObject();
        if (a == 0) {
            if (b == 0) {
                result.put("status", "infinitely many solutions");
            } else {
                result.put("status", "no solution");
            }
        } else {
            double solution = -b / a;
            result.put("status", "single solution");
            result.put("solution", solution);
        }
        return result;
    }

    public void saveSolutionAsJSON(String fileName) {
        JSONObject solutionJSON = solve();
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(solutionJSON.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}