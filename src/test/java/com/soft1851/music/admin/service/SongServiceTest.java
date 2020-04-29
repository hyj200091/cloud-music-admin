package com.soft1851.music.admin.service;

import com.soft1851.music.admin.entity.Song;
import com.soft1851.music.admin.entity.Video;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SongServiceTest {
@Resource
    private SongService songService;

    @Test
    void  selectAll(){
        List<Song>songs = songService.selectAll();
        songs.forEach(System.out::println);
    }

    @Test
    void getSongByDate() {
        List<Song> songs = songService.getSongByDate("week");
        System.out.println(songs.get(0));
    }

    @Test
    void exportData() {
        songService.exportData();
    }
}