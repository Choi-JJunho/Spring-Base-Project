package service;

import java.util.HashMap;
import java.util.Iterator;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import mapper.PhraseMapper;

@Service
public class PhraseServiceImpl implements PhraseService {
    @Resource
    PhraseMapper phraseMapper;
    
    public String getPhrase() {
        HashMap<String, Object> data = phraseMapper.getValue();
        Iterator<String> keys = data.keySet().iterator();
        String result = "";
        
        while(keys.hasNext()) {
            String key = keys.next();
            result += data.get(key) + "\n-----------\n";         
        }
        
        return result;
    }
    
    public void addPhrase(String data) {
        phraseMapper.addPhrase(data);
    }
}
