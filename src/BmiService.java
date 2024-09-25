public class BmiService {
    public int bmi(double weight, double height) {

        double result = weight / (height * height);
        int resultInt = (int) result;

        return resultInt;
    }

}