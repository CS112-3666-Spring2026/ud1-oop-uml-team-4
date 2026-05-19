public class Weights extends Workout
{
    private int duration; // in minutes
    private int sets; // number of sets
    private int reps; // number of reps per set


    public Weights(int duration, int sets, int reps, int avgHeartRate, int caloriesBurned) 
    {
        super(avgHeartRate, caloriesBurned);
        
        if (duration <= 0 || sets <= 0 || reps <= 0) {
            throw new IllegalArgumentException("Duration, sets, and reps must be positive integers.");
        }
        this.duration = duration;
        this.sets = sets;
        this.reps = reps;
    }



    public int heartRate(int duration, int sets, int reps)
    {
        int heartRate = (sets * reps)/100; // Example heart rate

        setAvgHeartRate(heartRate);
        return heartRate;
    }

    public void weightsWorkout(int duration, int sets, int reps)
    {
        this.duration = duration;
        this.sets = sets;
        this.reps = reps;
    }

    public void setSets(int sets)
    {
        this.sets = sets;
    }

    public void setReps(int reps)
    {
        this.reps = reps;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    public int getDuration()
    {
        return duration;
    }

    public int getSets()
    {
        return sets;
    }

    public int getReps()
    {
        return reps;
    }

    public String toString()
    {
        return "Weights{" +
                "duration=" + duration +
                ", sets=" + sets +
                ", reps=" + reps +
                ", avgHeartRate=" + getAvgHeartRate() +
                ", caloriesBurned=" + getCaloriesBurned() +
                '}';
    }
    @Override
    public boolean equals(Object other) 
    {
        return super.equals(other);
    }   
    public int calculateCalories()
    {
        int calories = duration * 3; // Example calories burned
        setCaloriesBurned(calories);
        return calories;
    }
}
