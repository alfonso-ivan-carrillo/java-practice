public class MethodsExercises {


    public static int addNums(int num1, int num2){
        return num1 + num2;
    }

    public static int subNums(int num1, int num2){
        return num1 - num2;
    }

    public static int multNums(int num1, int num2){
        return num1 * num2;
    }

    public static int divNums(int num1, int num2){
        return num1 / num2;
    }

    public static int modNums(int num1, int num2){
        return (num1 % num2);
    }

    public static int multipleLoop(int num1, int num2){
            int result = 0;
        for ( int i = 0; i < num2; i++){
            result += num1;
        }
        return result;
    }
    public static void main(String[] args) {

//
//        System.out.println(addNums(5, 18));
//        System.out.println(subNums(5, 18));
//        System.out.println(multNums(5, 5));
//        System.out.println(divNums(15, 5));
//        System.out.println(modNums(10, 3));

        System.out.println(multipleLoop(3, 8));
    }
}
