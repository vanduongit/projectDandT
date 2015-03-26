/**
 * 
 */
package com.dtweb.model;

/**
 * @author ThongNguyen
 *
 */
public class Category {
	
	private int id;
	private String tag;
	private String name;
	private String content;
	private int level;
	private int prority;
	private int index;
	private String image;
	private String title;
	private String description;
	private String keyword;
	private int active;
	private int ord;
	private String lang;
	private String image2;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}
	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	/**
	 * @return the prority
	 */
	public int getPrority() {
		return prority;
	}
	/**
	 * @param prority the prority to set
	 */
	public void setPrority(int prority) {
		this.prority = prority;
	}
	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the keyword
	 */
	public String getKeyword() {
		return keyword;
	}
	/**
	 * @param keyword the keyword to set
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	/**
	 * @return the active
	 */
	public int getActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(int active) {
		this.active = active;
	}
	/**
	 * @return the ord
	 */
	public int getOrd() {
		return ord;
	}
	/**
	 * @param ord the ord to set
	 */
	public void setOrd(int ord) {
		this.ord = ord;
	}
	/**
	 * @return the lang
	 */
	public String getLang() {
		return lang;
	}
	/**
	 * @param lang the lang to set
	 */
	public void setLang(String lang) {
		this.lang = lang;
	}
	/**
	 * @return the image2
	 */
	public String getImage2() {
		return image2;
	}
	/**
	 * @param image2 the image2 to set
	 */
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public Category(int id, String tag, String name, String content, int level,
			int prority, int index, String image, String title,
			String description, String keyword, int active, int ord,
			String lang, String image2) {		
		this.id = id;
		this.tag = tag;
		this.name = name;
		this.content = content;
		this.level = level;
		this.prority = prority;
		this.index = index;
		this.image = image;
		this.title = title;
		this.description = description;
		this.keyword = keyword;
		this.active = active;
		this.ord = ord;
		this.lang = lang;
		this.image2 = image2;
	}
	
	public Category(String tag, String name, String content, int level,
			int prority, int index, String image, String title,
			String description, String keyword, int active, int ord,
			String lang, String image2) {		
		this.tag = tag;
		this.name = name;
		this.content = content;
		this.level = level;
		this.prority = prority;
		this.index = index;
		this.image = image;
		this.title = title;
		this.description = description;
		this.keyword = keyword;
		this.active = active;
		this.ord = ord;
		this.lang = lang;
		this.image2 = image2;
	}
	
	
	
	

}
