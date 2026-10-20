public class MainModulo {

    public static void main(String[] args) {

        Modulo login = new Modulo();
        login.nombre = "Login";
        login.lenguaje = "Java";
        login.version = "1.0";
        login.marcarTerminado();

        Modulo inventario = new Modulo();
        inventario.nombre = "Inventario";
        inventario.lenguaje = "Python";
        inventario.version = "2.1";

        Modulo reportes = new Modulo();
        reportes.nombre = "Reportes";
        reportes.lenguaje = "JavaScript";
        reportes.version = "1.5";
        reportes.marcarTerminado();

        login.mostrarInformacion();
        login.mostrarVersion();
        login.mostrarEstado();

        inventario.mostrarInformacion();
        inventario.mostrarVersion();
        inventario.mostrarEstado();

        reportes.mostrarInformacion();
        reportes.mostrarVersion();
        reportes.mostrarEstado();
    }
}
