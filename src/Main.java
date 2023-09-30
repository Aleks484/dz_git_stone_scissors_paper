import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final String [] choices = {"камень","ножницы","бумага"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int compChoice = random.nextInt(choices.length);//генерирует случайный индекс от 0 до размера массива
        compChoice = compChoice+1;

            System.out.println("Начало игры");
            System.out.println("Выберете вартант");
            System.out.println("1. камень\n" + "2. ножницы\n" + "3. бумага\n" );
            int playerChoice = scanner.nextInt();
            if (playerChoice == 1) {
                System.out.println(playerChoice + ". (playerChoice) камень");

            }
            if (playerChoice == 2) {
                System.out.println(playerChoice + ". (playerChoice) ножницы");
            }
            if (playerChoice == 3) {
                System.out.println(playerChoice + ". (playerChoice) бумага");
            }

            if (compChoice == 1) {
                System.out.println(compChoice + ". (compChoice) камень");
            }
            if (compChoice == 2) {
                System.out.println(compChoice + ". (compChoice)  ножницы");
            }
            if (compChoice == 3) {
                System.out.println(compChoice + ". (compChoice)  бумага");
            }

            if (playerChoice == compChoice) {
                System.out.println("ничья");
            } else if (playerChoice == 0 && compChoice == 1 || playerChoice == 1 && compChoice == 2 || playerChoice == 2 && compChoice == 0) {
                System.out.println("Победил игрок");
            } else {
                System.out.println("Победил компьютер");

            }
        }
   }
