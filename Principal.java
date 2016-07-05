/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vagas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Agencia
 */
public class Principal {

    public static void main(String[] args) {

        Principal p = new Principal();
        Trabalhador tr;
        Empregador e;
        Vagas v;

        while (true) {
            tr = new Trabalhador();
            e = new Empregador();
            v = new Vagas();
            System.out.println("1 - Cadastrar trabalhador");
            System.out.println("2 - Cadastrar empregador");
            System.out.println("3- Cadastrar vaga");
            System.out.println("4- imprimir lista de trabalhadores");
            System.out.println("5- imprimir lista de Empregadores");
            System.out.println("6- Pesquisar vagas");
            System.out.println("7 - FIM");
            Scanner scan = new Scanner(System.in);
            System.out.println("Selecione sua opção: ");

            int opcao = scan.nextInt();
            if (opcao == 4) {
                break;
            }

            switch (opcao) {

                case 1:
                    p.cadastrarTrabalhador(tr);
                    p.acrescentarListaTrabalhador(tr);
                    break;
                case 2:
                    p.cadastrarEmpregador(e);
                    p.acrescentarListaEmpregador(e);

                    break;

                case 3:
                    p.cadastrarVaga(v);

                    break;
                case 4:
                    p.imprimirListaTrabalhador();
                    break;

                case 5:
                    p.imprimirListaEmpregador();
                    break;

                case 6:
                    p.pesquisarVagas();
                    break;

                case 7:

                    break;
                default:

                    System.out.println("Opção inválida");

            }
        }

    }

    private ArrayList<Trabalhador> trab = new ArrayList<>();

    public void acrescentarListaTrabalhador(Trabalhador p) {
        this.trab.add(p);

    }
    private ArrayList<Empregador> emp = new ArrayList<>();

    public void acrescentarListaEmpregador(Empregador p) {
        this.emp.add(p);
    }

    private ArrayList<Vagas> vag = new ArrayList<>();

    public void acrescentarListaVagas(Vagas p) {
        this.vag.add(p);
    }

    public void imprimirListaTrabalhador() {

        System.out.println("Lista de trabalhadores");

        for (int i = 0; i < this.trab.size(); i++) {
            System.out.println();
            System.out.println("Nome:");
            System.out.println(this.trab.get(i).getNome());
            System.out.println("Nome social:");
            System.out.println(this.trab.get(i).getNomeSocial());
            System.out.println("Idade:");
            System.out.println(this.trab.get(i).getIdade());
            System.out.println("Endereco:");
            System.out.println(this.trab.get(i).getEndereco());
            System.out.println("Telefone:");
            System.out.println(this.trab.get(i).getTelefone());
            System.out.println("CPF:");
            System.out.println(this.trab.get(i).getCPF());
            System.out.println("Gênero:");
            System.out.println(this.trab.get(i).getGenero());
            System.out.println("Experiência:");
            System.out.println(this.trab.get(i).getExperiencia());

            System.out.println("*********************************");
            System.out.println();

        }

    }

    public void imprimirListaEmpregador() {

        System.out.println("Lista de Empregadores");

        for (int i = 0; i < this.emp.size(); i++) {
            System.out.println();
            System.out.println("Nome:");
            System.out.println(this.emp.get(i).getNome());
            System.out.println("Nome social:");
            System.out.println(this.emp.get(i).getNomeSocial());
            System.out.println("Idade:");
            System.out.println(this.emp.get(i).getIdade());
            System.out.println("Endereco:");
            System.out.println(this.emp.get(i).getEndereco());
            System.out.println("Telefone:");
            System.out.println(this.emp.get(i).getTelefone());
            System.out.println("CNPJ:");
            System.out.println(this.emp.get(i).getCNPJ());
            System.out.println("*********************************");
            System.out.println();

        }

    }

    public void cadastrarTrabalhador(Trabalhador p) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Nome:");
        p.setNome(scan.nextLine());
        System.out.println("Nome social:");
        p.setNomeSocial(scan.nextLine());
        System.out.println("Idade:");
        p.setIdade(scan.nextInt());
        System.out.println("Endereço:");
        p.setEndereco(scan2.nextLine());
        System.out.println("Telefone:");
        p.setTelefone(scan2.nextLine());
        System.out.println("CPF:");
        p.setCPF(scan2.nextLine());
        System.out.println("Gênero:");
        p.setGenero(scan2.nextLine());
        System.out.println("Experiência em meses:");
        p.setExperiencia(scan2.nextInt());

    }

    public void cadastrarEmpregador(Empregador p) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Nome:");
        p.setNome(scan.nextLine());
        System.out.println("Nome social:");
        p.setNomeSocial(scan.nextLine());
        System.out.println("Idade:");
        p.setIdade(scan.nextInt());
        System.out.println("Endereço:");
        p.setEndereco(scan2.nextLine());
        System.out.println("Telefone:");
        p.setTelefone(scan2.nextLine());
        System.out.println("CNPJ:");
        p.setCNPJ(scan2.nextLine());

    }

    public void cadastrarVaga(Vagas p) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Experiência em meses:");
        p.setExp(scan.nextInt());
        System.out.println("Salário:");
        p.setSalario(scan.nextDouble());

    }

    public void pesquisarVagas() {
        Scanner scan = new Scanner(System.in);
        Vagas v = new Vagas();
        int expn;
        System.out.println("Pesquisa por vagas pelo tempo de  experiência:");
        System.out.println();

        System.out.println("Digite a experiência em meses");
        expn = scan.nextInt();

        if (v.getExp() == expn) {
            System.out.println("Vagas encontradas:");

            for (int i = 0; i < this.vag.size(); i++) {
                System.out.println();
                System.out.println("Experiência em meses:");
                System.out.println(this.vag.get(i).getExp());

                System.out.println("Salário:");
                System.out.println(this.vag.get(i).getSalario());

                System.out.println("*********************************");
                System.out.println();

            }

        } else {
            System.out.println("Sem vagas no momento:");

        }

    }

}
