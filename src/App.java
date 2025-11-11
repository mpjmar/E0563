public class App {

	public static void dibujaFila(int fila, int espacios) {

		for (int j = 0; j <= espacios - fila; j++)
			System.out.print(" ");
		for (int j = 0; j < fila * 2 - 1; j++)
			System.out.print("*");
	}
	
    public static void main(String[] args) throws Exception {

		boolean correcto = false;
		int altura1 = 0, altura2 = 0;
		int base1 = 0, base2 = 0;
		int espacios1 = 0, espacios2 = 0;

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

		int altMax = Math.max(altura1, altura2);
		int anchTot = (altura1 * 2 - 1) + (altura2 * 2 - 1) + 1;

		base1 = altura1 * 2 - 1;
		base2 = altura2 * 2 - 1;
		espacios1 = altura1 - 1;
		espacios2 = base1 + 1 + altura2;

		for (int i = altMax; i > 0 ; i++) {
			if (i > altura1) {
				dibujaFila(i, espacios1);
			}
			else if (i > altura2) {
				dibujaFila(i, espacios2);
			}
			System.out.println();
		}

	}
}
