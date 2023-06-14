package serialization;

public class User
{
    private String name;
    private Long id;
    private String schoolNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchoolNum() {
        return schoolNum;
    }

    public void setSchoolNum(String schoolNum) {
        this.schoolNum = schoolNum;
    }

    public User(String name, Long id, String schoolNum) {
        this.name = name;
        this.id = id;
        this.schoolNum = schoolNum;
    }
}
