public class TestaFigura {
    public static void main (String[]Args){
        Quadrado q1 = new Quadrado();
        q1.area(25);
        Circulo c1 = new Circulo();
        c1.area(15);
        Figura f1 = new Figura();
        f1.area(55);
        System.out.println("O polimorfismo ocorre quando as classes tem o mesmo método,\nno entanto cada método têm funções diferentes (área do Quadrado:lado, área do Circulo:raio, área da Figura:área)");
    }
}