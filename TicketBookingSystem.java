// Interface for Common Functions
interface CommonFunctions {
    void searchTicket();
    void bookTicket();
    void cancelTicket();
    void makePayment();
    void fillDetails();
}

// Customer Class
class Customer {
    private String customerId;
    private String name;
    private String address;
    private int phoneNo;
    private int age;

    // Constructor
    public Customer(String customerId, String name, String address, int phoneNo, int age) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.age = age;
    }

    // Getter and Setter methods
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Methods
    public void addDetails() {
        System.out.println("Adding customer details...");
        // Logic to add details to the database or storage
    }

    public void modifyDetails() {
        System.out.println("Modifying customer details...");
        // Logic to modify details in the database or storage
    }
}

// Agent Class
class Agent implements CommonFunctions {
    private int id;
    private String name;

    // Constructor
    public Agent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Implementing CommonFunctions methods
    @Override
    public void searchTicket() {
        System.out.println("Agent " + name + " is searching for a ticket...");
        // Implement search ticket logic here
    }

    @Override
    public void bookTicket() {
        System.out.println("Agent " + name + " is booking a ticket...");
        // Implement book ticket logic here
    }

    @Override
    public void cancelTicket() {
        System.out.println("Agent " + name + " is canceling a ticket...");
        // Implement cancel ticket logic here
    }

    @Override
    public void makePayment() {
        System.out.println("Agent " + name + " is making a payment...");
        // Implement make payment logic here
    }

    @Override
    public void fillDetails() {
        System.out.println("Agent " + name + " is filling ticket details...");
        // Implement fill details logic here
    }
}

// Ticket Class
class Ticket {
    private String source;
    private String destination;
    private String dateOfJourney;
    private String time;
    private String busNo;
    private String seatNo;

    // Constructor
    public Ticket(String source, String destination, String dateOfJourney, String time, String busNo, String seatNo) {
        this.source = source;
        this.destination = destination;
        this.dateOfJourney = dateOfJourney;
        this.time = time;
        this.busNo = busNo;
        this.seatNo = seatNo;
    }

    // Getter and Setter methods
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDateOfJourney() {
        return dateOfJourney;
    }

    public void setDateOfJourney(String dateOfJourney) {
        this.dateOfJourney = dateOfJourney;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    // Display Ticket Information
    public void displayTicketInfo() {
        System.out.println("Ticket Information:");
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Date of Journey: " + dateOfJourney);
        System.out.println("Time: " + time);
        System.out.println("Bus No: " + busNo);
        System.out.println("Seat No: " + seatNo);
    }
}

// Refund Class
class Refund {
    private float amount;
    private String customerId;

    // Constructor
    public Refund(float amount, String customerId) {
        this.amount = amount;
        this.customerId = customerId;
    }

    // Getter and Setter methods
    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    // Refund amount method
    public void refundAmount() {
        System.out.println("Refunding amount: " + amount + " to Customer ID: " + customerId);
        // Logic to process refund
    }
}

// BookingCounter Class (Assuming basic skeleton as it has no attributes or methods in the diagram)
class BookingCounter {
    // Logic for booking counter can be added here if needed
    public void processBooking(Customer customer, Ticket ticket, Agent agent) {
        System.out.println("Processing booking at the counter...");
        customer.addDetails();
        agent.fillDetails();
        ticket.displayTicketInfo();
        agent.makePayment();
        System.out.println("Booking processed successfully.");
    }
}

// Main class to test the program
public class TicketBookingSystem {
    public static void main(String[] args) {
        // Create a Customer
        Customer customer = new Customer("C001", "John Doe", "123 Main St", 1234567890, 30);

        // Create an Agent
        Agent agent = new Agent(101, "Agent Smith");

        // Create a Ticket
        Ticket ticket = new Ticket("New York", "Los Angeles", "2024-12-25", "09:00 AM", "Bus101", "A1");

        // Create a Refund
        Refund refund = new Refund(150.75f, "C001");

        // Create a Booking Counter
        BookingCounter bookingCounter = new BookingCounter();

        // Process booking
        bookingCounter.processBooking(customer, ticket, agent);

        // Refund process
        refund.refundAmount();
    }
}
