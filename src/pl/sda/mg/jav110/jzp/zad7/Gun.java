package pl.sda.mg.jav110.jzp.zad7;

import java.util.ArrayList;
import java.util.List;

public class Gun {
    private final int bulletsCount;
    private List<String> bullets;

    public Gun(int bulletsCount) {
        this.bulletsCount = bulletsCount;
        this.bullets = new ArrayList<>();
    }

    public void loadBullet(String bullet) {
        if (bullets.size() >= bulletsCount) {
            System.out.println("Nie mozna zaladowac kuli " + bullet + " do pelnego magazynku");
        } else {
            bullets.add(bullet);
        }
    }

    public boolean isLoaded() {
        return bullets.size() > 0;
    }

    public void shot() {
        if (isLoaded()) {
            System.out.println("Strzelamy nabojem: " + bullets.remove(bullets.size() - 1));
        } else {
            System.out.println("Najpierw zaladuj magazynek!");
        }
    }
}
