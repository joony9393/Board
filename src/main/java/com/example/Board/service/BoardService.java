package com.example.board.service;

import com.example.board.entity.Board;
import com.example.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.UUID;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository; // 객체를 생성 - 스프링 부트에서 제공하는 Autowired를 사용하면 스프링이 알아서 읽어와서 자동으로 주입을 해준다 dependency injection(의존성 주입)이라 함

    public void write(Board board, MultipartFile file) throws Exception{ // 오류처리 throws Exception

        String projectPath = System.getProperty("user.dir") + "/src/main/resources/static/files"; // 저장경로 지정

        UUID uuid = UUID.randomUUID(); // 파일 이름에 붙일 랜덤이름 생성

        String filename = uuid + "_" + file.getOriginalFilename(); // 랜덤이름을 파일네임 앞에 붙인 후 _ 그리고 원래 파일이름으로 파일이름 생성

        File saveFile = new File(projectPath, filename); // 파일을 생성해줄건데, projectPath에 담기고, name이름으로 담긴다는 의미

        file.transferTo(saveFile); // 예외처리 필요하기에 throws를 이용, 해주기

        board.setFilename(filename);
        board.setFilepath("/files/" + filename);

        boardRepository.save(board); // 이렇게 생성한 서비스는 다시 컨트롤러에서 사용할 것
    }

    // 게시글 리스트 불러오기 처리
    public Page<Board> boardlist(Pageable pageable){
        return boardRepository.findAll(pageable); //Board라는 class가 담긴 list를 찾아 반환 , 매개변수가 없는 경우에는 public list이지만, 매개변수로 pageable을 주면 public pableable로 바뀜
    }

    //특정게시글 불러오기
    public Board boardView(Integer id){
        return boardRepository.findById(id).get();
    }

    //특정게시글 삭제
    public void boardDelete(Integer id){
        boardRepository.deleteById(id);
    }

    public Page<Board> boardSearchList(String searchKeyword, Pageable pageable){
        return boardRepository.findByTitleContaining(searchKeyword, pageable);
    }
}