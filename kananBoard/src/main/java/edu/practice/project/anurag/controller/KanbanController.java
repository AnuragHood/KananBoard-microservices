package edu.practice.project.anurag.controller;

import edu.practice.project.anurag.dto.KanbanBoard;
import edu.practice.project.anurag.service.KanbanBoardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KanbanController {
    @Autowired
    private KanbanBoardServiceImpl kanbanBoardService;

    @GetMapping(path = "/showKanbanBoard/{id}")
    public KanbanBoard showBoard(@PathVariable int id) {
        return kanbanBoardService.getKanbanBoard(id);

    }

}
