public class CrewMember extends Person implements Payable,ServAble{
    private FlightCrewJob flightCrewJob;
    private float salary;

    public CrewMember(String name, FlightCrewJob flightCrewJob, float salary) {
        super(name);
        this.flightCrewJob = flightCrewJob;
        this.salary = salary;
    }

    public CrewMember(String name) {
        super(name);
    }

    public FlightCrewJob getFlightCrewJob() {
        return flightCrewJob;
    }

    public void setFlightCrewJob(FlightCrewJob flightCrewJob) {
        this.flightCrewJob = flightCrewJob;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
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
        System.out.println(salary);
    }

    @Override
    public void serve(Person person) {
        System.out.println("now serving " + person.getName());
    }
}
