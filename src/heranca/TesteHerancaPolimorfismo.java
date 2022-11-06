package heranca;

public class TesteHerancaPolimorfismo {
    public static void main(String[] args) {
        Papagaio papagaio = new Papagaio();
        papagaio.setVoar("Voando");

        BeijaFlor beijaFlor = new BeijaFlor();
        beijaFlor.setVoar("Voando");
    }
}
