public class Workout
{
    public int avgHeartRate;
    public int caloriesBurned;


    public Workout(int avgHeartRate, int caloriesBurned)
    {
        if (avgHeartRate < 0 || caloriesBurned < 0) {
            throw new IllegalArgumentException("Average heart rate and calories burned must be non-negative integers.");
        }
        this.avgHeartRate = avgHeartRate;
        this.caloriesBurned = caloriesBurned;
    }

    public int getAvgHeartRate()
    {
        return avgHeartRate;
    }

    public int getCaloriesBurned()
    {
        return caloriesBurned;
    }

    public void setAvgHeartRate(int avgHeartRate)
    {
        this.avgHeartRate = avgHeartRate;
    }

    public void setCaloriesBurned(int caloriesBurned)
    {
        this.caloriesBurned = caloriesBurned;
    }

    public String toString()
    {
        return "Workout{" +
                " avgHeartRate = " + avgHeartRate +
                " , caloriesBurned = " + caloriesBurned +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    
}
