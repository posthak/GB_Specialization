import java.io.Serializable;

public class Animal implements Serializable {
    private String fullName;
    private Integer age;
    // private Gender gender;

    public Animal(String fullName, /* Gender gender, */ Integer age) {
        this.fullName = fullName;
        // this.gender = gender;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getAge() {
        return age;
    }

    // public Gender getGender() {
    // return gender;
    // }

    // @Override
    // public String toString() {
    // return "Person{" +
    // "name='" + fullName + '\'' +
    // '}' + "\n";
    // }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + fullName + '\'' +
                ", Age=" + age +
                // ", Gender='" + gender + '\'' +
                '}' + "\n";
    }

}