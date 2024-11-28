package com.example.transport;

public class Main {

    public static void main(String[] args) {
        TransportFactory electricFactory = new ElectricTransportFactory();
        TransportFactory humanPoweredFactory = new HumanPoweredTransportFactory();

        Transport electricScooter = electricFactory.createScooter();
        Transport electricBike = electricFactory.createBike();
        Transport bicycle = humanPoweredFactory.createBike();
        Transport rollerSkates = ((HumanPoweredTransportFactory) humanPoweredFactory).createRollerSkates();
        Transport skateboard = ((HumanPoweredTransportFactory) humanPoweredFactory).createSkateboard();

        electricScooter.ride();
        electricBike.ride();
        bicycle.ride();
        rollerSkates.ride();
        skateboard.ride();
    }
}
