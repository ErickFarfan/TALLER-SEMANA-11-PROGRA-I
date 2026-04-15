import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GettersSettersTest {

    @Test
    void testSetNombre() {
        InventarioProducto p = new InventarioProducto("Mouse", "M001", 10, 25.5);
        p.setNombre("Teclado");
        assertEquals("Teclado", p.getNombre());
    }

    @Test
    void testSetPrecioUnitario() {
        InventarioProducto p = new InventarioProducto("Mouse", "M001", 10, 25.5);
        p.setPrecioUnitario(30.0);
        assertEquals(30.0, p.getPrecioUnitario(), 0.001);
    }
}
