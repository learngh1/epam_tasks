public class EPAM_Task_03 {
    public static void main(String[] args) {
        int a = 1;
        int b = 45;
        int h = 2;

        for (int i = a; i <= b; i += h) {
            logAsTable(i, calculateFormula(i));
        }
    }

    private static double calculateFormula(int x) {
        return Math.tan(2*x) -3d;
    }

    private static void logAsTable(int arg, double val) {
        log(arg + " | " + val);
    }

    private static void log(Object o) {
        System.out.println(o);
    }
}