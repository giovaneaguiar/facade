class AgenciaViagensFacade {
    private ReservaHotel reservaHotel;
    private ReservaVoo reservaVoo;
    private AluguelCarro aluguelCarro;

    public AgenciaViagensFacade() {
        this.reservaHotel = new ReservaHotel();
        this.reservaVoo = new ReservaVoo();
        this.aluguelCarro = new AluguelCarro();
    }

    public boolean planejarViagem(String hotel, String companhia, String modelo) {
        boolean resultadoReservaHotel = reservaHotel.reservarHotel(hotel);
        boolean resultadoReservaVoo = reservaVoo.reservarVoo(companhia);
        boolean resultadoAluguelCarro = aluguelCarro.alugarCarro(modelo);

        return resultadoReservaHotel && resultadoReservaVoo && resultadoAluguelCarro;
    }
}