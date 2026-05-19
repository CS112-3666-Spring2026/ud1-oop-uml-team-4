public class Cardio extends Workout
{
    public Cardio(int duration, int distance, int avgPace, int avgHeartRate, int caloriesBurned) 
    {
        super(avgHeartRate, caloriesBurned);

        if (duration <= 0 || distance <= 0) {
            throw new IllegalArgumentException("Duration and distance must be positive integers.");
        }
        this.duration = duration;
        this.distance = distance;
        this.avgPace = avgPace;
    }

    private int duration; // in minutes
    private int distance; // in miles
    private int avgPace; // in minutes per mile
    
    public int heartRate(int duration, int avgPace)
    {
        int heartRate = avgPace * 2; // Example heart rate

        setAvgHeartRate(heartRate);
        return heartRate;
    }

    public void cardioWorkout(int duration, int distance, int avgPace)
    {
        this.duration = duration;
        this.distance = distance;
        this.avgPace = avgPace;
    }

    public int getDuration()
    {
        return duration;
    }

    public int getDistance()
    {
        return distance;
    }

    public int getAvgPace()
    {
        return avgPace;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }
    
    public void setDistance(int distance)
    {
        this.distance = distance;
    }

    public void setAvgPace(int avgPace, int duration, int distance)
    {
        this.avgPace = calculatePace(duration, distance);
    }
    public int calculatePace(int duration, int distance)

    {
        avgPace = duration / distance; // Pace in minutes per mile
        return avgPace;
    }

    public int calculateCalories()
    {
        int calories = duration * 10; // Example calories burned
        setCaloriesBurned(calories);
        return calories;
    }

    public String toString()
    {
        return "Cardio{" +
                "duration=" + duration +
                ", distance=" + distance +
                ", avgPace=" + avgPace +
                ", avgHeartRate=" + getAvgHeartRate() +
                ", caloriesBurned=" + getCaloriesBurned() +
                '}';
    }

    @Override
    public boolean equals(Object other) 
    {
        return super.equals(other);
    }
}
