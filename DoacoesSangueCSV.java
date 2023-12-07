import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Programa para leitura e manipulação de registros em um arquivo CSV de doações de sangue.
 */
public class DoacoesSangueCSV {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o caminho e nome do arquivo CSV: ");
        String arquivoCSV = scanner.nextLine();
        List<String[]> registros = lerCSV(arquivoCSV);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Visualizar registros");
            System.out.println("2. Inserir nova doação");
            System.out.println("3. Deletar doação por código");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer de entrada

            switch (opcao) {
                case 1:
                    mostrarRegistros(registros);
                    break;
                case 2:
                    inserirDoacao(scanner, registros);
                    break;
                case 3:
                    deletarDoacao(scanner, registros);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        salvarCSV(arquivoCSV, registros);
        System.out.println("Programa encerrado.");
    }

    public static List<String[]> lerCSV(String arquivoCSV) {
        List<String[]> registros = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoCSV))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] campos = linha.split(",");
                registros.add(campos);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo CSV: " + e.getMessage());
        }
        return registros;
    }

    public static void mostrarRegistros(List<String[]> registros) {
        for (String[] campos : registros) {
            System.out.println(String.join(", ", campos));
        }
    }

    public static void inserirDoacao(Scanner scanner, List<String[]> registros) {
        System.out.print("Informe o código da doação: ");
        String codigo = scanner.nextLine();
        System.out.print("Informe o nome do doador: ");
        String nome = scanner.nextLine();
        System.out.print("Informe o CPF do doador: ");
        String cpf = scanner.nextLine();
        System.out.print("Informe a data de nascimento do doador (yyyy-MM-dd): ");
        String dataNascimento = scanner.nextLine();
        System.out.print("Informe o tipo sanguíneo do doador: ");
        String tipoSanguineo = scanner.nextLine();
        System.out.print("Informe a quantidade em ml de sangue doado: ");
        String mlDoados = scanner.nextLine();
        String novaDoacao = String.join(",", codigo, nome, cpf, dataNascimento, tipoSanguineo, mlDoados);
        registros.add(novaDoacao.split(","));
    }

    public static void deletarDoacao(Scanner scanner, List<String[]> registros) {
        System.out.print("Informe o código da doação a ser deletada: ");
        String codigo = scanner.nextLine();
        registros.removeIf(registro -> registro[0].equals(codigo));
    }

    public static void salvarCSV(String arquivoCSV, List<String[]> registros) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoCSV))) {
            for (String[] registro : registros) {
                writer.write(String.join(",", registro));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo CSV: " + e.getMessage());
        }
    }
}
