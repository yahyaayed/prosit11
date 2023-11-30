public class Employe implements Comparable<Employe> {
    private int id;
    private String name;

    public Employe(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employe :" +
                "id=" + id +
                ", name='" + name + '\''
                ;
    }

    @Override
    public int compareTo(Employe o) {
        return Integer.compare(this.id,o.id);
    }
}
