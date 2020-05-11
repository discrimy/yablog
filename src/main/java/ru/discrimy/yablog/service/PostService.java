package ru.discrimy.yablog.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.discrimy.yablog.model.Post;
import ru.discrimy.yablog.model.User;

import java.util.List;

public interface PostService extends BaseService<Post> {
    Page<Post> findAll(Pageable pageable);
    Page<Post> findAllByAuthor(Pageable pageable, User user);

    List<Post> findAllPinned();
}
