package jskim.lines.sample.model;

public class Info {
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Info(String name, String id) {
        this.name = name;
        this.id = id;
    }

}
