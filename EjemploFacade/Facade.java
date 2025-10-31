class HomeTheaterFacade {
    private Lights lights;
    private TV tv;
    private SoundSystem sound;
    private VideoPlayer player;

    public HomeTheaterFacade(Lights lights, TV tv, SoundSystem sound, VideoPlayer player) {
        this.lights = lights;
        this.tv = tv;
        this.sound = sound;
        this.player = player;
    }

    public void watchMovie(String movie) {
        System.out.println("Preparando para ver una película...");
        lights.dim(10);
        tv.on();
        sound.on();
        sound.setVolume(20);
        player.on();
        player.play(movie);
        System.out.println("¡Disfruta la película!");
    }

    public void stopMovie() {
        System.out.println("Apagando cine en casa...");
        lights.on();
        player.off();
        sound.off();
        tv.off();
    }
}
