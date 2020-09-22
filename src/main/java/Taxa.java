public class Taxa {
    private double valor;
    private TipoCliente tipoCliente;
    private TipoDia tipoDia;

    public Taxa(double valor, TipoCliente tipoCliente, TipoDia tipoDia) {
        this.valor = valor;
        this.tipoCliente = tipoCliente;
        this.tipoDia = tipoDia;
    }

    public double getValor() {
        return valor;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public TipoDia getTipoDia() {
        return tipoDia;
    }
}
