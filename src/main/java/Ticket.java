public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String from;
    private String to;

    public Ticket(int id, int price, String from, String to) {
        this.id = id;
        this.price = price;
        this.from = from;
        this.to = to;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.getPrice() < o.getPrice()) {
            return -1;
        } else if (this.getPrice() > o.getPrice()) {
            return 1;
        } else {
            return 0;
        }
    }
}