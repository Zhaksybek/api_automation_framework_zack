package day_6_api_runner_bdd_intro;

import org.junit.Test;

public class PracticeApiRunner {



    @Test
    public void test_1_methodCall(){

        APIRunnerTEMPOR.stringNameGenerator("Jake");

        int lengthOfName = APIRunnerTEMPOR.getMyCustomString().length();


        System.out.println( lengthOfName );

    }





}
