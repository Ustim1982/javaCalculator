import java.util.Scanner;

public class QAlculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }
    public static int getInt(){
        System.out.println("Введи число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка! Число должно быть целое. Попробуй еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }
    public static char getOperation(){
        System.out.println("Введи операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Допущена ошибка при вводе операции. Попробуй еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Нет такой операции. Повтори ввод. + или - или * или /");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}