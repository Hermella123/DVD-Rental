package entity;

public class Movie_copy {
    private long copiedMovieId;
    private boolean available;
    private long movieId;

    public Movie_copy(long copiedMovieId, boolean available, long movieId) {
        this.copiedMovieId = copiedMovieId;
        this.available = available;
        this.movieId = movieId;
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

    public long getMovieId() { return movieId; }

    public void setMovieId(long movieId) { this.movieId = movieId; }
}
