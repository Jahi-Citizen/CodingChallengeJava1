package com.codingchallenge;

public class VoteObject {

    //create upvote and downvote fields

    private int upVote; 
    private int downVote;

    //Constraint: Neither values can be negative upon initialization 
    public VoteObject(int upVote, int downVote)
    {
        if(upVote < 0 || downVote < 0){
            throw new IllegalStateException("Upvotes and downvotes cannot be negative!");
        }

        this.upVote = upVote; 
        this.downVote = downVote;
    }

    //calculate voteCount 

    public int voteCount()
    {
        return upVote - downVote;
    }

    public int getUpVote() {
        return upVote;
    }

    public void setUpVote(int upVote) {
        this.upVote = upVote;
    }

    public int getDownVote() {
        return downVote;
    }

    public void setDownVote(int downVote) {
        this.downVote = downVote;
    }

    //Retrieve upvotes and downvotes 

    
    
}
