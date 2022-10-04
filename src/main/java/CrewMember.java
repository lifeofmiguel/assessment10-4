public class CrewMember extends Person implements Payable{
    private String flightCrewJob;
    private float salary;

    public CrewMember(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "CrewMember{" +
                "flightCrewJob='" + flightCrewJob + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void printPaymentAmount() {

    }
}
