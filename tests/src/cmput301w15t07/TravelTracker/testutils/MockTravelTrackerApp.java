package cmput301w15t07.TravelTracker.testutils;

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

import android.test.mock.MockApplication;
import cmput301w15t07.TravelTracker.DataSourceSingleton;
import cmput301w15t07.TravelTracker.model.DataSource;
import cmput301w15t07.TravelTracker.model.InMemoryDataSource;

/**
 * A mock application for testing TravelTracker which allows a custom
 * DataSource to be injected.
 * 
 * @author colp
 *
 */
public class MockTravelTrackerApp extends MockApplication implements
        DataSourceSingleton {
	
    private DataSource ds;
    
    public DataSource getDataSource() {
    	return ds;
    }
    
    /**
     * Create the app using the default InMemoryDataSource.
     */
    @Override
    public void onCreate() {
    	ds = new InMemoryDataSource();
    }
    
    /**
     * Create the app with the given DataSource.
     * @param ds The DataSource to use.
     */
    public void onCreate(DataSource ds) {
    	this.ds = ds;
    }
}