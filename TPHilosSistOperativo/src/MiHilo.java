
class MiHilo extends Thread{
    private int nroAleatorio = 200;
   //Construye un nuevo hilo.
    MiHilo(String nombre){
    //super se usa para llamar a la versión del constructor de Thread
        super(nombre);
    }
    //Punto de entrada del hilo
    @Override
    public void run(){
        System.out.println(getName()+" iniciando.");
    //Como ExtendThread extiende de Thread, puede llamar directamente 
    //a todos los métodos de Thread, incluido el método getName().
    try {
        for (int cont=0;cont<10;cont++){
            nroAleatorio=(int)(Math.random()*(2000-200+1)+200);   
            Thread.sleep(nroAleatorio);
            System.out.println("En "+getName()+ ", el recuento es "+cont);
        }
    }catch (InterruptedException exc){
        System.out.println(getName()+ "interrumpido.");
    }
        System.out.println(getName()+ "finalizando.");
    }
}