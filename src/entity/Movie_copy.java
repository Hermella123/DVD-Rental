package entity;

public class Movie_copy {
    private long copiedMovieId;
    private boolean available;
    private Movie movie;

    public Movie_copy(long copiedMovieId, boolean available, Movie movie) {
        this.copiedMovieId = copiedMovieId;
        this.available = available;
        this.movie = movie;
    }

    public long getCopiedMovieId() {
        return copiedMovieId;
    }

    public void setCopiedMovieId(long copiedMovieId) {
        this.copiedMovieId = copiedMovieId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
