public class TestaCliente {
    public static void main(String[]args){
        Cliente c1 = new Cliente();
        c1.calcularDesconto(1500.00);
        
        ClienteEspecial ce1 = new ClienteEspecial();
        ce1.calcularDesconto(1500.00);

        
        Cliente c2 = new Cliente();
        c2.calcularDesconto(5000.00);

        ClienteEspecial ce2 = new ClienteEspecial();
        ce2.calcularDesconto(2500.00);
    }
}