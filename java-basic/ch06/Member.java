package ch06;

public class Member {
    public String name;
    public String id;
    private String pw;
    public int age;

    public Member(String name, String id, String pw) {
        this.name = name;
        this.id = id;
        this.pw = pw;
    }

    public void print(){
        System.out.println("이름: " + name + ", ID: " + id);
    }
    public boolean login(){
        if(id.equals("won") && pw.equals("123")){
            System.out.println(id + "님 로그인");
            return true;
        } else {
            System.out.println("id 또는 pw가 올바르지 않습니다.");
            return false;
        }
    }
    public void logout(){
        System.out.println(id + "님 로그아웃");
    }
}
