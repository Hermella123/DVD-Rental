package entity;

import java.util.Date;

public class RentedMovie {
    private Date rentalDate;
    private Date returnDate;
    private long copiedMovieId;

    public RentedMovie(Date rentalDate, Date returnDate, long copiedMovieId) {
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.copiedMovieId = copiedMovieId;
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

    public long getCopiedMovieId() {
        return copiedMovieId;
    }

    public void setCopiedMovieId(long copiedMovieId) {
        this.copiedMovieId = copiedMovieId;
    }
}
