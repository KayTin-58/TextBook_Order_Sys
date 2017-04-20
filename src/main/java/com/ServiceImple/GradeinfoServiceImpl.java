package com.ServiceImple;

import com.mapper.GradeinfoMapper;
import com.service.GradeinfoServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 直到世界尽头 on 4/16 0016.
 */
@Service
public class GradeinfoServiceImpl implements GradeinfoServie{

    @Autowired
    GradeinfoMapper  gradeMap;

    @Override
    public List<String> getAllCollege() {
        return gradeMap.selectAllCollege();
    }

    @Override
    public List<String> getAllProfessionByCollege(String name) {
        return gradeMap.selectAllProfessionByCollege(name);
    }
}
