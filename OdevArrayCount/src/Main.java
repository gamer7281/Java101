public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i: arr) {
            if (i == value) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        System.out.println("Tekrar sayıları");
        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((list[i] == list[j])) {
                    if(!isFind(duplicate, list[i])) {
                        counter++;
                    }
                }
            }
            if (counter != 0) {
                System.out.println(list[i] + " sayısı " + counter + " kere tekrar edildi.");
            }
            duplicate[startIndex++] = list[i];
            counter = 0;
        }
    }
}
