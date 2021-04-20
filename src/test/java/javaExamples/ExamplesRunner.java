package javaExamples;

public class ExamplesRunner {
    static public void main(String... args){
        /**
         * it takes the "description" from Examples Class and builds the object from that description.
         */
        Examples examples = new Examples();
        examples.visibilityOfVariables(45);
        examples.tryingToUserVar();

    }
}
