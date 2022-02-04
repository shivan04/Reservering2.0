package sr.unasat.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Reservation {
    private int reservationId;
    private Date reservationDate;
    private Time beginTijd;
    private Time eindTijd;
    private Klanten klantenByKlantId;
    private Location locationByLocationId;

    @Id
    @Column(name = "reservation_id")
    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    @Basic
    @Column(name = "reservation_date")
    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Basic
    @Column(name = "begin_tijd")
    public Time getBeginTijd() {
        return beginTijd;
    }

    public void setBeginTijd(Time beginTijd) {
        this.beginTijd = beginTijd;
    }

    @Basic
    @Column(name = "eind_tijd")
    public Time getEindTijd() {
        return eindTijd;
    }

    public void setEindTijd(Time eindTijd) {
        this.eindTijd = eindTijd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reservation that = (Reservation) o;

        if (reservationId != that.reservationId) return false;
        if (reservationDate != null ? !reservationDate.equals(that.reservationDate) : that.reservationDate != null)
            return false;
        if (beginTijd != null ? !beginTijd.equals(that.beginTijd) : that.beginTijd != null) return false;
        if (eindTijd != null ? !eindTijd.equals(that.eindTijd) : that.eindTijd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reservationId;
        result = 31 * result + (reservationDate != null ? reservationDate.hashCode() : 0);
        result = 31 * result + (beginTijd != null ? beginTijd.hashCode() : 0);
        result = 31 * result + (eindTijd != null ? eindTijd.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "klant_id", referencedColumnName = "klant_id")
    public Klanten getKlantenByKlantId() {
        return klantenByKlantId;
    }

    public void setKlantenByKlantId(Klanten klantenByKlantId) {
        this.klantenByKlantId = klantenByKlantId;
    }

    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "Location_id")
    public Location getLocationByLocationId() {
        return locationByLocationId;
    }

    public void setLocationByLocationId(Location locationByLocationId) {
        this.locationByLocationId = locationByLocationId;
    }
    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + reservationId+
                ", reservationdate='" + reservationDate + '\'' +
                ", begintijd ='" + beginTijd + '\'' +
                ", eindtijd='" + eindTijd + '\'' +
                ", klantId=" + klantenByKlantId +
                ", locationId =" + locationByLocationId+
                '}';
    }
}
