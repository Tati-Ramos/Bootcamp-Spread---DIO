package poo.model;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        //dados do endereço
        Endereco endereco = new Endereco();
        endereco.cep = "0000000";

        //dados do cliente
        Cliente cliente = new Cliente();


        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");

        }catch (Exception e){
            System.err.println("Houve um erro ao adicionar endereço: " + e.getMessage());
        }


    }

}
