package emumeration.test.ex1;

public enum AuthGrade {
    GUEST(1, "손님", "- 메인 페이지"),
    LOGIN(2, "로그인 회원", "- 메인 페이지\n- 이메일 관리 페이지"),
    ADMIN(3, "관리자", "- 메인페이지\n- 이메일 관리 페이지\n- 관리자 화면");

    private final int level;
    private final String description;
    private final String pages;

    AuthGrade(int level, String description, String pages) {
        this.level = level;
        this.description = description;
        this.pages = pages;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public String getPages() {
        return pages;
    }
}
