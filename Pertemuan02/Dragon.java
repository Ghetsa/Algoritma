package Algoritma.Pertemuan02;

public class Dragon {
    int x, y, width, height;

    void moveLeft() {
        x -= 1;
        if (x < 0) {
            detectCollision();

        }
    }

    void moveRight() {
        x += 1;
        if (x > width) {
            detectCollision();
        }
    }

    void moveUp() {
        y -= 1;
        if (y < 0) {
            detectCollision();
        }
    }

    void moveDown() {
        y += 1;
        if (y > height) {
            detectCollision();
        }
    }

    void printPosition() {
        System.out.println("Posisi(X,Y): " + x + "," + y);
    }

    void detectCollision() {
        System.out.println("Game Over");
        System.exit(0);
    }

}
