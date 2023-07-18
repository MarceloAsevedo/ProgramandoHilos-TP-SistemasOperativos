class MiHilo2 implements Runnable{
    private boolean interrumpido = false;
    private int  nroAleatorio=200;
    Thread hilo;
    //Construye un nuevo hilo.
     MiHilo2(String nombre){
         hilo= new Thread(this,nombre);
     }
     //Un método de fábrica que crea e inicia un hilo.
     public static MiHilo2 crearYComenzar (String nombre){
         MiHilo2 miHilo2=new MiHilo2(nombre);
         miHilo2.hilo.start(); //Inicia el hilo
         return miHilo2;
     }
     //Punto de entrada de hilo.
    @Override
     public void run(){
         System.out.println(hilo.getName()+" arrancando.");
         try {
             for (int count=0; count<10;count++){
                  nroAleatorio=(int)(Math.random()*(2000-200+1)+200); //creo y genero aleatorios para el sleep
                 interrumpido=false;
                 Thread.sleep(nroAleatorio); //si tiene menos de 100 lo interrumpe
                   if (nroAleatorio<300){
                     hilo.interrupt(); //esto interrumpe el hilo suiempre que se cumpla el if
             }
                 System.out.println("|| "+hilo.getName()+ " paso por el obstaculo "+count);
             }
         }catch (InterruptedException exc){
             interrumpido=true;
             System.out.println(hilo.getName()+ " descalificado/a.");
         }
         if (interrumpido==false){
         System.out.println(hilo.getName()+" ya llego");}
     }  
 }