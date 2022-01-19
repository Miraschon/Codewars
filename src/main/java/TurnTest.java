public class TurnTest {
    int[][] arr = new int[2][3];
    private int arrHeight;
    private int arrWidth;

    public static void main(String[] args) {

        TurnTest test = new TurnTest();
        test.fill();
        System.out.println();
        test.left();


    }

    public void fill() {
        int num = 0;
        arrHeight = arr.length;
        arrWidth = arr[0].length;
        for (int y = 0; y < arrHeight; y++) {
            for (int x = 0; x < arrWidth; x++) {
                arr[y][x] = num;
                num++;
                System.out.print(arr[y][x] + " ");
            }
            System.out.println();
        }
    }


    public void right() {
        final int tempHeight=arrWidth;
        final int tempWidth=arrHeight;
        int[][] temp = new int[tempHeight][tempWidth];
        for (int y = 0; y < tempHeight; y++) {
            for (int x = 0; x < tempWidth; x++) {
                temp[y][x] = arr[arrHeight - x - 1][y];
                System.out.print(temp[y][x] + " ");
            }
            System.out.println();
        }
    }

    public void left() {
        final int tempHeight=arrWidth;
        final int tempWidth=arrHeight;
        int[][] temp = new int[tempHeight][tempWidth];
        for (int y = 0; y < tempHeight; y++) {
            for (int x = 0; x < tempWidth; x++) {
                temp[y][x] = arr[x][Math.abs(y-2)];
                System.out.print(temp[y][x] + " ");
            }
            System.out.println();
        }
    }
}
