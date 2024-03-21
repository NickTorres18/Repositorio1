import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private List<Producto> productos;

    public Tienda() {

        this.productos = new ArrayList<Producto>();
    }


    public Producto asignarProducto(Producto producto) {
        this.productos.add(producto);
        return producto;
    }


    public Producto mostrarProdcutos(Producto producto) {
        for (Producto product : this.productos) {
            System.out.println(product.getNombre() + " " + product.getDescripcion() + " " +
                    product.getPrecio() + " " + product.getStock() + " " + product.getCategoria());

        }
        return producto;

    }


    public Producto buscarProducto(Producto producto, String nombre) {
        for (Producto product : this.productos) {
            if (product.getNombre().equals(nombre)) {
                return product;
            }
        }
        return null;
    }

    public List buscarProductos(String nombre) {
        List<Producto> productosBuscados = new ArrayList<>();
        for (Producto product : this.productos) {
            if (product.getNombre().equals(nombre)) {
                productosBuscados.add(product);
            }
        }
        return productosBuscados;
    }

    public Producto agregarProducto(String nombre, String descripcion, int precio, int stock, String categoria) {
        Producto newProducto = new Producto(nombre, descripcion, precio, stock, categoria);
        this.productos.add(newProducto);
        return newProducto;


    }


    public Producto eliminarProducto(Producto producto) {
        this.productos.remove(producto);
        return null;

    }


    public Producto modificarProducto(Producto producto, String nombre, String catrgoria, String nuevoNombre, String nuevaDescripcion,
                                      int nuevoPrecio, int nuevoStock, String nuevaCategoria) {

        for (Producto product : this.productos) {

            if (product.getNombre().equals(nombre)) {
                product.setNombre(nuevoNombre);
                product.setDescripcion(nuevaDescripcion);
                product.setPrecio(nuevoPrecio);
                product.setStock(nuevoStock);
                product.setCategoria(nuevaCategoria);

                System.out.println(product.getNombre() + " " + product.getDescripcion() + " " + product.getPrecio() + " " + product.getPrecio() + " " +
                        product.getStock() + " " + product.getCategoria());


            }


        }
        return producto;


    }


    public void compraProducto(Producto producto, String nombre, String categoria) {
        for (Producto product : this.productos) {
            if (product.getNombre().equals(nombre) && product.getCategoria().equals(categoria)) {

                product.setStock(product.getStock() - 1);

                System.out.println("Compra realizada el stock nuevo es:" + " " + product.getStock());


                if (product.getStock() == 0) {


                    eliminarProducto(producto);

                }

            }


        }


    }


}



