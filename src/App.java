public class App {

	public static void dibujaFila(int fila) {
	
		System.out.print();
	}
	
    public static void main(String[] args) throws Exception {

		boolean correcto = false;
		int altura1 = 0, altura2 = 0;

		do {
			try {
				System.out.print("Introduzca la altura de la primera pirámide: ");
				altura1 = Integer.parseInt(System.console().readLine());
				System.out.print("Introduzca la altura de la segunda pirámide: ");
				altura2 = Integer.parseInt(System.console().readLine());
				correcto = altura1 > 1 && altura2 > 1;
				if (!correcto) System.out.println("La altura debe ser mayor que 1.");
			}
			catch (NumberFormatException e) {
				System.out.println("El número debe ser un entero.");
			}
			catch (Exception e) {
				System.out.println("Ha ocurrido un error inesperado.");
			}
		} while (!correcto);

		int altMax = altura1 > altura2 ? altura1 : altura2;
		int anchTot = (altura1 * 2 - 1) + (altura2 * 2 - 1) + 1;

		
		// version 2

		for (int i = 0; i < altMax; i++) {
			int j = 0;
			if (altura1 > altura2) {
				while (j < altura1 - i - 1){
					System.out.print(" ");
					j++;
				}
				while (j < i * 2 - 1) {
					System.out.print("*");
					j++;
				}
			}
			System.out.println();
		}


		// version 1

		for (int i = 0; i < altMax; i++) {
			for (int j = 0; j < anchTot; j++) {
				if (altura1 > altura2) {
					if (j < altura1 - i - 1)
						System.out.print(" ");
					//if (j < i * 2 - 1)
					//	System.out.print("*");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
