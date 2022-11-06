package primeira.aula.modelo;

public class Endereco {
    private String rua;
    private Integer numero;
    private String cep;
    private String bairro;
    private String estado;
    private int id;

    public Endereco(String rua,
                    Integer numero,
                    String cep,
                    String bairro,
                    String estado) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.estado = estado;
    }

    public String getRua() {return rua;}

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numero=" + numero +
                ", cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
