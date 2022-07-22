package entity;

import java.util.Date;

public class RentedMovie {
    private Date rentalDate;
    private Date returnDate;
    private String movieTitle;

    public RentedMovie(Date rentalDate, Date returnDate, String movieTitle) {
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.movieTitle = movieTitle;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
}
