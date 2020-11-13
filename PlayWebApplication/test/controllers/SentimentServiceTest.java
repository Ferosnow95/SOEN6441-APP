package controllers;

import org.junit.Test;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.test.WithApplication;
import service.SentimentService;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class SentimentServiceTest extends WithApplication {

    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }


	
	final List<String> happyList = Arrays.asList(
			"I admire when it comes to composing songs",
			"@realDonaldTrump At what?  Boy dude, you over country is definitely a theme you stick to!  Would say I admire your determination but it always appears to be when it is for you and no one else.  Please fade away to a game show host again.",
			"RT @goelgauravbjp: Since my young days I admire Shiv Sena for standing up for the Hindu cause",
			"@SayHello2Joch @hales_devon We admire your dedication! ? But just so you know, you can listen on any podcast app (stitcher, overcast, etc), or Spotify, or even just on any browser! We just post the Apple link because it’s usually one of the top platforms ?",
			"I admire this mom I've seen, waiting in her car for her daughter, book propped up on the steering wheel, totally engrossed.  She'd flip it closed when she saw her daughter.",
			"RT @yungblackinese: I’ll always admire a persons honesty! All you have to do is give it ?"
			
			);
 
	final List<String> sadList = Arrays.asList(
			"@Vivien3Daggers I genuinely think this is like analytics/engagement trolling to make her seem more influential on social media. There's no way this isn't a calculated attempt to annoy people for clicks and replies.",
			"@shanesaysthat Hadnt heard about that. Havent listened to any radio show in years. They just annoy me.",
			"Do i tweet too much i dont wanna annoy people also i cant remember if anyone responded last time i asked this and i dont wanna find the tweet",
			"2 if I love u 3 if I feel awkward 4 to annoy u and 5 when I’m lazy or sleepy",
			"RT @ElsaAngel19: People who disrespect their parents for absolutely no reason really really REALLY annoy me",
			"@mygkgs i know, and i told them multiple times that the 300 daily vocal messages annoy me and i wont reply to them anymore but somehow when i dont reply for ONE (1) day they still come around as if im abnornal and me not replying = im sad and desperately need their help??? it's annoying"
			
			);
	
	final List<String> nuetralList = Arrays.asList(
			"WNBA Boston members - remember virtual TRIVIA night sign-ups close at noon tomorrow (Wed-11/11).",
			"It's really hard to name a single historical place that appeals to me above all others, but the city of Boston is a really really strong contender. From Bunker Hill to the U.S.S. Constitution, historically speaking, it feels like Philadelphia on steroids. #YLTTakeover https://t.co/vMpbzCkOBD",
			"RT @missionhillpads: Mission Hill 3 Bed 1 Bath BOSTON Boston - $2,100: Virtual Tour Available!!!!! NO FEE!",
			"NBC Sports Boston: New York tabloids had great reactions to Jets' 'choke' vs. Patriots - https://t.co/72plhDfHdt",
			"Boston College will be wearing their Red Bandana uniforms this weekend against #2 Notre Dame",
			"Australian Women with Boston Scientific mesh implants, please PM me through messenger for an update.?Xo Possum"
			
			);


	
	@Test
	public void happyTest() throws Exception {
		String expected = "happy";
		String theSentiment = new SentimentService( happyList).ProcessTweet();
		assertEquals(expected, theSentiment);
	}
	
	@Test
	public void sadTest() throws Exception {
		String expected = "sad";
		String theSentiment = new SentimentService( sadList).ProcessTweet();
		assertEquals(expected, theSentiment);
	}
	 
	
	@Test
	public void nuetralTest() throws Exception {
		String expected = "neutral";
		String theSentiment = new SentimentService( nuetralList).ProcessTweet();
		assertEquals(expected, theSentiment);
	}


}
