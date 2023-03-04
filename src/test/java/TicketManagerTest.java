import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TicketManagerTest {
    TicketRepository repository = new TicketRepository();
    TicketManager manager = new TicketManager(repository);

    Ticket ticket1 = new Ticket(1, 48000, "VKO", "OGZ");
    Ticket ticket2 = new Ticket(2, 20000, "DME", "LED");
    Ticket ticket3 = new Ticket(3, 35500, "GOJ", "EGO");
    Ticket ticket4 = new Ticket(4, 31000, "DME", "LED");

    @BeforeEach
    public void setup() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
    }

    @Test
    public void findAllTest() {

        Ticket[] expected = {ticket1};
        Ticket[] actual = manager.findAll("VKO", "OGZ");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllNullTest() {

        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("DME", "VKO");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllTwoTest() {

        Ticket[] expected = {ticket2, ticket4};
        Ticket[] actual = manager.findAll("DME", "LED");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void compareToTiket1() {

        System.out.println(ticket1.compareTo(ticket2));
    }

    @Test
    public void compareToTiket2() {

        System.out.println(ticket2.compareTo(ticket3));
    }
}