package assignment;

import assignment.personalityTest.PersonalityTrait;
import assignment.personalityTest.Questionnaire;
import assignment.personalityTest.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static assignment.personalityTest.PersonalityTrait.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BriggsTest {
    Questionnaire trait;
    @BeforeEach
    public void setUp(){
        trait = new Questionnaire();
    }
    @Test
    public void BriggsCanBeCreated(){

        assertNotNull(trait);
    }
    @Test
    public void questionnaireHasAQuestionTest(){
        trait.addQuestions(new Question("AorS"), new Question("AorB"), new Question("CorD"));
        Question question = null;

        for(int index = 0; index < 3; index++){
            question = trait.getQuestion();
        }

        String expected = "CorD";
        assertEquals(expected, question.getMessage());
    }

    @Test
    void shouldBeIntrovert(){
        String [] response = {"A", "B", "A", "A", "B",
                "A", "A", "B", "B", "A", "B", "A",
                "B", "B", "A", "B", "B", "A", "A", "B"};
        PersonalityTrait personalityTrait = trait.getIntrovertOrExtrovert(response);
        assertEquals(INTROVERT, personalityTrait);

        
    }

    @Test
    void shouldBeExtrovert(){
        String [] response = {"A", "B", "A", "A", "A",
                "A", "A", "A", "A", "A", "A", "A",
                "A", "B", "A", "A", "B", "A", "A", "A"};
        PersonalityTrait personalityTrait = trait.getIntrovertOrExtrovert(response);
        assertEquals(EXTROVERT, personalityTrait);

    }


    @Test
    void matchPersonalityTraitISFP(){
        String [] response = {"B", "A", "B", "A", "B",
                "A", "B", "A", "B", "B", "B", "B",
                "B", "B", "B", "B", "B", "A", "B", "B"};

        String expected = "ISFP";
        String personalityTrait = trait.getPersonalityTrait(response);
        assertEquals(expected, personalityTrait);
    }



}
