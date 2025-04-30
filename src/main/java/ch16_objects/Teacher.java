package ch16_objects;

import java.util.Objects;

public class Teacher {
    private String name;
    private String schoolName;

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // toString을 override하여
    // 누구누구선생님의 근무지는 무슨무슨 학교입니다.
    // 로 출력될 수 있게끔 출력하시오.


    @Override
    public String toString() {
        return name + "선생님의 근무지는 " + schoolName +" 학교입니다.";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(schoolName, teacher.schoolName);
    }
    // 객체명1.equals(객체명2)

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }
}
