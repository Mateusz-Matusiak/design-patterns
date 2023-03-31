package org.design.patterns.publisher;

import org.design.patterns.subscriber.Subscriber;

import java.util.HashSet;
import java.util.Set;

public class NewspaperSubscription implements Publisher{

    private final Set<Subscriber> subscribers;
    private String newspaperContent;


    public NewspaperSubscription() {
        this.subscribers = new HashSet<>();
    }

    @Override
    public void registerSubscriber(Subscriber newSubscriber) {
        subscribers.add(newSubscriber);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(Subscriber::update);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void setNewspaperContent(String newspaperContent) {
        this.newspaperContent = newspaperContent;
        notifySubscribers();
    }

    public String getNewspaperContent() {
        return newspaperContent;
    }
}
