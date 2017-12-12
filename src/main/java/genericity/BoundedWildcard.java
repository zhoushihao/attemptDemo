package genericity;

/**
 * Created by ZSH
 */
public class BoundedWildcard {

    static void showXY(Coords<?> c) {
        System.out.println("X Y Coordinates:");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println("X=" + c.coords[i].x + ",Y=" + c.coords[i].y);
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("X Y Z Coordinates:");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println("X=" + c.coords[i].x + ",Y=" + c.coords[i].y + ",Z=" + c.coords[i].z);
        System.out.println();
    }

    static void showAll(Coords<? extends FourD> c) {
        System.out.println("X Y Z T Coordinates:");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println("X=" + c.coords[i].x + ",Y=" + c.coords[i].y + ",Z=" + c.coords[i].z + ",T=" + c.coords[i].t);
        System.out.println();
    }

    public static void main(String args[]) {
        TwoD td[] ={
                new TwoD(0,0),
                new TwoD(7,9),
                new TwoD(18,4),
                new TwoD(-1,-23)
        };

        Coords<TwoD> tdlocs = new Coords<>(td);

        System.out.println("Contents of tdlocs.");
        showXY(tdlocs);
//        showXYZ(tdlocs);  ERROR
//        showAll(tdlocs);  ERROR

        FourD fd[] = {
          new FourD(1,2,3,4),
          new FourD(6,8,10,12),
          new FourD(1,3,5,7),
          new FourD(1,4,7,10)
        };

        Coords<FourD> fdlocs = new Coords<>(fd);

        System.out.println("Contents of fdlocs.");

        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);

    }
}

class TwoD {
    int x, y;

    TwoD(int a, int b) {
        x = a;
        y = b;
    }
}

class ThreeD extends TwoD {
    int z;

    ThreeD(int a, int b, int c) {
        super(a, b);
        z = c;
    }
}

class FourD extends ThreeD {
    int t;

    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        t = d;
    }
}

class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] o) {
        coords = o;
    }
}

