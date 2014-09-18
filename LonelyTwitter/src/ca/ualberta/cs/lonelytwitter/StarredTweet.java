package ca.ualberta.cs.lonelytwitter;

import java.io.Serializable;
import java.util.Date;


public class StarredTweet extends abstractTweet implements Serializable
{
	public StarredTweet(Date tweetDate, String tweetBody)
	{

		super(tweetDate, tweetBody);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "\u2605" + tweetBody;
	}

}
