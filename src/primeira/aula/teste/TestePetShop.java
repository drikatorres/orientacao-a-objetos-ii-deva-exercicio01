package primeira.aula.teste;

import primeira.aula.business.CadastroCaes;
import primeira.aula.modelo.Cachorro;
import primeira.aula.modelo.Dono;
import primeira.aula.modelo.Endereco;
import primeira.aula.business.Internacoes;

public class TestePetShop {
    public static void main(String[] args) {
        /* criando/instanciando objetos e pegando o endereço deles na memoria
        esse endereço é atributo a variavel
        estamos usando varios construtores para isso*/

        Endereco enderecoDoJoao = new Endereco("A", 5, "77777", "A", "A");
        Dono dono1 = new Dono("João", enderecoDoJoao);



        Endereco enderecoDoGuilherme = new Endereco("A", 5, "77777", "A", "A");
        Dono dono2 = new Dono("Guilherme", enderecoDoGuilherme);



        Cachorro cachorro = new Cachorro("Doguinho", dono1);
        cachorro.setNome("Cacau");
        cachorro.setRaca("Vira lata caramelo");
        cachorro.setIdade(1);

        System.out.println("Idade do " + cachorro.getNome() + " e " + cachorro.getIdade());

        Cachorro cachorro0 = new Cachorro("Doguinho 2", dono2);
        cachorro0.setNome("Spike");
        cachorro0.setRaca("PitBull");
        cachorro0.setIdade(15);
        cachorro0.setEstaDoente(true);

        Cachorro cachorro3 = new Cachorro(dono2);
        cachorro3.setNome("Bob");
        cachorro3.setRaca("Pastor Alemao");
        cachorro3.setIdade(10);
        cachorro3.setEstaDoente(true);

        System.out.println("Idade do " + cachorro0.getNome() + " e " + cachorro0.getIdade());

        System.out.println("-----------------IMPRIMINDO OS DOGS--------------------");

        // chama o toString ao realizar a impressão
        System.out.println(cachorro);
        System.out.println(cachorro0);
        System.out.println(cachorro);
        System.out.println(cachorro0);
        System.out.println(cachorro3);

        Internacoes internacoes = new Internacoes();
        internacoes.internar(cachorro0);
        internacoes.internar(cachorro3);
        System.out.println("------------IMPRIMINDO OS DOGS INTERNADOS--------------");
        internacoes.mostraCachorrosInternados();
        System.out.println("--------------------------------------------------------");


        //Criando donos
        Endereco enderecoDaMaria = new Endereco("Rua Mogi das Cruzes", 20, "08577-820", "Jardim Valparaíso", "SP");
        Dono maria = new Dono("Maria", "218.018.730-03", "maria@gmail.com", enderecoDaMaria);
        Endereco enderecoDaAna = new Endereco("Rua Francisco de Sá Brito", 13, "97545-250", "Novo Lar", "RS");
        Dono ana = new Dono("Ana", "276.555.770-56", "ana@gmail.com", enderecoDaAna);
        Endereco enderecoDoOrir = new Endereco("Rua B", 56, "69312-082", "Jardim Floresta", "RR");
        Dono orir = new Dono("Orir", "601.203.280-38", "orir@gmail.com", enderecoDoOrir);
        //criando cachorros
        Cachorro lozu = new Cachorro("Lozu", "vira-lata", 5, false, maria);
        Cachorro baor = new Cachorro("Baor", "golden retriever", 1, false, ana);
        Cachorro golli = new Cachorro("Golli", "chihuahua", 17, true, orir);


        //teste cadastro cachorros

        CadastroCaes cadastroCaes = new CadastroCaes();
        cadastroCaes.cadastrar(lozu);
        cadastroCaes.cadastrar(baor);
        cadastroCaes.cadastrar(golli);

        cadastroCaes.mostraCachorrosCadastradodos();
    }
}
