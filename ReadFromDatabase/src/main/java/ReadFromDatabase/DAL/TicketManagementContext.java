package ReadFromDatabase.DAL;

import java.util.ArrayList;
import java.util.List;

public class TicketManagementContext {

    public List<Plane> planes = new ArrayList<Plane>();
    public List<Customer> customers = new ArrayList<Customer>();
    public List<Ticket> tickets = new ArrayList<Ticket>();

    public TicketManagementContext() {
        // TODO: Add constructor and lock it$
    }
}
