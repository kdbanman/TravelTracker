package cmput301w15t07.TravelTracker.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/*
 *   Copyright 2015 Kirby Banman,
 *                  Stuart Bildfell,
 *                  Elliot Colp,
 *                  Christian Ellinger,
 *                  Braedy Kuzma,
 *                  Ryan Thornhill
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/**
 * Model object for Claim made by Users acting as Claimants.
 * 
 * @author kdbanman
 *
 */
public class Claim extends Document {
	private UUID user;
	private String name;
	private Status status;
	private Date startDate;
	private Date endDate;
	private ArrayList<Destination> destinations;
	private ArrayList<Item> items;
	private ArrayList<ApproverComment> comments;
	private ArrayList<UUID> tags;
	
	/**
	 * Package protected constructor, intended for use only by DataSource.
	 * 
	 * @param docID UUID document identifier
	 */
	Claim(UUID docID) {
		super(docID);
		destinations = new ArrayList<Destination>();
		comments = new ArrayList<ApproverComment>();
	}
	
	public UUID getUser() {
		return this.user;
	}
	public void setUser(UUID user) {
		this.user = user;
		this.updateObservers(this);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		this.updateObservers(this);
	}
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
		this.updateObservers(this);
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
		this.updateObservers(this);
	}
	
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
		this.updateObservers(this);
	}
	
	public ArrayList<Destination> getDestinations() {
		return destinations;
	}
	public void setDestinations(ArrayList<Destination> destinations) {
		this.destinations = destinations;
		this.updateObservers(this);
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
		this.updateObservers(this);
	}
	
	public ArrayList<ApproverComment> getComments() {
		return comments;
	}
	public void setComments(ArrayList<ApproverComment> comments) {
		this.comments = comments;
		this.updateObservers(this);
	}
	
	public ArrayList<UUID> getTags() {
		return this.tags;
	}
	public void setTags(ArrayList<UUID> tags) {
		this.tags = tags;
		this.updateObservers(this);
	}
	
}
