public class Cliente {
    public static void main(String[] args) {

        Lights lights = new Lights();
        TV tv = new TV();
        SoundSystem sound = new SoundSystem();
        VideoPlayer player = new VideoPlayer();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(lights, tv, sound, player);

        homeTheater.watchMovie("El Señor de los Anillos");
        System.out.println();
        homeTheater.stopMovie();
    }
}