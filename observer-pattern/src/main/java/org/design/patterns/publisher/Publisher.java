package org.design.patterns.publisher;

import org.design.patterns.subscriber.Subscriber;

public interface Publisher {
    void registerSubscriber(Subscriber newSubscriber);
    void notifySubscribers();
    void removeSubscriber(Subscriber subscriber);
}
