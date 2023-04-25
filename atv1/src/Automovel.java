public class Automovel extends Veiculo{
    public Automovel(){
        System.out.println("É um automóvel");
    }
    @Override
    public void verificar(){
        System.out.println("Verificar automóvel");
    }
    @Override
    public void ajustar(){
        System.out.println("Ajustar automóvel");
    }
    @Override
    public void limpar(){
        System.out.println("Limpar automóvel");
    }
}
