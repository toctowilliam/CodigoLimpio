package programacion_limpia.vista;

public class MenuView {

    public void mostrarMenu() {
        System.out.println("----  BIENVENIDO AL SISTEMA DE GESTIÓN DE CONTENIDO AUDIOVISUAL  -----");
        System.out.println("Elige una opción:");
        System.out.println("1. Ingresar Contenido Audiovisual mediante Archivo CSV.");
        System.out.println("2. Imprimir Contenido Audiovisual.");
        System.out.println("3. Eliminar Contenido Audiovisual.");
        System.out.println("4. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public void mostrarOpcionSeleccionada(int opcion) {
        if(opcion == 1) {

            System.out.println("\nSeleccionar CSV.  para cargar contenido audiovisual.\n");
        } else if (opcion == 2) {
            System.out.println("\nSe imprimió el archivo contenido.txt\n");
        } else if (opcion == 3) {
            System.out.println("\nSe va a eliminar todo el contenido audivisual ingresado\n");
        } else if (opcion == 4) {
            System.out.println("\n!!GRACIAS REGRESE PRONTO.!!\n");
        } else {
            System.out.println("Opción no válida. Intente de nuevo.");
        }
    }

}
