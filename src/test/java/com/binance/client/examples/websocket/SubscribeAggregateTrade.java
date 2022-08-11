package com.binance.client.examples.websocket;

import com.binance.client.SubscriptionClient;

public class SubscribeAggregateTrade {

    public static void main(String[] args) {

        SubscriptionClient client = SubscriptionClient.create();
   
        client.subscribeAggregateTradeEvent("adausdt", ((event) -> {
            System.out.println(event);
            client.unsubscribeAll();
        }), null);

    }

}
