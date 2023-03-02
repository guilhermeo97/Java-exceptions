import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numero = 999;
        try{
            System.out.println("Digite um número");
            numero = input.nextInt();
            } catch (InputMismatchException e) {
            numero = 0;
        } catch (Exception a){
            numero = 599;
        }
        finally {
            System.out.println("O número digitado foi: " + numero);
            System.out.println("Execução terminada");
            input.close();
        }  
    }
}
