package pl.sda.mg.jav110.jzp.zad7;

public class GunMain {
    public static void main(String[] args) {
        Gun gun = new Gun(3);
        gun.loadBullet("first");
        gun.loadBullet("second");
        gun.loadBullet("third");

        gun.loadBullet("fourth");

        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();

        gun.loadBullet("aaa");
        gun.loadBullet("bbb");
        gun.shot();
        gun.loadBullet("ccc");
        gun.shot();
        gun.shot();
    }
}
