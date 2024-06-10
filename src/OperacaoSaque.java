public class OperacaoSaque extends Operacao{
    public OperacaoSaque(double valor){
        this.setValor(valor);
        this.setTipo('s');
    }

    public String toString(){
        String opSaqueStr = "Valor:" + getValor() + '\n' + "Tipo: Saque" + '\n' + "Data: " + getData() + '\n';
        return opSaqueStr;
    }
}
