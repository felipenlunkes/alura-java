package br.com.lunx.bank;

public class Opera {

    public boolean transferirPix(double valor, double saldo) {

        // Vamos checar se o cliente tem saldo para transferir

        if (saldo < valor) {

            return false;

        } else {

            return true;
        }
    }

    public double receberPix(double valor, double saldo) {

        // Vamos calcular o saldo final do usuário

       return saldo + valor;

    }

}
