package modelo;
public class Section {
    private String name;
    private String description;
    private String routeImage;
    public Section(){;}
    public Section(String name, String description, String routeImage) {
        this.name = name;
        this.description = description;
        this.routeImage = routeImage;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRouteImage() {
        return routeImage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRouteImage(String routeImage) {
        this.routeImage = routeImage;
    }
    
}
