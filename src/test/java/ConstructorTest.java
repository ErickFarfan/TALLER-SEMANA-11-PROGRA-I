import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConstructorTest {

    @Test
    void testConstructorInicializaCorrectamente() {
        InventarioProducto p = new InventarioProducto("Mouse", "M001", 10, 25.5);

        assertEquals("Mouse", p.getNombre());
        assertEquals("M001", p.getCodigo());
        assertEquals(10, p.getStock());
        assertEquals(25.5, p.getPrecioUnitario(), 0.001);
    }
}
