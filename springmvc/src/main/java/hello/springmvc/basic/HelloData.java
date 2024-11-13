package hello.springmvc.basic;

import lombok.Data;

@Data //lombok -> getter, setter자동생성.
public class HelloData {
    private String username;
    private int age;

}
