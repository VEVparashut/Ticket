import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketRepositoryTest {
    TicketRepository repository = new TicketRepository();
    Ticket ticket1 = new Ticket(1, 48000, "VKO", "OGZ");
    Ticket ticket2 = new Ticket(2, 20000, "DME", "LED");
    Ticket ticket3 = new Ticket(3, 35500, "GOJ", "EGO");

    @Test
    public void addTicketTest() {
        repository.addTicket(ticket1);
        repository.addTicket(ticket2);
        repository.addTicket(ticket3);

        Ticket[] expected = {ticket1, ticket2, ticket3};
        Ticket[] actual = repository.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removedTicketTest() {
        repository.addTicket(ticket1);
        repository.addTicket(ticket2);
        repository.addTicket(ticket3);
        repository.removeById(2);

        Ticket[] expected = {ticket1, ticket3};
        Ticket[] actual = repository.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllTicketTest() {
        repository.addTicket(ticket1);
        repository.addTicket(ticket2);
        repository.addTicket(ticket3);


        Ticket[] expected = {ticket1, ticket2, ticket3};
        Ticket[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
