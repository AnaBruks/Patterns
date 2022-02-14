package Creating_patterns.prototyp;

public class Project implements Copyable{
    private int id;
    private String name, source;

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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Project(int id, String name, String source) {
        this.id = id;
        this.name = name;
        this.source = source;
    }

    @Override
    public Object copy() {
        return new Project(id, name, source) ;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
