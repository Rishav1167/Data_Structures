package LinkedList.Movie_Management_System_DLL;

public class MovieNode {
   String movieTitle;
   String director;
   int yearOfRelease;
   float rating;
   MovieNode next;
   MovieNode prev;

    public MovieNode(String movieTitle, String director, int yearOfRelease, float rating) {
        this.movieTitle = movieTitle;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
