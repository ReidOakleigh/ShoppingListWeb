package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Rumbi Chinhamhora rchinhamhora
 * CIS 175 - Spring 2021
 * Feb 22, 2021
 */
@Entity
@Table(name="items")
public class ListItem  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="STORE")
	private String store;
	@Column(name="ITEM")
	private String item;
	
	public ListItem(){
		super();
	}
	
	public ListItem(String store, String item){
		super();
		this.store = store;
		this.item = item;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String returnItemDetails( ) {
		return store + ": " + item;
	}
	
	@Override
	public String toString() {
		return store + ": " + item;
	}
}
