package entity;

import java.util.Date;

public class RentedMovie {
    private Date rentalDate;
    private Date returnDate;
    private Movie_copy rentedMovie;

    public RentedMovie(Date rentalDate, Date returnDate, Movie_copy rentedMovie) {
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentedMovie = rentedMovie;
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

    public Movie_copy getRentedMovie() {
        return rentedMovie;
    }

    public void setRentedMovie(Movie_copy rentedMovie) {
        this.rentedMovie = rentedMovie;
    }
}
