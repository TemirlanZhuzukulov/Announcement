package Java8.transport;


import java.time.LocalDate;

public final class Airplane extends Car{


    @Override
    public String toString() {
        return "Airplane{colour="+ getColour()
                +"}";
    }

    public Airplane(String name, String image, double price, String description, String colour, LocalDate yearofIssue) {
        super(name, image, price, description, colour, yearofIssue);
    }
}