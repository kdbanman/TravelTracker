package cmput301w15t07.TravelTracker.model;

import java.util.ArrayList;
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
 * Model object for Users.
 * 
 * @author kdbanman
 *
 */
public class User extends Document {
	private String userName;
	private ArrayList<Tag> tags;
	
	/**
	 * Package protected constructor, intended for use only by DataSource.
	 * 
	 * @param docID UUID document identifier
	 */
	User(UUID docID) {
		super(docID);
	}

	/**
	 * Get the user's name.
	 * @return The user's name.
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Set the user's name.
	 * @param userName The user's name.
	 */
	public void setUserName(String userName) {
		this.userName = userName;
		
		updateObservers(this);
	}
	
	// TODO: Remove these!
	public ArrayList<Tag> getTags() {
		return tags;
	}
	public void setTags(ArrayList<Tag> tags) {
		this.tags = tags;
		this.updateObservers(this);
	}
}
