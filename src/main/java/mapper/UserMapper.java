package mapper;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    
    @Insert(value = "INSERT INTO user(account, password, nickname, created_at) values(#{account}, #{password}, #{nickname}, NOW())")
    public void signInUser(String account, String password, String nickname);
}
