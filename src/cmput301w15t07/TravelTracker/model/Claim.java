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
 * @author kdbanman, braedy
 *
 */
public class Claim extends Document {
	private UUID user;
	private UUID approver;
	private Status status;
	private Date startDate;
	private Date endDate;
	private ArrayList<Destination> destinations;
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
		tags = new ArrayList<UUID>();
		startDate = new Date();
		endDate = new Date();
		status = Status.IN_PROGRESS;
	}
	
	/**
	 * Get the user who created this claim.
	 * @return The user's UUID.
	 */
	public UUID getUser() {
		return this.user;
	}
	
	/**
	 * Set the user who created this claim.
	 * @param user The user's UUID.
	 */
	public void setUser(UUID user) {
		this.user = user;
		this.updateObservers(this);
	}
	
	/**
	 * Get the approver who first approved/returned this claim.
	 * @return The approver's UUID, or null if no approver.
	 */
	public UUID getApprover() {
		return this.approver;
	}
	
	/**
	 * Get the approver who first approved/returned this claim.
	 * @param approver The approver's UUID.
	 */
	public void setApprover(UUID approver) {
		this.approver = approver;
		this.updateObservers(this);
	}
	
	/**
	 * Get the claim's status.
	 * @return The status.
	 */
	public Status getStatus() {
		return status;
	}
	
	/**
	 * Set the claim's status.
	 * @param status The status.
	 */
	public void setStatus(Status status) {
		this.status = status;
		this.updateObservers(this);
	}

	/**
	 * Get the claim's start date.
	 * @return The start date.
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Set the claim's start date.
	 * @param startDate The start date.
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
		this.updateObservers(this);
	}

	/**
	 * Get the claim's end date.
	 * @return The end date.
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Set the claim's end date.
	 * @param endDate The end date.
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
		this.updateObservers(this);
	}

	/**
	 * Get the list of destinations.
	 * @return The list of destinations.
	 */
	public ArrayList<Destination> getDestinations() {
		return destinations;
	}

	/**
	 * Set the list of destinations.
	 * Note that this should be called rather than directly editing
	 * the result of getDestinations() so that observers are notified.
	 * 
	 * @param destinations The list of destinations.
	 */
	public void setDestinations(ArrayList<Destination> destinations) {
		this.destinations = destinations;
		this.updateObservers(this);
	}

	/**
	 * Get the list of approver comments.
	 * @return The list of approver comments.
	 */
	public ArrayList<ApproverComment> getComments() {
		return comments;
	}

	/**
	 * Set the list of approver comments.
	 * Note that this should be called rather than directly editing
	 * the result of getComments() so that observers are notified.
	 * 
	 * @param comments The list of comments.
	 */
	public void setComments(ArrayList<ApproverComment> comments) {
		this.comments = comments;
		this.updateObservers(this);
	}
	
	/**
	 * Add a premade comment to the claim.
	 * @param comment The comment to add.
	 */
	public void addComment(ApproverComment comment) {
		this.comments.add(comment);
	}
	
	/**
	 * Add a comment to the claim with today's date.
	 * @param commentText The comment's text.
	 */
	public void addComment(String commentText) {
		this.comments.add(new ApproverComment(commentText, new Date()));
	}

	/**
	 * Get the list of tags.
	 * @return The list of tags.
	 */
	public ArrayList<UUID> getTags() {
		return this.tags;
	}

	/**
	 * Set the list of tags.
	 * Note that this should be called rather than directly editing
	 * the result of getTags() so that observers are notified.
	 * 
	 * @param tags The list of tags.
	 */
	public void setTags(ArrayList<UUID> tags) {
		this.tags = tags;
		this.updateObservers(this);
	}
	
}
