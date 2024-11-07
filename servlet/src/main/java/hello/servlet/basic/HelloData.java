package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloData {

    private String username;
    private int age;

    //아래부분을 lombok을 활용해 똑같이 사용 가능.
//    public int getAge() {
//        return age;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
}
