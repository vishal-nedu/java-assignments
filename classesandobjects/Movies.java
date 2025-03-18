package assignments.classesandobjects;

public class Movies {
    private String  movie_name;
    private String genre;
    private String director_name;
    private String hero_name;
    private String heroine_name;

    public Movies(String movie_name, String genre, String director_name, String hero_name, String heroine_name) {
        this.movie_name = movie_name;
        this.genre = genre;
        this.director_name = director_name;
        this.hero_name = hero_name;
        this.heroine_name = heroine_name;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector_name() {
        return director_name;
    }

    public void setDirector_name(String director_name) {
        this.director_name = director_name;
    }

    public String getHero_name() {
        return hero_name;
    }

    public void setHero_name(String hero_name) {
        this.hero_name = hero_name;
    }

    public String getHeroine_name() {
        return heroine_name;
    }

    public void setHeroine_name(String heroine_name) {
        this.heroine_name = heroine_name;
    }

    @Override
    public String toString() {
        return "Moviedto{" +
                "movie_name='" + movie_name + '\'' +
                ", genre='" + genre + '\'' +
                ", director_name='" + director_name + '\'' +
                ", hero_name='" + hero_name + '\'' +
                ", heroine_name='" + heroine_name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Movies movie1=new Movies("Master","action","lokesh","vijay","Malavika");
        Movies movie2=new Movies("Sandhipoma","love","vishal","sri","AAkashni");
        System.out.println(movie2.toString());

    }
}
