package dish;


import java.util.Scanner;
public class DishTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputDishName = scanner.next();
        int inputDishCalories = scanner.nextInt();
        int allCalories = 0;


        for (inputDishName = scanner.next();inputDishName.equals("STOP");) {
            allCalories += inputDishCalories;
        }
        System.out.println(allCalories);


      /*  if (!"STOP".equals(inputDishName)) {
            allCalories += inputDishCalories;
            inputDishName = scanner.next();
            inputDishCalories = scanner.nextInt();
    } else {
            System.out.println(allCalories);
        }
        System.out.println(allCalories);*/
    }

}
