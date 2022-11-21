package Java8.transport;

import Java8.announcement.Announcement;

import java.time.LocalDate;

public class Car extends Announcement {
    public Car(String name, String image, double price, String description, String colour, LocalDate yearofIssue) {
        super(name, image, price, description);
        this.colour=colour;
        this.yearofIssue=yearofIssue;
    }
    private String colour;
    private LocalDate yearofIssue;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public LocalDate getYearofIssue() {
        return yearofIssue;
    }

    public void setYearofIssue(LocalDate yearofIssue) {
        this.yearofIssue = yearofIssue;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", yearofIssue=" + yearofIssue +
                '}';
    }
}