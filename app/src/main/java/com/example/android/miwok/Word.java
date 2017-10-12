package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {
    private String miwokWord;
    private String translation;

    public Word(String miwokInput, String translationInput){
        miwokWord = miwokInput;
        translation = translationInput;
    }

    public String getMiwokWord(){
        return miwokWord;
    }
    public String getTranslation(){
        return translation;
    }
}