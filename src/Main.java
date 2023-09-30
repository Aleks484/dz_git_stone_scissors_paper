import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final String [] choices = {"камень","ножницы","бумага"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int compChoice = random.nextInt(choices.length);//генерирует случайный индекс от 0 до размера массива
        int player;
        int exit;
        System.out.println("Начало игры");
        System.out.println("Выберете вартант");
        System.out.println("0. камень\n"+"1. ножницы\n"+"2. бумага\n");
        //int playerChoise = scanner.nextInt()-1;
        int playerChoise = scanner.nextInt();
        System.out.println(compChoice);
        if(playerChoise == compChoice){
            System.out.println("ничья");
        }
        else if (playerChoise == 0 && compChoice == 1 || playerChoise == 1 && compChoice == 2 || playerChoise == 2 && compChoice == 0 ){
            System.out.println("Победил игрок");
        } else {
            System.out.println("Победил компьютер");
        }
    }
}