public class App {
    public static void main(String[] args) throws Exception {
        Agencia caixaLuizote = new Agencia("0205-08");
        ContaCorrente contaCorrente = new ContaCorrente(caixaLuizote, "1164-9",500d,1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(caixaLuizote, "1324-9",700d);
        ContaSalario contaSalario = new ContaSalario(caixaLuizote, "3333-3", 1400d);

        caixaLuizote.addContaRentavel(contaPoupanca);
        caixaLuizote.addContaEssencial(contaCorrente);
        caixaLuizote.addContaEssencial(contaSalario);

        caixaLuizote.saque("1164-9",1200);
        caixaLuizote.saque("1324-9", 1000);
        caixaLuizote.saque("3333-3", 1000);
        
        caixaLuizote.atualizaRendimentoContas(0.05);
    }
}
