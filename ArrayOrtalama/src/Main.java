public class Main {
    public static void main(String[] args) {
        int[] list = {15, 6, 7, 12, 7, 9, 3};
        double sum = 0.0;
        for (int i = 0; i < list.length; i++) {
            sum += (1.0 / list[i]);
        }
        double average = list.length / sum;
        System.out.println(average);
    }
}
