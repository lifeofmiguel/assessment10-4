import java.util.ArrayList;

public class FlightApp {
    public static void printEachFlightCrewJob(ArrayList<FlightCrewJob> jobs){
        for (FlightCrewJob x : jobs){
            System.out.println(x);
        }
    }

    public static void printAmountForEachThingThatIsPayable(Payable[] payable){
        for (Payable x : payable){
            x.printPaymentAmount();
        }
    }

    public static void sortAndPrintFlightCrewJobsByJobTitle(ArrayList<FlightCrewJob> listJobs){

    }

    public static void printAllFlightCrewJobsExceptThisCrewMemberJob(ArrayList<FlightCrewJob> listOfJobs, CrewMember worker){
        for (FlightCrewJob x : listOfJobs){
            if (worker.getFlightCrewJob() != x) {
                System.out.println(x);
            }
        }
    }
}
