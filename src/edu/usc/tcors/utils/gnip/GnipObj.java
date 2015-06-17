package edu.usc.tcors.utils.gnip;

public class GnipObj {

	private String id;
	private String objectType;
	
	private String postedTime;
	private String link;
	
	// activity
	private Actor actor;
	private String verb;
	private Generator generator;
	private Provider provider;
	private String body;
	private GnipObj object;
	private int favoritesCount;
	private TwitterEntities twitter_entities;
	private String twitter_filter_level;
	private String twitter_lang;
	private int retweetCount;
	private Gnip gnip;
	private int klout_score;
	private String language;
	
	// note
	private String summary;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getObjectType() {
		return objectType;
	}
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}
	public Actor getActor() {
		return actor;
	}
	public void setActor(Actor actor) {
		this.actor = actor;
	}
	public String getVerb() {
		return verb;
	}
	public void setVerb(String verb) {
		this.verb = verb;
	}
	public String getPostedTime() {
		return postedTime;
	}
	public void setPostedTime(String postedTime) {
		this.postedTime = postedTime;
	}
	public Generator getGenerator() {
		return generator;
	}
	public void setGenerator(Generator generator) {
		this.generator = generator;
	}
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public GnipObj getObject() {
		return object;
	}
	public void setObject(GnipObj object) {
		this.object = object;
	}
	public int getFavoritesCount() {
		return favoritesCount;
	}
	public void setFavoritesCount(int favoritesCount) {
		this.favoritesCount = favoritesCount;
	}
	public TwitterEntities getTwitter_entities() {
		return twitter_entities;
	}
	public void setTwitter_entities(TwitterEntities twitter_entities) {
		this.twitter_entities = twitter_entities;
	}
	public String getTwitter_filter_level() {
		return twitter_filter_level;
	}
	public void setTwitter_filter_level(String twitter_filter_level) {
		this.twitter_filter_level = twitter_filter_level;
	}
	public String getTwitter_lang() {
		return twitter_lang;
	}
	public void setTwitter_lang(String twitter_lang) {
		this.twitter_lang = twitter_lang;
	}
	public int getRetweetCount() {
		return retweetCount;
	}
	public void setRetweetCount(int retweetCount) {
		this.retweetCount = retweetCount;
	}
	public Gnip getGnip() {
		return gnip;
	}
	public void setGnip(Gnip gnip) {
		this.gnip = gnip;
	}

	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	
	
}
