package magadiflo.design.patterns.creational.builder.tutorialesjava.enfoque2;

public class User {
    // *************** Atributos ***************
    private String name;
    private String username;
    private String password;
    private int edad;

    // *************** Constructor privado ***************
    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.username = userBuilder.username;
        this.password = userBuilder.password;
        this.edad = userBuilder.edad;
    }

    // *************** Getters y Setters ***************
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // *************** Crea instancia de la clase UserBuilder ***************

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }

    // ********** Clase Builder: Clase anidada o clase interna ***********
    public static class UserBuilder {
        private String name;
        private String username;
        private String password;
        private int edad;

        private UserBuilder() {

        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
