package com.web.web1.service;

import com.web.web1.model.friends;
import com.web.web1.repos.friendsrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class friendsServiceimpl implements friendsservice {

    @Autowired
    com.web.web1.repos.friendsrepository friendsrepository;
    @Override
    public List<friends> findAll() {
        return friendsrepository.findAll();
    }
}
