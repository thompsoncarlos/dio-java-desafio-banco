//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente thompson = new Cliente();
        thompson.setNome("Thompson");

        Conta cc = new ContaCorrente(thompson);
        Conta cp = new ContaPoupanca(thompson);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}