package Entity;

import java.util.Date;

public class RentedMovie {
    private Date rentalDate;
    private Date returnDate;
    private Movie_copie rentedMovie;

    public RentedMovie(Date rentalDate, Date returnDate, Movie_copie rentedMovie) {
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

    public Movie_copie getRentedMovie() {
        return rentedMovie;
    }

    public void setRentedMovie(Movie_copie rentedMovie) {
        this.rentedMovie = rentedMovie;
    }
}
