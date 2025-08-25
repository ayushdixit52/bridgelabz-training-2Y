import java.util.Scanner;

public class concept1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String travelerName;
        double travelerHeight;
        double distanceFromStartToViaCity;
        double distanceFromViaCityToFinalCity;
        double totalTravelDistance;

        travelerName = input.nextLine();
        travelerHeight = input.nextDouble();
        distanceFromStartToViaCity = input.nextDouble();
        distanceFromViaCityToFinalCity = input.nextDouble();

        totalTravelDistance = distanceFromStartToViaCity + distanceFromViaCityToFinalCity;

        System.out.println("Traveler Name: " + travelerName);
        System.out.println("Height: " + travelerHeight + " meters");
        System.out.println("Total Travel Distance: " + totalTravelDistance + " km");

        input.close();
    }
}

