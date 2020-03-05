/*
 * Copyright (c) Studioso Inc if you are in positon of this material with proper explicit permissions for Studioso Inc then you must destroy this property on your machine
 */

package com.studiosoapps.icdispatch;

import java.util.concurrent.BlockingQueue;

public class ICForkJoinQueue extends ICConCurrentQueue {

    public ICForkJoinQueue(BlockingQueue<ICBlock> queue, int maxThreads) {
        super(queue, maxThreads);
    }


}
