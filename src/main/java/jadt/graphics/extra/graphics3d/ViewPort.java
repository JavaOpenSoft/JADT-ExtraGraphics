package jadt.graphics.extra.graphics3d;

public class ViewPort {
    private int x;
    private int y;
    private int z;
    public void moveObject(Object3D object3D, int x, int y , int z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

}
