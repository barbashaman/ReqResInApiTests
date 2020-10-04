package in.reqres.domain;

public class User {

    private String id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;
    private String year;
    private String color;
    private String pantone_value;
    private String job;
    private String createdAt;


    public User() {
    }

    public User(String email, String first_name, String last_name){
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPantone_value() {
        return pantone_value;
    }

    public void setPantone_value(String pantone_value) {
        this.pantone_value = pantone_value;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "\nid='" + id + '\'' +
                ",\nemail='" + email + '\'' +
                ",\nfirst_name='" + first_name + '\'' +
                ",\nlast_name='" + last_name + '\'' +
                ",\navatar='" + avatar + '\'' +
                ",\nyear='" + year + '\'' +
                ",\ncolor='" + color + '\'' +
                ",\npantone_value='" + pantone_value + '\'' +
                '}';
    }
}


