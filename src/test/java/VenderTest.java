import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VenderTest {

    @Test
    void testVentaExitosa() {
        InventarioProducto p = new InventarioProducto("Mouse", "M001", 10, 25.5);
        boolean resultado = p.vender(4);

        assertTrue(resultado);
        assertEquals(6, p.getStock());
    }

    @Test
    void testVentaConStockInsuficiente() {
        InventarioProducto p = new InventarioProducto("Mouse", "M001", 10, 25.5);
        boolean resultado = p.vender(15);

        assertFalse(resultado);
        assertEquals(10, p.getStock());
    }

    @Test
    void testVentaCantidadNoValida() {
        InventarioProducto p = new InventarioProducto("Mouse", "M001", 10, 25.5);

        assertFalse(p.vender(0));
        assertFalse(p.vender(-2));
        assertEquals(10, p.getStock());
    }
}