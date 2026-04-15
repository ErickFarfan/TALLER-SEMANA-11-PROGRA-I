import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AgregarStockTest {

    @Test
    void testAgregarStockValido() {
        InventarioProducto p = new InventarioProducto("Mouse", "M001", 10, 25.5);
        p.agregarStock(5);
        assertEquals(15, p.getStock());
    }

    @Test
    void testAgregarStockNoValido() {
        InventarioProducto p = new InventarioProducto("Mouse", "M001", 10, 25.5);
        p.agregarStock(0);
        assertEquals(10, p.getStock());

        p.agregarStock(-3);
        assertEquals(10, p.getStock());
    }
}
