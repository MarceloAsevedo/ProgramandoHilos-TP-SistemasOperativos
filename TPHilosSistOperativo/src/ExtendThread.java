
class ExtendThread{
     public static void main(String[] args) {
         int numeroAleatorio = 200;
         System.out.println("Iniciando hilo principal ejemplo 3");
         MiHilo hilo1=new MiHilo("#1");
         MiHilo hilo2 = new MiHilo ("#2");
         
         hilo1.start();
         hilo2.start();
         for (int i=0;i<15;i++){
             numeroAleatorio=(int)(Math.random()*(2000-100+1)+100);
             System.out.print("*");
             if (numeroAleatorio<300){  //aca para ver si hace interrupciones
                     hilo1.interrupt();}
             else if(numeroAleatorio<150){
             hilo2.interrupt();}
         try {
             Thread.sleep(numeroAleatorio);
             
         }catch (InterruptedException exc) {
             System.out.println("Hilo principal interrumpido");
         }
         }
         System.out.println("Hilo principal finalizado");
         //abajo es el main del ejemplo 4 del primer link lo pongo aca para hacer los dos en uno solo
         System.out.println("Iniciando multiples hilos con el ejemplo 4");
          System.out.println("El primero que llegue sin ser descalificado gana.");
         System.out.println("Que comience la carrera!!");
         MiHilo2 hiloProfe = MiHilo2.crearYComenzar("El profe");
         MiHilo2 hiloMarcelo = MiHilo2.crearYComenzar("Marcelo");
         MiHilo2 hiloAaron = MiHilo2.crearYComenzar("Aaron");
         MiHilo2 hiloNachito = MiHilo2.crearYComenzar("Nachito");
         MiHilo2 hiloPaula= MiHilo2.crearYComenzar("Paula");
         MiHilo2 hiloFede = MiHilo2.crearYComenzar("Fede");
         MiHilo2 hiloRoman = MiHilo2.crearYComenzar("Roman");
         MiHilo2 hiloMary= MiHilo2.crearYComenzar("Mary");
         MiHilo2 hiloMauri = MiHilo2.crearYComenzar("Mauri");
         MiHilo2 hiloCris = MiHilo2.crearYComenzar("Cris");
         
         for (int i = 0; i < 30; i++) {
             System.out.print("*");
             numeroAleatorio=(int)(Math.random()*(2000-100+1)+100);

             try {
                 Thread.sleep(numeroAleatorio);
             } catch (InterruptedException exc) {
                 System.out.println("Hilo principal interrumpido.");
             }
         }
         System.out.println("Hilo finalizado");
         
     }
 }
