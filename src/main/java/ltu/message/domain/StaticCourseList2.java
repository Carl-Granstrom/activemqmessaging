package ltu.message.domain;

import lombok.Getter;
import lombok.Setter;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class StaticCourseList2 {
    List<Course> courses;

    public StaticCourseList2(){
        String graName = "Grafiska användargränssnitt D0026A";
        String datName = "Datakommunikation i informationssystem D0025N";
        String affName = "Affärssystem - ERP D0026E";
        String rouName = "Routing och Switching D0024D";

        String graURL = "https://cloud.timeedit.net/ltu/web/schedule1/ri167XQQ565Z50Qv8Q043gZ6y5Y120276Y75Y.json";
        String datURL = "https://cloud.timeedit.net/ltu/web/schedule1/ri167XQQ565Z50Qv8Q053gZ6y5Y220976Y75Y.json";
        String affURL = "https://cloud.timeedit.net/ltu/web/schedule1/ri167XQQ565Z50Qv5Q053gZ6y5Y220676Y75Y.json";
        String rouURL = "https://cloud.timeedit.net/ltu/web/schedule1/ri167XQQ565Z50Qv8Q053gZ6y5Y220376Y75Y.json";

        URL gra = null;
        URL dat = null;
        URL aff = null;
        URL rou = null;

        try{
            gra = new URL(graURL);
            dat = new URL(datURL);
            aff = new URL(affURL);
            rou = new URL(rouURL);
        }
        catch(MalformedURLException e){
            System.out.println(e);
        }

        Course grafiska = new Course(graName, graURL, gra);
        Course data = new Course(datName, datURL, dat);
        Course affar = new Course(affName, affURL, aff);
        Course routing = new Course(rouName, rouURL, rou);

        courses = new ArrayList<>();
        courses.add(grafiska);
        courses.add(data);
        courses.add(affar);
        courses.add(routing);
    }
}
