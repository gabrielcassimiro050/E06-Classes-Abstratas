public class OperacaoDeposito extends Operacao{
    public OperacaoDeposito(double valor){
        this.setValor(valor);
        this.setTipo('d');
    }

    public String toString() {
        String opSaqueStr = "Valor:" + getValor() + '\n' + "Tipo: Depósito" + '\n' + "Data: " + getData() + '\n';
        return opSaqueStr;
    }
}
