package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    private static List<QuestionList> scienceQuestion (){

        final  List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList question1 = new QuestionList("How many bones are in the human body?", "232", "543","321", "206", "206", "");
        final QuestionList question2 = new QuestionList("Which is the main gas that makes up the Earth's atmosphere?", "Oxygen", "Nitrogen","Carbon Dioxide", "Argon", "Nitrogen", "");
        final QuestionList question3 = new QuestionList("Humans and chimpanzees share roughly how much DNA?", "15.7%", "69.3%","98.8%", "54.8%", "98.8%", "");
        final QuestionList question4 = new QuestionList("The concept of gravity was discovered by which famous physicist?", "Leornado Da Vinci", "Albert Einstin","Vasco Da Gama", "Issac Newton", "Issac Newton", "");
        final QuestionList question5 = new QuestionList("What is the hardest natural substance on Earth?", "Emerald", "Diamond","Saphire", "Gold", "Diamond", "");
        final QuestionList question6 = new QuestionList("Which of the following is used in pencils?", "Graphite", "Silicon","Charcoal", "Phosphurus", "Graphite", "");
        final QuestionList question7 = new QuestionList("What is the name of the element with the chemical symbol “HE”??", "Hydroxide", "Hydrogen ","Helium", "Phosphurus", "Helium", "");

        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);
        questionLists.add(question7);


        return questionLists;
    }

    private static List<QuestionList> technologyQuestion (){

        final List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList question1 = new QuestionList("When was the first iPhone released?", "2005", "2006","2012", "2007", "2007", "");
        final QuestionList question2 = new QuestionList("What is the first ever computer ever released?", "EAICSA", "ENISE","ENIAC", "QENTA", "ENIAC", "");
        final QuestionList question3 = new QuestionList("Who is the CEO of Apple", "Steve Jobs", "Tom Holland","Tim Cook", "Timothy James", "Tim Cook", "");
        final QuestionList question4 = new QuestionList("What is the first phone Called?", "DYNATac 8000x", "Nokia 1011","StarTAC", "Nokia 8100", "DYNATac 8000x", "");
        final QuestionList question5 = new QuestionList("Which is not the correct programming Language", "java", "C#","syntax", "C++", "syntax", "");
        final QuestionList question6 = new QuestionList("What does OS stand for?", "Optical Sensor", "Operating system","Order of Significance", "Open Software", "Operating system", "");


        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);

        return questionLists;
    }

    private static List<QuestionList> mathematicsQuestion(){

        final List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList question1 = new QuestionList("x+34=45", "15","11","34","21","11","");
        final QuestionList question2 = new QuestionList("Speed of car is 50km/hr, it took them 50 mins, find the distance", "43km", "60km","32km", "67km", "60", "");
        final QuestionList question3 = new QuestionList("3x+14=60", "46/3", "54/6","32/9", "38/4", "46/3", "");
        final QuestionList question4 = new QuestionList("What is the sum of 130+125+191?", "335", "456","446", "", "", "");
        final QuestionList question5 = new QuestionList("50 times of 8 is equal to?", "110", "550","400", "1500", "400", "");
        final QuestionList question6 = new QuestionList("Solve: 300 – (150×2)", "150", "300","0", "500", "0", "");

        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);
        return questionLists;
    }

    private static List<QuestionList> engineerQuestion(){


        final List<QuestionList> questionLists = new ArrayList<>();
        final QuestionList question1 = new QuestionList("The National Engineers day was celebrated at", "1998", "1978","1968", "1958", "1968", "");
        final QuestionList question2 = new QuestionList("What remains constant during a steady-flow process?", "Mass", "Energy content of the control volume","Temperature", "Mass and energy content of the control volume", "Mass and energy content of the control volume", "");
        final QuestionList question3 = new QuestionList(" Which of these elements deals with the geometry of motion? ", "Kinematics", "Static","Dynamics", "Kinetics", "Kinematics", "");
        final QuestionList question4 = new QuestionList("Which of these deals with the forces required to produced motion", "Static", "Potential","Kinetics", "Dynamic", "Kinetics", "");
        final QuestionList question5 = new QuestionList("What is the force of attraction on a body?", "Weight", "Mass","Density", "Number", "Weight", "");
        final QuestionList question6 = new QuestionList("Sublimation is direct change from ", "Liquid to gas phase","Solid to gaseous phase", "Gas to liquid phase", "Liquid to solid phase", "Solid to gaseous phase", "");

        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);
        return questionLists;
    }

    public static List<QuestionList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "Science":
                return scienceQuestion();
            case "Technology":
                return technologyQuestion();
            case "Mathematics":
                return mathematicsQuestion();
            default:
                return engineerQuestion();

        }


    }

}
