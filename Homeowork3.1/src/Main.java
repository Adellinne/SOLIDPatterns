import org.json.simple.JSONObject;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceți coeficientul a:");
        double a = scanner.nextDouble();

        System.out.println("Introduceți coeficientul b:");
        double b = scanner.nextDouble();

        EquationSolver equationSolver = new EquationSolver(a, b);
        JSONObject solutionJSON = equationSolver.solve();

        System.out.println("Rezultatul:");
        System.out.println(solutionJSON.toJSONString());
    }
}
