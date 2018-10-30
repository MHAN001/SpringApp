package info7255.JsonSchema.model;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("Student")
public class Student {
    public Student(String s, String hanxu, Gender male) {
        this.id = s;
        this.name = hanxu;
        this.gender = male;
        this.grade = 100;
    }

    public enum Gender{
        MALE, FEMALE
    }

    private String id;
    private String name;
    private Gender gender;
    private int grade;
}
