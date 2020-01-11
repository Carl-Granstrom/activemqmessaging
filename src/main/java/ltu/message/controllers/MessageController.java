package ltu.message.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ltu.message.domain.*;

import javax.jms.Queue;
import java.util.List;

@Controller
@RequestMapping("/api")
public class MessageController {

    @Autowired
    private Queue queue;

    @Autowired
    private JmsTemplate jmsTemplate;

    @RequestMapping("message/{message}")
    public String publish(@PathVariable("message") final String message){
        jmsTemplate.convertAndSend(queue, message);
        return "redirect:/api/transfer_start";
    }

    @ModelAttribute("courses")
    public List<Course> getCourses(){
        StaticCourseList2 staticCourseList = new StaticCourseList2();
        return staticCourseList.getCourses();
    }

    /**
     * Entry point for the Teacher GUI
     *
     * @param model the model used by the html-view
     * @return the html-view "list_courses.html"
     */
    @GetMapping("/transfer_start")
    public String searchCourse(Model model){
        model.addAttribute("courseForm", new CourseForm());
        return "list_courses_simple";
    }
}