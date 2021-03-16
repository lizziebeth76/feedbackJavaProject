package com.tts.feedback.repository;

import org.springframework.data.repository.CrudRepository;
import com.tts.feedback.model.Tweet;
import com.tts.feedback.model.User;
import java.util.List;

public interface TweetRepository extends CrudRepository<Tweet, Long> {
    List<Tweet> findAllByOrderByCreatedAtDesc();

    List<Tweet> findAllByUserOrderByCreatedAtDesc(User user);

    List<Tweet> findAllByUserInOrderByCreatedAtDesc(List<User> users);

//    public List<Tweet> findByTags_PhraseOrderByCreatedAtDesc(String phrase);
}