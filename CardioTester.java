public class CardioTester {
    public static void main(String[] args) 
{
    testToString();
    testsetDuration();
    testsetDistance();
    testsetAvgPace();
    testCalculatePace();

    testgetCalculatePace();
    testgetDuration();
    testgetDistance();
    testgetAvgPace();
    
}

public static void testToString() 
{
    Cardio cardio = new Cardio(0,0,0,0,0);
    cardio.cardioWorkout(30, 5, 6);
    System.out.println(cardio.toString());
}

public static void testsetDuration() 
{
    Cardio cardio = new Cardio(0,0,0,0,0);
    cardio.setDuration(45);
    System.out.println("Duration set to: " + cardio.getDuration() + " minutes");
}
public static void testsetDistance() 
{
    Cardio cardio = new Cardio(0,0,0,0,0);
    cardio.setDistance(10);
    System.out.println("Distance set to: " + cardio.getDistance() + " miles");
}

public static void testsetAvgPace() 
{
    Cardio cardio = new Cardio(0,0,0,0,0);
    cardio.setAvgPace(6, 30, 5);
    System.out.println("Average pace set to: " + cardio.getAvgPace() + " minutes per mile");
}

public static void testCalculatePace() 
{
    Cardio cardio = new Cardio(0,0,0,0,0);
    int pace = cardio.calculatePace(30, 5);
    System.out.println("Calculated pace: " + pace + " minutes per mile");
}

public static void testgetCalculatePace() 
{
    Cardio cardio = new Cardio(0,0,0,0,0);
    cardio.setAvgPace(6, 30, 5);
    int pace = cardio.getAvgPace();
    System.out.println("Retrieved average pace: " + pace + " minutes per mile");
}

public static void testgetDuration() 
{
    Cardio cardio = new Cardio(0,0,0,0,0);
    cardio.setDuration(45);
    System.out.println("Duration retrieved: " + cardio.getDuration() + " minutes");
}

public static void testgetDistance() 
{
    Cardio cardio = new Cardio(0,0,0,0,0);
    cardio.setDistance(10);
    System.out.println("Distance retrieved: " + cardio.getDistance() + " miles");

}

public static void testgetAvgPace() 
{
    Cardio cardio = new Cardio(0,0,0,0,0);
    cardio.setAvgPace(6, 30, 5);
    System.out.println("Average pace retrieved: " + cardio.getAvgPace() + " minutes per mile");
}

}
/* */
