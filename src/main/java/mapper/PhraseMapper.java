package mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface PhraseMapper {
    @Select(value = "SELECT * FROM phrase_table")
    HashMap<String, Object> getValue();
    
    @Insert(value = "INSERT INTO user(account, password, nickname, created_at) values(#{account}, #{password}, #{nickname}, NOW())")
    public void signInUser(String account, String password, String nickname);
}
