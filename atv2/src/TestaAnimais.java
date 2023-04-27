public class TestaAnimais {
    public static void main(String[]args){
        Animal animal1,animal2,animal3,animal4;
        
        animal1 = new Animal();
        animal1.emitirSom();
        animal2 = new Cachorro();
        animal2.emitirSom();
        animal3 = new Gato();
        animal3.emitirSom();
        animal4 = new Preguica();
        animal4.emitirSom();
    }
}