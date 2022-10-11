import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FlightCrewJob flightCrewJob1 = FlightCrewJob.FLIGHT_ATTENDANT;
        FlightCrewJob flightCrewJob2 = FlightCrewJob.CO_PILOT;
        FlightCrewJob flightCrewJob3 = FlightCrewJob.PILOT;

        CrewMember crewMember1 = new CrewMember("crewMember1", flightCrewJob1, 100000.0f);
        CrewMember crewMember2 = new CrewMember("crewMember2", flightCrewJob2, 900000.0f);
        CrewMember crewMember3 = new CrewMember("crewMember3", flightCrewJob3, 700000.0f);

        String[] luggage1 = {"toothpaste","pants", "shorts"};

        Ticket busTicket = new Ticket(2, "Manhatten", "Washington DC", "0076", 250.00);
        Ticket planeTicket = new PlaneTicket(10,"Detroit", "China", "100A", 100, true);


        Passenger passenger1 = new Passenger("Sam", busTicket, 1000.00, luggage1);

        System.out.println(passenger1.getAmtOfLuggage());

        passenger1.printTicket();
        crewMember1.serve(passenger1);
        Payable[] things = {crewMember1,crewMember2,crewMember3,planeTicket,busTicket};
        FlightApp.printAmountForEachThingThatIsPayable(things);
        ArrayList<FlightCrewJob> flightCrewJobs = new ArrayList<>();
        flightCrewJobs.add(flightCrewJob1);
        flightCrewJobs.add(flightCrewJob2);
        flightCrewJobs.add(flightCrewJob3);
        FlightApp.printEachFlightCrewJob(flightCrewJobs);
        FlightApp.sortAndPrintFlightCrewJobsByJobTitle((flightCrewJobs));
        FlightApp.printAllFlightCrewJobsExceptThisCrewMemberJob();






    }
}
