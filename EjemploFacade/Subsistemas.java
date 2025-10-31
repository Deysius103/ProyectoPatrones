class Lights {
    public void dim(int level) {
        System.out.println("Luces bajadas a nivel " + level);
    }

    public void on() {
        System.out.println("Luces encendidas");
    }
}

class TV {
    public void on() {
        System.out.println("TV encendida");
    }

    public void off() {
        System.out.println("TV apagada");
    }
}

class SoundSystem {
    public void on() {
        System.out.println("Sonido encendido");
    }

    public void setVolume(int level) {
        System.out.println("Volumen ajustado a " + level);
    }

    public void off() {
        System.out.println("Sonido apagado");
    }
}

class VideoPlayer {
    public void on() {
        System.out.println("Reproductor encendido");
    }

    public void play(String movie) {
        System.out.println("Reproduciendo: " + movie);
    }

    public void off() {
        System.out.println("Reproductor apagado");
    }
}
