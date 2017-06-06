public class EPAM_Task_02 {
    public static void main(String[] args) {
        double E = 0.014d;

        boolean found = false;
        int n = 1;
        while (!found) {
            double value = calculateFormula(n);

            log("a[" + n + "]=" + value);

            if (value < E) {
                found = true;
                log("min n=" + n);
            }
            n++;
        }
    }

    private static double calculateFormula(int n) {
        return 1/Math.pow((n+1), 2);
    }

    private static void log(Object o) {
        System.out.println(o);
    }
}
