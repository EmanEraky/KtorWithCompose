package com.example.ktorview.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/ktorview/utils/ProgressState;", "", "()V", "Idle", "Progress", "Lcom/example/ktorview/utils/ProgressState$Progress;", "Lcom/example/ktorview/utils/ProgressState$Idle;", "app_debug"})
public abstract class ProgressState {
    
    private ProgressState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/ktorview/utils/ProgressState$Progress;", "Lcom/example/ktorview/utils/ProgressState;", "()V", "app_debug"})
    public static final class Progress extends com.example.ktorview.utils.ProgressState {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.ktorview.utils.ProgressState.Progress INSTANCE = null;
        
        private Progress() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/ktorview/utils/ProgressState$Idle;", "Lcom/example/ktorview/utils/ProgressState;", "()V", "app_debug"})
    public static final class Idle extends com.example.ktorview.utils.ProgressState {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.ktorview.utils.ProgressState.Idle INSTANCE = null;
        
        private Idle() {
            super();
        }
    }
}