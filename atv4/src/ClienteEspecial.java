public class ClienteEspecial extends Cliente {
    public void calcularDesconto(Double valor){
        System.out.println("\nO valor original é: "+valor);
        valor *= 0.8;
        System.out.println("O valor com desconto para clientes especiais é: "+valor); 
    }
}   