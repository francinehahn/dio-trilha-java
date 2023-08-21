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
            
            String message = "Olá, "
            .concat(clientName)
            .concat(". Obrigado por criar uma conta em nosso banco! Sua agência é ")
            .concat(branchNumber)
            .concat(", conta ")
            .concat(String.valueOf(accountNumber))
            .concat(", e seu saldo R$")
            .concat(String.valueOf(balance))
            .concat(" já está disponível para saque.");
            
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
            System.out.println("Certifique-se de digitar o seu saldo em um dos seguinter formatos: 1250 ou 1250,45. Não utilize ponto final.");
        }
    }
}

