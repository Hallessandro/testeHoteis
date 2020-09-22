import java.util.List;

public class Hotel {

    private String nome;
    private int classificacao;
    private List<Taxa> taxas;

    public Hotel(String nome, int classificacao, List<Taxa> taxas) {
        this.nome = nome;
        this.classificacao = classificacao;
        this.taxas = taxas;
    }

    public String getNome() {
        return nome;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public List<Taxa> getTaxas() {
        return taxas;
    }
}
