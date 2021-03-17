//package com.tts.feedback.controller;
//
//import com.tts.feedback.model.TweetDisplay;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import javax.validation.Valid;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.tts.feedback.model.Tweet;
//import com.tts.feedback.model.User;
//import com.tts.feedback.service.TweetService;
//import com.tts.feedback.service.UserService;
//
//@Controller
//public class TweetController {
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private TweetService tweetService;
//
//    @GetMapping(value= {"/tweets", "/"})
//    public String getFeed(@RequestParam(value="filter", required = false) String filter,
//                          Model model){
//        User loggedInUser = userService.getLoggedInUser();
//        List<TweetDisplay> tweets = new ArrayList<>();
//        if (filter == null) {
//            filter = "all";
//        }
////        if (filter.equalsIgnoreCase("following")) {
////            List<User> following = loggedInUser.getFollowing();
////            tweets = tweetService.findAllByUsers(following);
////            model.addAttribute("filter", filter);
////        } else {
////            tweets = tweetService.findAll();
////            model.addAttribute("filter", filter);
////        }
////        model.addAttribute("tweetList", tweets);
////        return "feed";
//    }
//
//    @GetMapping(value = "/tweets/new")
//    public String getTweetForm(Model model) {
//        model.addAttribute("tweet", new Tweet());
//        return "newTweet";
//    }
//
//    @PostMapping(value = "/tweets/new")
//    public String submitTweetForm(@Valid Tweet tweet, BindingResult bindingResult, Model model) {
//        User user = userService.getLoggedInUser();
//        if (!bindingResult.hasErrors()) {
//            tweet.setUser(user);
//            tweetService.save(tweet);
//            model.addAttribute("successMessage", "Tweet successfully created!");
//            model.addAttribute("tweet", new Tweet());
//        }
//        return "newTweet";
//    }
////    NEW CODE FROM NICK'S ECOMMERCE - MEANT TO DEAL WITH SURVEY RESULTS
//    @PostMapping("/cart")
//    public String addToCart(@RequestParam long id) {
//        System.out.println(id);
//        Product p = productService.findById(id);
//        Map<Product, Integer> cart = cart();
//        System.out.println("Posting to cart" + cart);
//        setQuantity(p, cart.getOrDefault(p, 0) + 1);
//        return "redirect:/cart";
//    }
//}