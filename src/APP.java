
public class APP {

    public static void inicializar() {
        Tienda tienda = new Tienda();


        Producto product = new Producto("PC", "Computador portatil", 1000, 5, "Computación"
        );

        tienda.asignarProducto(product);

        tienda.mostrarProdcutos(product);

        System.out.println(tienda.buscarProductos("PC"));

        tienda.agregarProducto("Celu","d1",200,3,"n");







        tienda.compraProducto(product,"PC","Computación");









        tienda.modificarProducto(product, "PC", "Computador portatil", "Lamptop", "Compu", 1500,
                7, "NO se");










        System.out.println(tienda.eliminarProducto(product));





    }





    public static void main(String[]args) {inicializar();}


}
