package libs;


import org.apache.log4j.Logger;

public class WorkWithArray {
    
    static Logger logger = Logger.getLogger("WorkWithList");

    public static void ArrayEnumeration(int[] massive) {

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > 10) {
                System.out.println(massive[i] + " " + "is more than 10;");
            } else if (massive[i] == 10) {
                System.out.println(massive[i] + " " + "is equally 10;");
            } else {
                System.out.println(massive[i] + " " + "is less than 10;");
            }

        }
    }

    public static int ArrayBackwards(int[] massive) {
        for (int i = massive.length - 1; i >= 0; i = i - 1) {
            System.out.println(massive[i]);
        }
        return massive.length;
    }

    public static void ArrayEqualString(String[] massive) {
        for (int i = 0; i < massive.length; i++) {
            if (massive[i].equals("test")) {
                System.out.println("Congratulation, this cell equal the 'test'. You win!");
            } else {
                System.out.println("Sorry, this cell not equal the 'test'. Try again...");
            }
        }
    }

    public static void ArrayFindOneAndTellMe(int[] massive) {
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == 33) {
                System.out.println("Congratulation, your number is in this array. You win!");
                break;
            }
        }
    }


    public static void ArrayFindOneAndTellMe(String[] massive) {
        for (int i = 0; i < massive.length; i++) {
            if (massive[i].equals("test12")) {
                System.out.println("Congratulation, the 'test' is in this array. You win!");
                break;
            }
        }
    }

    public static int[][] createMatrix(int x, int y, int value) {
        if (x > 0 & y > 0) {
            int[][] massiveMassive = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    massiveMassive[i][j] = value;
                    // System.out.print(massiveMassive[i][j] + " ");
                }
                // System.out.println(" ");
            }
            return massiveMassive;

        } else {
            int[][] staticArray = new int[0][0];
            System.out.println("Values can only be greater than zero!");
            return staticArray;
        }
    }


    public static int[][] leftRightFiller(int[][] massiveMassive) {
        try {
            if (massiveMassive.length > 0) {
                for (int i = 0; i < massiveMassive.length; i++) {
                    for (int j = 0; j < massiveMassive.length; j++) {
                        if (i == j) {
                            massiveMassive[i][j] = 8;
                        }
                        System.out.print(massiveMassive[i][j] + " ");
                    }
                    System.out.println(" ");
                }
            } else {
                System.out.println("Array is empty!");
                return massiveMassive;
            }
        } catch (ArrayIndexOutOfBoundsException boundsExeption) {
            System.out.println("Array is empty!!");
        }
        return massiveMassive;
    }


    public static int[][] rightLeftFiller(int[][] massiveMassive) {
        try {
            if (massiveMassive.length > 0) {
                for (int i = 0; i < massiveMassive.length; i++) {
                    for (int j = 0; j < massiveMassive.length; j++) {
                        if (i + j == massiveMassive.length - 1) {
                            massiveMassive[i][j] = 8;
                        }
                        System.out.print(massiveMassive[i][j] + " ");
                    }
                    System.out.println(" ");
                }
            } else {
                System.out.println("Array is empty!");
                return massiveMassive;
            }
        } catch (ArrayIndexOutOfBoundsException boundsExeption) {
            System.out.println("Array is empty!!");
        }
        return massiveMassive;
    }

    public static int[][] iksFiller(int[][] massiveMassive) {
        try {
            if (massiveMassive.length > 0) {
                for (int i = 0; i < massiveMassive.length; i++) {
                    for (int j = 0; j < massiveMassive.length; j++) {
                        if (i == j | i + j == massiveMassive.length - 1) {
                            massiveMassive[i][j] = 8;
                        }
                        System.out.print(massiveMassive[i][j] + " ");
                    }
                    System.out.println(" ");
                }
            } else {
                System.out.println("Array is empty!");
                return massiveMassive;
            }
        } catch (ArrayIndexOutOfBoundsException boundsExeption) {
            System.out.println("Array is empty!!");
        }
        return massiveMassive;
    }

}










