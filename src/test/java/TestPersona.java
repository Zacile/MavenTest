import modelo.Persona;

import org.junit.jupiter.api.Test;

public class TestPersona {

    @Test
    public void testPersona(){
        Persona p = new Persona();
        p.setEdad(14);
        p.setNombre("Maria");
        Assertions.assertAll{
            ()->Assertions.assertEquals(14,p.getEdad());
            ()->Assertions.assertEquals("Maria",p.getNombre());
        }
    }

}
