package magadiflo.design.patterns.creational.builder.guru.products.auxiliary;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London a Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GPSNavigator{");
        sb.append("route='").append(route).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
