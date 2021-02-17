import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class SentenceGeneratorTest {
    SentenceGenerator sentenceGenerator;

    @BeforeEach
    void setUp() {
        sentenceGenerator = new SentenceGenerator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getArticleArrays(){
        assertNotNull(sentenceGenerator.getArticles());
        assertEquals(5,sentenceGenerator.getArticles().length);
    }

    @Test
    void generateSentence(){
        String sentence=sentenceGenerator.getSentence();
        assertNotNull(sentence);
        assertFalse(sentence.isEmpty());

        for(int i = 0 ;i<20; i++){
            System.out.println(sentenceGenerator.getSentence());
        }
    }
}