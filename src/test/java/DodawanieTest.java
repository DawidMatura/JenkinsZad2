import static org.junit.Assert.*;

public class DodawanieTest {

    @org.junit.Test
    public void add() {
        Dodawanie dodawanie = new Dodawanie();
        assertEquals(10,dodawanie.Add(5,5));
    }
}