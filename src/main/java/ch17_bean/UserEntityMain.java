package ch17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity user1 = new UserEntity();
        user1.setUsername(1);
        user1.setPassword(9876);
        user1.setEmail("a@test.com");
        user1.setName("노소정");

        System.out.println(user1);

        UserEntityLombok user2 = new UserEntityLombok();
        user2.setUsername(2);
        user2.setPassword(9876);
        user2.setEmail("b@test.com");
        user2.setName("김이");
        System.out.println(user2);
    }
}
