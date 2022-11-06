package primeira.aula.modelo;

public class Cachorro {
    // atributos, o que um classe tem
    private String nome;
    private String raca;

    private int idade;
    private boolean estaDoente;

    private Dono dono;
    private int id;

    // construtores, que podem ser usados para a criação de objetos

    public Cachorro(String nome, String raca, int idade, boolean estaDoente, Dono dono) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.estaDoente = estaDoente;
        this.dono = dono;
    }
    public Cachorro(Dono dono) {
        this.dono = dono;
    }


    public Cachorro(String nome, Dono dono){
        this.nome = nome;
        this.dono = dono;
    }

    public Cachorro(String nome, int idade, Dono dono){

        this.nome = nome;
        setIdade(idade);
        this.dono = dono;
    }


    // metodos, o que uma classe faz...

    // metodos de configuração - setam os valores - setters dos atributos

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    // encapsulando regra de negócio no setter
    public void setIdade(int idade) {
        if(idade < 0){
            System.err.println("Cachorro não pode ter idade negativa");
        } else if(idade > 29) {
            System.err.println("Não é permitido cachorros com idades superiores a 29 anos");
        } else {
            this.idade = idade;
        }
    }

    // metodos de consulta - consultam os valores dos atributos

    public boolean isEstaDoente() {
        return estaDoente;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public void setId(int id) {
        if(id == 0) { //int inicia com 0
            this.id = id;
        }
    }

    public int getId() {
        return id++;
    }
    // metodo usado para imprimir mais informações (estado) sobre os valores dos atributos do objeto

    @Override
    public String toString() {
        return "Cachorro:" +
                "\nNome: " + nome +
                "\nId cachorro: " + id +
                "\nRaça: " + raca +
                "\nIdade: " + idade +
                "\nEstá Doente? " + estaDoente +
                "\n"+ dono + "\n";
    }
}
