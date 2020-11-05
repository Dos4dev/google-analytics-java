package com.brsanthu.googleanalytics;

import com.brsanthu.googleanalytics.request.*;

public interface GoogleAnalytics extends AutoCloseable {

    EventHit event();

    MeasuringRefunds refundEvent();

    ExceptionHit exception();

    ItemHit item();

    PageViewHit pageView();

    PageViewHit pageView(String url, String title);

    PageViewHit pageView(String url, String title, String description);

    ScreenViewHit screenView();

    ScreenViewHit screenView(String appName, String screenName);

    SocialHit social();

    SocialHit social(String socialNetwork, String socialAction, String socialTarget);

    TimingHit timing();

    TransactionHit transaction();

    GoogleAnalyticsStats getStats();

    GoogleAnalyticsConfig getConfig();

    void ifEnabled(Runnable runnable);

    void resetStats();

    static GoogleAnalyticsBuilder builder() {
        return new GoogleAnalyticsBuilder();
    }

    void flush();
}