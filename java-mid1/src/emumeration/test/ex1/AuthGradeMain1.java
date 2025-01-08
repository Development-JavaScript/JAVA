package emumeration.test.ex1;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade authGrade : authGrades) {
            printAuth(authGrade, authGrade.getLevel(), authGrade.getDescription());
        }
    }

    private static void printAuth(AuthGrade authGrades,int level, String description){
        System.out.println("grade=" + authGrades + ", level=" + level + ", 설명=" + description);
    }

}
