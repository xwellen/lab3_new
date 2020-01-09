public class Trap extends Entity {
    private String name;



    public void checkAndCatch(Korotyshka.Leg o) throws Exception {

        if (!(positionX == o.positionX && positionY == o.positionY)) throw new Exception("Ловушка не может поймать ногу");

        o.setCatched(true);
        System.out.println("Ловушка поймала "+ o);
    }

    @Override
    public String toString() {
        return getCoordinates();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
