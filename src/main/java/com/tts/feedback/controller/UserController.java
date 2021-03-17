package com.tts.feedback.controller;

import com.tts.feedback.model.TweetDisplay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.tts.feedback.model.User;
import com.tts.feedback.service.TweetService;
import com.tts.feedback.service.UserService;

import java.util.List;

@Controller
public class UserController<tweets, user> {
    @Autowired
    private UserService userService;
    @Autowired
    private TweetService tweetService;

    @GetMapping(value = "/users/{username}")
    public String getUser(@PathVariable(value = "username") String username, Model model) {
        User user = userService.findByUsername(username);
        User loggedInUser = userService.getLoggedInUser();

    boolean isSelfPage = loggedInUser.getUsername().equals(username);
        model.addAttribute("isSelfPage", isSelfPage);
        model.addAttribute("user", user);
        return "user";
    }

//    @GetMapping(value = "/users")
//    public String getUsers(@RequestParam(value = "filter", required = false) String filter, Model model) {
//        List<User> users = new ArrayList<>();
//        User loggedInUser = userService.getLoggedInUser();
//        List<User> usersFollowing = loggedInUser.getFollowing();
//        List<User> usersFollowers = loggedInUser.getFollowers();
//        if (filter == null) {
//            filter = "all";
//        }
//        if (filter.equalsIgnoreCase("followers")) {
//            users = usersFollowers;
//            model.addAttribute("filter", filter);
//        } else if (filter.equalsIgnoreCase("following")) {
//            users = usersFollowing;
//            model.addAttribute("filter", filter);
//        } else {
//            users = userService.findAll();
//            model.addAttribute("filter", filter);
//        }
//        model.addAttribute("users", users);
//        setTweetCounts(users, model);
//        setFollowingStatus(users, usersFollowing, model);
//        return "users";
//    }

//    private void setTweetCounts(List<User> users, Model model) {
//        HashMap<String, Integer> tweetCounts = new HashMap<>();
//        for (User user : users) {
//            List<TweetDisplay> tweets = tweetService.findAllByUser(user);
//            tweetCounts.put(user.getUsername(), tweets.size());
//        }
//        model.addAttribute("tweetCounts", tweetCounts);
//    }
//
}