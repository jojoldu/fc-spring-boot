package com.jojoldu.lecture.fcspringboot.controller;

import com.jojoldu.lecture.fcspringboot.dto.Board;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jojoldu@gmail.com on 2019-01-12
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@Slf4j
@Controller
@RequestMapping("/boards")
public class BoardController {
    @GetMapping
    public String list(HttpSession session, ModelMap modelMap){
        Board board2 = Board.builder().name("kim").content("content2").title("title2").build();
        List<Board> list = Arrays.asList(
                new Board("title1", "kim", "content1"),
                board2,
                new Board("title3", "kang", "content3"));

        session.setAttribute("sessionValue", "hello session");
        modelMap.addAttribute("test", "test data\ntest data1\ntest data1\ntest data1\ntest data1\ntest data1\ntest data1\n");
        modelMap.addAttribute("count", 100);
        modelMap.addAttribute("list", list);
        return "list";
    }

    @GetMapping("/{id}")
    public String view(@PathVariable Long id) {
        log.info("id: "+id);
        return "view";
    }

    @GetMapping("/write")
    public String write() {
        return "redirect:/boards";
    }


    @GetMapping(params = "format=csv")
    public String getBoardsToXls(Model model){
        Board board2 = Board.builder().name("kim").content("content2").title("title2").build();
        List<Board> list = Arrays.asList(new Board("title1", "kim", "content1"), board2, new Board("title3", "kang", "content3"));

        model.addAttribute("boards", list);
        return "csvView";
    }
}
