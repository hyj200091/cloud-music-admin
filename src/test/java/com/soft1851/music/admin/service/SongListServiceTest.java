package com.soft1851.music.admin.service;

import com.soft1851.music.admin.entity.SongList;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SongListServiceTest {
@Resource
private SongListService songListService;
    @Test
    void getByType() {
    }

    @Test
    void getByPage() {
    }

    @Test
    void blurSelect() {
        List<SongList> songLists = songListService.blurSelect("轻音乐");
        songLists.forEach(System.out::println);
    }
}