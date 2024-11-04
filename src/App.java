import java.util.ArrayList;
import java.util.Scanner;

import model.Cidade;
import model.Cliente;
import model.Funcionario;

public class App {
    static ArrayList<Cidade> listaCidades = new ArrayList<>();
    static ArrayList<Cliente> listaClientes = new ArrayList<>();
    static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        try {
            do {
                System.out.println("1 - Cadastrar Cliente");
                System.out.println("2 - Cadastrar Funcionário");
                System.out.println("3 - Cadastrar Cidades");
                System.out.println("4 - Listar Clientes");
                System.out.println("5 - Listar Funcionários");
                System.out.println("6 - Listar Cidades");
                System.out.println("10 - SAIR");
                opcao = entrada.nextInt();
                switch (opcao) {
                    case 1:
                        cadastrarCliente();
                        break;
                    case 2:
                        cadastrarFuncionario();
                        break;
                    case 3:
                        cadastrarCidade();
                        break;    
                    default:
                        break;
                }
            } while (opcao!=10);
        } catch (Exception e) {
            System.out.println("erro:"+e.getMessage());
        }
    }
    public static void cadastrarCliente(){}
    public static void cadastrarFuncionario(){}
    public static void cadastrarCidade(){
        Cidade obj = new Cidade();
        //obj.cadastrar();
        do {
            System.out.println("Digite o id da cidade:");
            obj.setId(entrada.nextInt());
        } while (obj.getId()<=0);
        do {
            System.out.println("Digite o nome da cidade:");
            obj.setNome(entrada.next());
        } while (obj.getNome().length()<3);
        do {
            System.out.println("Digite a UF:");
            obj.setUf(entrada.next());
        } while (obj.getUf().length()!=2);
        listaCidades.add(obj);
    }
}

