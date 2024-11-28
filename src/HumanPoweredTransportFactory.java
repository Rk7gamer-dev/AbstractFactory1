package com.example.transport;

public class HumanPoweredTransportFactory implements TransportFactory {
    @Override
    public Transport createScooter() {
        // Não existe um patinete movido pelo esforço humano no exemplo dado,
        // então retornaremos null ou poderíamos lançar uma exceção.
        return null;
    }

    @Override
    public Transport createBike() {
        return new Bicycle();
    }

    public Transport createRollerSkates() {
        return new RollerSkates();
    }

    public Transport createSkateboard() {
        return new Skateboard();
    }
}
