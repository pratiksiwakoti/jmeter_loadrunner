package org.example.controller;

import org.example.model.Contest;
import org.example.services.ContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("http://localhost:3000")
public class ContestController {

    private ContestService contestService;


    @GetMapping("/populate")
    public List<Contest> populate() throws Exception{
        return contestService.populate();
    }

    @Autowired
    public ContestController(ContestService contestService) throws Exception{
        this.contestService = contestService;
    }


    @PostMapping("/createContest")
    public Contest createContest(@RequestBody Contest contest) throws Exception{
        return contestService.createContest(contest);
    }

    @GetMapping("/getAllContest")
    public List<Contest> getAllContest() throws Exception {
        return contestService.getAllContest();
    }

    @GetMapping("/getContest")
    public Contest getContest(Long contestId) throws Exception{
        return contestService.getContest(contestId);
    }

    @PostMapping("/updateContest")
    public Contest updateContest (@RequestBody Contest contest) throws Exception{
        return contestService.updateContest(contest);
    }

    @DeleteMapping("/deleteContest")
    public List<Contest> deleteContest(@RequestParam Long contestId) throws Exception
    {
        return contestService.deleteContest(contestId);
    }

}

