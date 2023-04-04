package com.codingchallenge;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(new VoteObject(20, 14).voteCount());
        System.out.println(new VoteObject(2, 47).voteCount());
        VoteObject stancysPost = new VoteObject(20, 10);
        
        System.out.println(stancysPost.getUpVote());
        System.out.println(stancysPost.getDownVote());
    }
}
