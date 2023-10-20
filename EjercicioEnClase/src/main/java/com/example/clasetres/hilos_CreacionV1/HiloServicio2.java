package com.example.clasetres.hilos_CreacionV1;

public class HiloServicio2 extends Thread{

	boolean runHilo;
	int contador;
	
	
	public HiloServicio2() {
		this.runHilo = true;
		this.contador = 1;
		start();
	}
	
	
	@Override
	public void run() {
		
		while(runHilo){
			
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Hilo servicio 2 en ejecución..................");
			contador++;
		}
	}


	public void detener() {
		this.runHilo = false;
	}
	
}
