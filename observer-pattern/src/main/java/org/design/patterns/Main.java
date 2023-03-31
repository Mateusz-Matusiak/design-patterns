package org.design.patterns;

import org.design.patterns.publisher.NewspaperSubscription;
import org.design.patterns.subscriber.NewspaperSubscriber;

public class Main {
    public static void main(String[] args) {

        NewspaperSubscription newspaperSubscription = new NewspaperSubscription();

        for (int i = 0; i < 10; i++) {
            new NewspaperSubscriber(newspaperSubscription);
        }

        newspaperSubscription.setNewspaperContent("Hello all subscribers!");
        newspaperSubscription.setNewspaperContent("Second message");
        newspaperSubscription.setNewspaperContent("Third message");
    }
}
