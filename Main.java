import java.util.Scanner;
/* 
 ===========================
 ABSTRACT SUPERCLASS
 ===========================
abstract class Workout {
    - String name
    - int duration   ' minutes
    - int calories

    + Workout()
    + Workout(String name)
    + Workout(String name, int duration, int calories)

    + getName() : String
    + getDuration() : int
    + getCalories() : int

    + setName(String name) : void
    + setDuration(int duration) : void
    + setCalories(int calories) : void

    + equals(Object obj) : boolean
    + toString() : String

    {abstract} calculateCalories() : int
}

'===========================
 CONCRETE SUBCLASS
'===========================
class CardioWorkout extends Workout {
    - int heartRate

    + CardioWorkout()
    + CardioWorkout(String name)
    + CardioWorkout(String name, int duration, int calories, int heartRate)

    + getHeartRate() : int
    + setHeartRate(int heartRate) : void

    + calculateCalories() : int
    + toString() : String
}

===========================
 CUSTOM EXCEPTION
===========================
class InvalidWorkoutDataException extends Exception {
    + InvalidWorkoutDataException()
    + InvalidWorkoutDataException(String message)
}
========================
TESTER CLASS
========================
class CardioTester {
+testToString() : void
+testSetDuration() : void
+testSetDistance() : void
+testSetAvgPace() : void
+testCalculatePace() : void
+testGetCalculatePace() : void
+testGetDuration() : void
+testGetDistance() : void
+testGetAvgPace() : void
}
*/

public class Main {
        public static void main(String[] args) {
                Workout[] tracker = new Workout[10];
                Scanner keyboard = new Scanner(System.in);
                // Prompt user with options in a loop
                int choice = 0, duration = 0, distance = 0, count = 0, sets = 0, reps = 0, caloriesBurned = 0,
                                avgHeartRate = 0, avgPace = 0;

                do {
                        System.out.println();
                        System.out.println("1) Enter new Cardio");
                        System.out.println("2) Enter new Strength");
                        System.out.println("3) Exit");
                        System.out.println("4) Print all Cardio Workouts");
                        System.out.println("5) Print all Strength Workouts");
                        System.out.print(">>");
                        choice = keyboard.nextInt();
                        keyboard.nextLine();

                        if (choice >= 1 && choice <= 2) {
                                System.out.println("Enter duration   :");
                                duration = keyboard.nextInt();
                                keyboard.nextLine();
                        }

                        switch (choice) {
                                case 1:
                                        try {
                                                System.out.print("enter distance: ");
                                                distance = keyboard.nextInt();
                                                Cardio cardio = new Cardio(duration, distance, avgPace, avgHeartRate,
                                                                caloriesBurned);
                                                avgHeartRate = cardio.heartRate(duration, avgPace);
                                                caloriesBurned = cardio.calculateCalories(); // Example average heart rate
                                                avgPace = cardio.calculatePace(duration, distance);

                                                tracker[count] = cardio;
                                                count++;
                                        } catch (IllegalArgumentException e) {
                                                System.out.println("Error: " + e.getMessage());
                                        }
                                        break;
                                case 2:
                                        try {
                                                System.out.print("Enter sets: ");
                                                sets = keyboard.nextInt();
                                                System.out.print("Enter reps: ");
                                                reps = keyboard.nextInt();

                                                Weights weights = new Weights(duration, sets, reps, avgHeartRate,
                                                                caloriesBurned);
                                                caloriesBurned = weights.calculateCalories(); // Example calories burned
                                                avgHeartRate = weights.heartRate(duration, sets, reps); // Example average heart rate
                                                tracker[count] = weights;
                                                count++;
                                        } catch (IllegalArgumentException e) {
                                                System.out.println("Error: " + e.getMessage());
                                        }
                                        break;
                                case 3:
                                        System.out.println("\n\nAll Workouts");
                                        Main.printWorkouts(tracker, count);
                                        System.out.println("Exiting...");
                                        break;
                                case 4:
                                        System.out.println("\n\nAll Cardio Workouts");
                                        for (int i = 0; i < count; i++) {
                                                if (tracker[i] instanceof Cardio) {
                                                        System.out.println(tracker[i]);
                                                }
                                        }
                                        break;
                                case 5:
                                        System.out.println("\n\nAll Strength Workouts");
                                        for (int i = 0; i < count; i++) {
                                                if (tracker[i] instanceof Weights) {
                                                        System.out.println(tracker[i]);
                                                }
                                        }
                                        break;
                                default:
                                        System.out.println("Invalid choice. Please try again.");
                        }
                } while (choice != 3);
        }

        public static void printWorkouts(Workout[] workouts, int numWorkouts) {
                for (int i = 0; i < numWorkouts; i++) {
                        System.out.println("Workout #" + (i + 1) + " " + workouts[i]);
                }
        }
}