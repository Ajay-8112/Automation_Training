package Day1;

public class imp implements power,volume,play {
    @Override
    public void musicpause() {
        System.out.println("Music paused");
    }

    @Override
    public void musicplay() {
        System.out.println("Music plays");
    }

    @Override
    public void poweron() {
        System.out.println("Speaker on");
    }

    @Override
    public void poweroff() {
        System.out.println("Speaker off");
    }

    @Override
    public void volumedown() {
        System.out.println("Volume decreases");
    }

    @Override
    public void volumeup() {
        System.out.println("Volume increases");
    }

    @Override
    public void volumemute() {
        System.out.println("Volume mute");
    }
}
