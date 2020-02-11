package com.example.consumerapp;

import java.util.ArrayList;

interface LoadNotesCallback {
    void preExecute();

    void postExecute(ArrayList<Note> notes);
}
