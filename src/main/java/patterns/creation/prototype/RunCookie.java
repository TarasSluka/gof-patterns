package patterns.creation.prototype;

import patterns.creation.prototype.cookie.CoconutCookie;
import patterns.creation.prototype.cookie.Cookie;

import java.util.ArrayList;
import java.util.List;

public class RunCookie {

    private Cookie cookie;

    public RunCookie(Cookie cookie) {
        this.cookie = cookie;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Cookie tempCookie = null;
        Cookie prototype = new CoconutCookie();
        RunCookie runCookie = new RunCookie(prototype);
        List<Cookie> cookieList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Cookie cookie1 = runCookie.makeCookie();
            cookie1.setTmp(i);
            cookieList.add(cookie1);
        }
        for (int i = 0; i < cookieList.size(); i++) {
            System.out.println("" + cookieList.get(i).toString());
        }
//        cookieList.forEach(item -> System.out.println("" + cookieList.toString()));
        //        cookies.forEach(item -> System.out.println(""));

    }

    public Cookie makeCookie() throws CloneNotSupportedException {
        return (Cookie) this.cookie.clone();
    }
}
