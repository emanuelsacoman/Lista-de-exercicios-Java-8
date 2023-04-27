public class Cliente {
    public void calcularDesconto(Double valor){
        System.out.println("\nO valor original é: "+valor);
        valor *= 0.9;
        System.out.println("O valor com desconto para clientes é: "+valor);
    }
} 