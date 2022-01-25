
public class Statistic implements Comparable<Statistic> {
   private String rate;
   private String population;
   private String gender;
   private String country;
   private int year;
   private double percent;

    public Statistic(String rate, String population, String gender, String country, int year, double percent) {
        this.rate = rate;
        this.population = population;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.percent = percent;
    }

    public String getRate() {
        return rate;
    }

    public String getPopulation() {
        return population;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public double getPercent() {
        return percent;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender.replace("(%)","").trim() + ", " + this.percent;
    }

  
   @Override
    public int compareTo(Statistic statistic) {
        if (this.percent == statistic.getPercent()) {
            return 0;
        }
       if ((this.percent - statistic.getPercent()) < 0) {
           return -1;
       } else {
           return 1;
       }
    }
}
