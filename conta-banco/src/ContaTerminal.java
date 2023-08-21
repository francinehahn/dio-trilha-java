import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Por favor, digite o número da conta: ");
            int accountNumber = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Por favor, digite o número da agência: ");
            String branchNumber = scanner.nextLine();
        
            System.out.print("Por favor, digite o seu nome completo: ");
            String clientName = scanner.nextLine();

            System.out.print("Por favor, digite o seu saldo: ");
            double balance = scanner.nextDouble();
        
            if (branchNumber.isEmpty() || clientName.isEmpty()) {
                System.out.println("Houve um erro! Certifique-se que todos os campos foram preenchidos.");
                return;
            }
            
            System.out.println("Olá, " + clientName+ ", obrigada por criar uma conta em nosso banco, sua agência é " + branchNumber + ", conta " + accountNumber + ", e seu saldo R$" + balance + " já está disponível para saque.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}

