public class InventarioProducto {
/*
# Práctica POO - InventarioProducto

Implemente dentro de la clase `InventarioProducto` en `src/main/java`.

## Requisitos
- Constructor con todos los atributos
- Métodos accesorios solicitados
- Métodos de negocio solicitados
- Mantener exactamente los nombres de la clase y métodos


## Importante
La calificación se realizará automáticamente mediante pruebas en GitHub Actions.
Revise la pestaña **Actions** después de cada push.

 */




    /*
    Complete la seccion de los atributos
      La clase debe tener los siguientes atributos privados:
        nombre ejemplo "Router"
        codigo de tipo "R01"
        stock de tipo  100
        precioUnitario de tipo double 2.67f

     */

    /*
    Complete la seccion el constructor con todos los parametros
     */

    /*
    Complete la seccion los metodos para cumplir con los requisitos
    Métodos accesorios
        getNombre()
        setNombre(String nombre)
        getCodigo()
        getStock()
        getPrecioUnitario()
        setPrecioUnitario(double precioUnitario)
    Métodos de negocio
        agregarStock(int cantidad)
        Aumenta el stock solo si la cantidad es mayor a 0.
        vender(int cantidad)
        Disminuye el stock solo si:
        la cantidad es mayor a 0
        existe suficiente stock
        Debe retornar:
        true si la venta fue exitosa
        false si no fue posible vender
        calcularValorInventario()
     */


    public String getNombre() {
        return null;
    }

    public void setNombre(String nombre) {

    }

    public String getCodigo() {
        return null;
    }

    public int getStock() {
        return 0;
    }



    public void agregarStock(int cantidad) {

    }

    public boolean vender(int cantidad) {
        return false;
    }

    public double calcularValorInventario() {
        return 0;
    }

}


