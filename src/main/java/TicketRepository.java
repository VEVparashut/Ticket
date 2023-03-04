public class TicketRepository {
    private Ticket[] items = new Ticket[0];

    public void addTicket(Ticket item) {
        Ticket[] tmp = new Ticket[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public void removeById(int id) {
        Ticket[] tmp = new Ticket[items.length - 1];
        int copyIndex = 0;
        for (Ticket item : items) {
            if (item.getId() != id) {
                tmp[copyIndex] = item;
                copyIndex++;
            }
        }
        items = tmp;
    }

    public Ticket[] getItems() {
        return items;
    }

    public Ticket[] findAll() {
        return items;
    }
}