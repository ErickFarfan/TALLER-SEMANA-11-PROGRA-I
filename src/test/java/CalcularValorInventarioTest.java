import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcularValorInventarioTest {

    @Test
    void testCalcularValorInventario() {
        InventarioProducto p = new InventarioProducto("Mouse", "M001", 10, 25.5);
        assertEquals(255.0, p.calcularValorInventario(), 0.001);
    }
}
