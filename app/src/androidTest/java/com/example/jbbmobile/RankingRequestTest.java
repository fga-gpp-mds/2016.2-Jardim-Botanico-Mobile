package com.example.jbbmobile;

import com.example.jbbmobile.dao.RankingRequest;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by renata on 19/10/16.
 */
public class RankingRequestTest {

    @Test
    public void testIfRequestIsCreated(){
        RankingRequest rankingRequest = new RankingRequest("nickname");
        assertEquals("nickname", rankingRequest.getNickname());
    }

}