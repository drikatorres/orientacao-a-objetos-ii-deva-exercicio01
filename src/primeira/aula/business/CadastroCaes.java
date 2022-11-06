package primeira.aula.business;

import primeira.aula.modelo.Cachorro;

import java.util.Objects;

public class CadastroCaes {
    private static Cachorro[] listaCachorros = new Cachorro[10];
    private static int sequence = 1;

    public void setId(Cachorro cachorro) {
        cachorro.setId(sequence);
        cachorro.getDono().setId(sequence);
        cachorro.getDono().getEndereco().setId(sequence);
        sequence++;
    }

    public void cadastrar(Cachorro cachorro) {
        if (Objects.nonNull(cachorro) && Objects.nonNull(cachorro.getDono())) {
            for (int i = 0; i < listaCachorros.length; i++) {
                if (Objects.isNull(listaCachorros[i])) {
                    listaCachorros[i] = cachorro;
                    System.out.println(cachorro.getNome() + " cadastrado com sucesso");
                    break;
                } else {
                    System.err.println("Cachorro nulo ou cachorro sem dono");
                }
            }
        }
    }

    public void mostraCachorrosCadastradodos() {
        System.out.println("--------------CACHORROS CADASTRADOS---------------");
        for (Cachorro cachorro: listaCachorros) {
            if (Objects.nonNull(cachorro)) {
                System.out.println(cachorro);
            }
        }
        System.out.println("--------FIM LISTA CACHORROS CADASTRADOS-----------");
    }

}
