package org.design.patterns.subscriber;

import lombok.extern.slf4j.Slf4j;
import org.design.patterns.publisher.NewspaperSubscription;

@Slf4j
public class NewspaperSubscriber implements Subscriber {

    private static int idCounter = 0;
    private final NewspaperSubscription newspaperSubscription;
    private final int subscriberId;

    public NewspaperSubscriber(NewspaperSubscription newspaperSubscription) {
        this.newspaperSubscription = newspaperSubscription;
        newspaperSubscription.registerSubscriber(this);
        subscriberId = ++idCounter;
    }

    @Override
    public void update() {
        log.info(String.format("%4d subscriber has received newspaper's message: %s", subscriberId, newspaperSubscription.getNewspaperContent()));
    }
}
