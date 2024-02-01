package decorator;

import decorator.skills.CodeReviewGuy;
import decorator.skills.FrontDeveloper;
import decorator.skills.TestDeveloper;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------");

        JavaDeveloper javaDeveloper = new JavaDeveloper();
        javaDeveloper.developCode();

        System.out.println("----------------");

        TestDeveloper testJavaDeveloper = new TestDeveloper(javaDeveloper);
        testJavaDeveloper.developCode();

        System.out.println("----------------");

        FrontDeveloper frontJavaDeveloper = new FrontDeveloper(testJavaDeveloper);
        frontJavaDeveloper.developCode();

        System.out.println("----------------");

        JavaScriptDeveloper javaScriptDeveloper = new JavaScriptDeveloper();
        javaScriptDeveloper.developCode();

        System.out.println("----------------");

        CodeReviewGuy codeJSReviewGuy = new CodeReviewGuy(javaScriptDeveloper);
        codeJSReviewGuy.developCode();
    }
}
