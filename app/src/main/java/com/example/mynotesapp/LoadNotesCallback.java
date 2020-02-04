package com.example.mynotesapp;

import java.util.ArrayList;

interface LoadNotesCallback {
    void preExecute();

    void postExecute(ArrayList<Note> notes);
}
