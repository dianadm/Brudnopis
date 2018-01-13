package knowledge.second;

public class SearchSample {

    public static void main(String[] args) {
        int[][] list = {{1, 13, 5}, {1, 2, 5}, {2, 7, 2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;

        for (int i = 0; i < list.length; i++) {
            PARENT_LOOP: for (int j = 0; j < list[i].length; j++) {
                System.out.println(i + ", " + j);
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;
                }
            }
        }

        if (positionX == -1 || positionY == -1) {
            System.out.println("Value " + searchValue + " not found");
        } else {
            System.out.println("Value " + searchValue + " found at: " +
                    "(" + positionX + "," + positionY + ")");
        }
    }

}
