import java.util.Scanner;
import java.util.UUID;

public class Cliente {

    String nome;
    double saldo;
    boolean ativo;
    UUID codigoCliente;
    String tipoConta;

    public double getSaldo() {

        return this.saldo;

    }

    public String getNome() {

        return this.nome;

    }

    public UUID getUUID() {

        return this.codigoCliente;

    }

    public void setUUID(UUID codigoCliente) {

        this.codigoCliente=codigoCliente;

    }

    public void setNome(String nome){

        this.nome=nome;

    }

    public void setSaldo(double saldo){

        this.saldo=saldo;

    }

    public void setAtivo (boolean ativo){

        this.ativo=ativo;
    }

    public boolean getAtivo() {

        return this.ativo;
    }

    public void setTipoConta(String tipoConta) {

        this.tipoConta=tipoConta;

    }

    public String getTipoConta() {

        return this.tipoConta;

    }
}