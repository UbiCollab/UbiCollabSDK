/**
 * Copyright (c) 2011, SOCIETIES Consortium (WATERFORD INSTITUTE OF TECHNOLOGY (TSSG), HERIOT-WATT UNIVERSITY (HWU), SOLUTA.NET 
 * (SN), GERMAN AEROSPACE CENTRE (Deutsches Zentrum fuer Luft- und Raumfahrt e.V.) (DLR), Zavod za varnostne tehnologije
 * informacijske družbe in elektronsko poslovanje (SETCCE), INSTITUTE OF COMMUNICATION AND COMPUTER SYSTEMS (ICCS), LAKE
 * COMMUNICATIONS (LAKE), INTEL PERFORMANCE LEARNING SOLUTIONS LTD (INTEL), PORTUGAL TELECOM INOVAÇÃO, SA (PTIN), IBM Corp., 
 * INSTITUT TELECOM (ITSUD), AMITEC DIACHYTI EFYIA PLIROFORIKI KAI EPIKINONIES ETERIA PERIORISMENIS EFTHINIS (AMITEC), TELECOM 
 * ITALIA S.p.a.(TI),  TRIALOG (TRIALOG), Stiftelsen SINTEF (SINTEF), NEC EUROPE LTD (NEC))
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following
 * conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following
 *    disclaimer in the documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT 
 * SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.societies.android.api.cis;

import android.net.Uri;


/**
 * <h1>Class SocialContract</h1>
 * Provides utility constant values for using SocialProvider.<br /><br /> 
 * 
 * Please read information about how to use content providers in Android 
 * in order to learn how to use this contract. You can start by
 * going into <a href="http://developer.android.com/guide/topics/providers/content-providers.html" target="_blank">this page</a> 
 * at Android developers site.
 * <br /><br /> 
 * 
 * Note that this contract is currently the only documentation
 * of {@link SocialProvider} on Android.
 * 
 * @author Babak dot Farshchian at sintef dot no
 *
 */
public final class SocialContract {

	/**
	 * The base URI used when calling SocialProvider.<br />
	 * <br />
	 * 
	 *  You can use {@link AUTHORITY_STRING} with a field in {@link UriPathIndex}
	 *   in order to build a URI for your queries to {@link SocialProvider}, e.g.:
	 *   <br /><br />
	 *  <code>query(Uri.parse(SocialContract.AUTHORITY_STRING+SocialContract.UriPathIndex.ME),....)</code>
	 */
	public static final String AUTHORITY_STRING = "content://org.societies.android.SocialProvider/";
	
    /**
     * The main authority, i.e. the base URI for all operations:
     */
    public static final Uri AUTHORITY = 
            Uri.parse("content://org.societies.android.SocialProvider");
    
    /**
     * Constants used to define read and write permissions for social data:
     */
    public static final String PROVIDER_READ_PERMISSION = "org.societies.android.SocialProvider.READ";
    public static final String PROVIDER_WRITE_PERMISSION = "org.societies.android.SocialProvider.WRITE";
    
    
    /**
     * A utility class defining constants for the different 
	 * paths that are supported by the SocialProvider.<br />
	 * <br />
	 * When you are calling content provider methods, use AUTHORITY_STRING
	 * plus one of the paths in this class so your code is protected
	 * against errors in paths and URIs, e.g.:<br />
	 * <br />
	 *  <code>query(Uri.parse(SocialContract.AUTHORITY_STRING+ SocialContract.UriPathIndex.ME),....)</code>
	 * <br />
	 * 
	 * @author Babak dot Farshchian at sintef dot no
	 *
	 */
	public static final class UriPathIndex{
		
		/**
		 * Path segment for searching for all my identities/user profiles.
		 */
		public static final String ME = "me";
		/**
		 * Same as me, replace # with the _ID of the identity/profile to
		 * get the exact identity/profile.
		 */
		public static final String ME_SHARP = "me/#";
		public static final String PEOPLE = "people";
		public static final String PEOPLE_SHARP = "people/#";
		public static final String COMMUNITIES = "communities";
		public static final String COMMUNITIES_SHARP = "communities/#";
		public static final String SERVICES = "services";
		public static final String SERVICES_SHARP = "services/#";
		public static final String RELATIONSHIP = "relationship";
		public static final String RELATIONSHIP_SHARP = "relationship/#";
		public static final String MEMBERSHIP = "membership";
		public static final String MEMBERSHIP_SHARP = "membership/#";
		public static final String SHARING = "sharing";
		public static final String SHARING_SHARP = "sharing/#";
		public static final String PEOPLE_ACTIVITIY = "people/activity";
		public static final String PEOPLE_ACTIVITIY_SHARP = "people/activity/#";
		public static final String COMMUNITY_ACTIVITIY = "communities/activity";
		public static final String COMMUNITY_ACTIVITIY_SHARP = "communities/activity/#";
		public static final String SERVICE_ACTIVITY = "services/activity";
		public static final String SERVICE_ACTIVITY_SHARP = "services/activity/#";
	}

	/**
	 * <h1>Class overview</h1> 
	 * Constants and helpers for operating on people.<br />
	 * <br />
	 * This is the URI you will use for accessing information about people.
	 * Every person who is accessible from {@link SocialProvider} and is
	 * considered to be of interest to the user has an
	 * entry in this table. You can search for people using global_id, 
	 * name etc.
	 * <br />
	 * You can find information about both of the following:
	 * <ul>
	 * <li>People you have a relationship to. This means both of you use 
	 * some common service (e.g. Facebook) and have decided to be e.g.
	 * friends or followers etc.</li>
	 * <li>People you don't have a relationship to but want to keep
	 * informed about. This might be Obama or your neighbor. The information
	 * about this type of people will not be verifiable and will probably
	 * be very inaccurate.</li>
	 * </ul>
	 * For people to whom you have a relationship with (e.g. Facebook friends)
	 * there will exist a verifiable global_id set by SyncAdapters only. For
	 * all other people global_id will be set to "Pending". Depending on the 
	 * ORIGIN field value (which might e.g. be "Facebook") a synch adapter 
	 * might pick up a record with "Pending" global_id and update the record
	 * to friend status by updating the global_id.
	 * 
	 * <h1>Insert</h1> 
	 * Applications can insert people by providing the following:
	 * <ul>
	 * <li>{@link NAME}
	 * <li>{@link DESCRIPTION} (Optional)
	 * <li>{@link EMAIL} (Optional)
	 * <li>{@link ORIGIN}
	 * </ul>
	 * Note that it is important to provide the ORIGIN so that Syncing with
	 * services can update a new people record to a real person if this is 
	 * needed. The value of the ORIGIN field depends on the target SyncAdapter.
	 * It might for instance be "Facebook". See proper SyncAdapter documentation.
	 * <br />
	 * If ORIGIN is set to "private" the newly created person
	 * will not be updated by SyncAdapters. This can be used for building
	 * a private address book within People part of SocialProvider.
	 * <br /> 
	 * SyncAdapters will not insert or delete people, they will only update.
	 * 
	 * <h1>Update</h1> 
	 * Applications can update:
	 * <ul>
	 * <li>{@link NAME}
	 * <li>{@link DESCRIPTION}
	 * <li>{@link EMAIL}
	 * <li>{@link ORIGIN}
	 * </ul>
	 * 
	 * Pay attention to ORIGIN.<br />
	 * 
	 * As long as ORIGIN is "private" the record will not be Synced. This for 
	 * instance means that by changing the ORIGIN field from "private" to e.g.
	 * "Facebook" the application can connect an existing private record to a
	 * friend of this user on Facebook. Or the opposite, changing origin 
	 * from "Facebook" to "private you can disconnect a record from a service.
	 * 
	 * SyncAdapters can update:
	 * <ul>
	 * <li>{@link GLOBAL_ID}
	 * <li>{@link NAME}
	 * <li>{@link EMAIL}
	 * </ul>
	 * SyncAdapters will only update people whose ORIGIN corresponds to the
	 * adapter. GLOBAL_ID will be updated in cases where ORIGIN is set to
	 * non-private and GLOBAL_ID is "Pending". Or when SyncAdapter discovers
	 * that the corresponding GLOBAL_ID does not exist anymore (e.g. a 
	 * Facebook user is deleted).
	 * 
	 * <h1>Delete</h1>
	 * Applications can delete people.<br />
	 * If a record with ORIGIN="Private" is deleted it will be deleted
	 * permanently. Otherwise deletion is marked and later handled by
	 * the proper SyncAdapter.
	 * <br />
	 * SyncAdapters can delete people that have ORIGIN set to the 
	 * adapter and that is already marked for deletion by the user.
	 * 
	 * <h1>Query</h1>
	 * Applications can query for people using standard query URI or using _ID as
	 * the last part of the URI.
	 * 
	 * 
	 * @author Babak dot Farshchian at sintef dot no
	 */
    public static final class People {
        /**
         * The Uri to access the base table with all people.
         */
        public static final Uri CONTENT_URI = 
                    Uri.parse(AUTHORITY_STRING+ UriPathIndex.PEOPLE);
        /**
         *  Key local ID, used by content provider to denote the location of this
         *  person in the table. Row number.
         *  
         *  Read-only
         */
        public static final String _ID = "_id";
        /**
         * ID which globally identifies this person. 
         * 
         * Mandatory.
         * Read-only.
         * 
         */
        public static final String GLOBAL_ID = "global_id";
        /**
         * Name of the person. Mandatory.
         */
        public static final String NAME = "name";
        /**
		 * A description of the user. This is set locally.
		 * Should not be synchronized.
		 */
		public static final String DESCRIPTION = "description";
		/**
         * Email address of the person. Optional.
         */
        public static final String EMAIL = "email";
        /**
		 * Set by Sync adapter, telling the user where this person is 
		 * synchronized from.
		 * 
		 * Can for instance be Facebook (if this is a Facebook contact)
		 * or SOCIETIES etc.
		 */
		public static final String ORIGIN = "origin";
		/**
         * The date this record was created by its origin.
         */
        public static final String CREATION_DATE = "creation_date";
        
        /**
         * The date this record was last modified. Used by sync adapters.
         */
        public static final String LAST_MODIFIED_DATE = "last_modified_date";

        /**
         * Field used by sync adapters when synchronizing with cloud 
         * services.
         */
        public static final String SYNC_STATUS = "sync_status";
        
    }
    
    /**
     * <h1>Class Communities</h1>
	 * <h1>Class overview</h1> 
	 * Constants and helpers for operating on communities.<br />
	 * <br />
	 * This is the URI you will use for accessing information about communities.
	 * Every community which is accessible from {@link SocialProvider} has an
	 * entry in this table. You can search for communities using GLOBAL_ID, name etc.
	 * You can find information about both of the following:
	 * <ul>
	 * <li>Communities you are a member of or own.</li>
	 * <li>All other communities that are registered in directories.</li>
	 * </ul>
	 * 
	 * You might have different levels of information for the different
	 * types of communities.
	 * 
	 * <h1>Insert</h1> 
	 * Applications can insert communities that will be confirmed
	 * by SyncAdapters. While confirmation pending,
	 *  {@link GLOBAL_ID} will be "pending".
	 *  
	 * Applications will have to provide the following
	 * parameters in when inserting:
	 * <ul>
	 * <li>{@link NAME}
	 * <li>{@link OWNER_ID}
	 * <li>{@link TYPE}
	 * <li>{@link DESCRIPTION} (optional, will be set to "na" if not provided)
	 * <li>{@link ORIGIN}
	 * </ul>
	 * 
	 * When an application inserts a community, {@link GLOBAL_ID} will be
	 * set to "pending" by {@link SocialProvider}. This has to be changed
	 * by a SyncAdapter upon next successful synchronization. The sync
	 * adapter then has to write the correct global_id. While a community
	 * is pending it will not accept membership or sharing of services.
	 * 
	 * {@link ORIGIN} should be set a name that is recognizable by
	 * the appropriate SyncAdapter. E.g. a Facebook SyncAdapter 
	 * will read only those communities that have ORIGIN set to "Facebook". 
	 * 
	 * SyncAdapters cannot insert new communities.
	 * 
	 * <h1>Update</h1> 
	 * Applications can update:
	 * <ul>
	 * <li>{@link NAME}
	 * <li>{@link TYPE}
	 * <li>{@link DESCRIPTION}
	 * </ul>
	 * 
	 * SyncAdapters can update:
	 * <ul>
	 * <li>{@link NAME}
	 * <li>{@link TYPE}
	 * <li>{@link DESCRIPTION}
	 * </ul>
	 * 
	 * <h1>Delete</h1>
	 * Applications can delete communities. Only communities that belong to
	 * the logged-in user can be deleted. When a community is deleted by 
	 * an application it is only marked as deleted. It is then deleted
	 * by the SyncAdapter, which also deletes all the memberships and 
	 * sharings.
	 * <br />
	 * SyncAdapters can only delete communities that are marked for
	 * deletion. Deleting a community by a SyncAdapter will also delete 
	 * all the memberships and sharings for that community.
	 * 
	 * <h1>Query</h1>
	 * Applications and SyncAdapters can query for communities using standard
	 * query URI or using _ID as the last part of the URI.
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class Communities {
        /**
         * The Uri to access the base table with all communities. 
         */
        public static final Uri CONTENT_URI = 
                    Uri.parse(AUTHORITY_STRING+ UriPathIndex.COMMUNITIES);
        /**
         * Key local ID. Used by content provider as an index to the DB
         * table.
         */
        public static final String _ID = "_id"; 
        /**
         *  Global ID for the community, e.g. JID or URI.
         */
        public static final String GLOBAL_ID = "global_id";
        /**
		 *  Name of the community. Is user-given.
		 */
		public static final String NAME = "name";
		/**
		 * Global ID of the person who owns this community.
		 */
		public static final String OWNER_ID = "owner_id";
		/**
         *  The type of the community being stored. E.g. "disaster".
         *  The type will be defined and used by applications.
         */
        public static final String TYPE = "type";
        /**
		 * A user-provided description of the community.
		 */
		public static final String DESCRIPTION = "description";
		/**
         * Set by user or Sync adapter, telling the user where this community
         * is originating from. Can for instance be Facebook (if this is a 
         * Facebook group) or SOCIETIES etc.
         */
        public static final String ORIGIN = "origin";
        /**
         * The date this record was created by its origin.
         */
        public static final String CREATION_DATE = "creation_date";
        
        /**
         * The date this record was last modified. Used by sync adapters.
         */
        public static final String LAST_MODIFIED_DATE = "last_modified_date";

        /**
         * Field used by sync adapters when synchronizing with cloud 
         * services. Its value can be "dirty", "clean", "new", "deleted".
         */
        public static final String SYNC_STATUS = "sync_status";
        
    }
    
   /**
	 * <h1>Class overview</h1> 
	 * Constants and helpers for operating on services.<br />
	 * <br />
	 * This is the URI you will use for accessing information about services.
	 * Every service which is accessible from {@link SocialProvider} has an
	 * entry in this table. You can search for services using GLOBAL_ID, name etc.
	 * You can find information about both of the following:
	 * <ul>
	 * <li>Services you own.</li>
	 * <li>Other services, e.g. in a service market place.</li>
	 * </ul>
	 * 
	 * You might have different levels of information for the different
	 * types of services.
	 * 
	 * <h1>Insert</h1> 
	 * Applications can insert services. Applications will have to provide the following
	 * parameters in when inserting services:
	 * <ul>
	 * <li>{@link NAME}
	 * <li>{@link OWNER_ID}
	 * <li>{@link TYPE}
	 * <li>{@link DESCRIPTION} (optional, set to "NA" if not provided)
	 * <li>{@link APP_TYPE}
	 * <li>{@link ORIGIN}
	 * <li>{@link AVAILABLE}
	 * <li>{@link DEPENDENCY} (Optional, set to "NA" if not provided)
	 * <li>{@link CONFIG} (Optional, set to "NA" if not provided)
	 * <li>{@link URL} (Optional, set to "NA" if not provided)
	 * </ul>
	 * 
	 * When an application inserts a service, GLOBAL_ID will be
	 * set to "Pending" by {@link SocialProvider}. This has to be changed
	 * by a SyncAdapter upon next successful synchronization. A valid
	 * GLOBAL_ID has to be written back.
	 * 
	 * SyncAdapters can also insert services. SyncAdapters have to
	 * set the following parameters in the query in order to insert successfully:
	 * <ul>
	 * <li>{@link GLOBAL_ID}
	 * <li>{@link NAME}
	 * <li>{@link OWNER_ID}
	 * <li>{@link TYPE}
	 * <li>{@link DESCRIPTION} (optional, set to "NA" if not provided)
	 * <li>{@link APP_TYPE}
	 * <li>{@link ORIGIN}
	 * <li>{@link AVAILABLE}
	 * <li>{@link DEPENDENCY} (Optional, set to "NA" if not provided)
	 * <li>{@link CONFIG} (Optional, set to "NA" if not provided)
	 * <li>{@link URL} (Optional, set to "NA" if not provided)
	 * <li>{@link CREATION_DATE}
	 * <li>{@link SYNC_STATUS}
	 * </ul>
	 * 
	 * SYNC_STATUS has to be set to "updated". 
	 * 
	 * <h1>Update</h1> 
	 * Applications can update:
	 * <ul>
	 * <li>{@link NAME}
	 * <li>{@link OWNER_ID}
	 * <li>{@link DESCRIPTION}
	 * <li>{@link ORIGIN}
	 * <li>{@link AVAILABLE}
	 * <li>{@link DEPENDENCY}
	 * <li>{@link CONFIG}
	 * <li>{@link URL}
	 * </ul>
	 * 
	 * SyncAdapters can update:
	 * <ul>
	 * <li>{@link NAME}
	 * <li>{@link OWNER_ID}
	 * <li>{@link DESCRIPTION}
	 * <li>{@link ORIGIN}
	 * <li>{@link AVAILABLE}
	 * <li>{@link DEPENDENCY}
	 * <li>{@link CONFIG}
	 * <li>{@link URL}
	 * <li>{@link CREATION_DATE}
	 * <li>{@link SYNC_STATUS}
	 * </ul>
	 * 
	 * SYNC_STATUS has to be set to "updated".
	 * 
	 * <h1>Delete</h1>
	 * Applications can delete services. Only services that belong to
	 * the logged-in user can be deleted. A service can be deleted either
	 * by appending _ID to the end of the URI or via a standard query.<br />
	 * <br />
	 * SyncAdapters can delete services by either appending _ID to the
	 * end of the query URI or using a standard selection.
	 * 
	 * <h1>Query</h1>
	 * Applications and SyncAdapters can query for services using standard
	 * query URI or using _ID as the last part of the URI.
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    
    public static final class Services {
        /**
         * Use this Uri to search in the content provider.
         */
        public static final Uri CONTENT_URI = 
                Uri.parse(AUTHORITY_STRING+ UriPathIndex.SERVICES);
        /**
         * Key local ID used by content provider. Index to the
         *  table holding service info.
         */
        public static final String _ID = "_id";
        /**
         *  Global ID for the service. E.g. packagename+appname in Android.
         */
        public static final String GLOBAL_ID = "global_id";
        /**
		 *  User/provided name of the service, e.g. "iDisaster" or "iJacket".
		 */
		public static final String NAME = "name";
		/**
		 * Global ID of the person who owns this service. This can be your own
		 * Global ID if you own the service, or someone else's global ID if 
		 * you find a service e.g. on a market place.
		 */
		public static final String OWNER_ID = "owner_id";
		/**
         *  The type of the service being stored. This is a user-provided
         *  name, which can be the name given by the client application.
         *  E.g. iDisaster and other crisis management applications can
         *  assign TYPE to be "disaster".
         */
        public static final String TYPE = "type";
        /**
		 * A user-provided description of the service.
		 */
		public static final String DESCRIPTION = "description";
		/**
         *  This is a parameter that can be used to define the technical
         *  type of the service. It can for instance be set to "android_application"
         *  or "virgo_service" etc.
         */
        public static final String APP_TYPE = "type";
        /**
         * Where this service comes from, e.g. Android Market.
         */
        public static final String ORIGIN = "origin";
        /**
		 * Tells whether this service is available on this device.
		 * E.g. if the service is available through an app installed on an 
		 * Android device then this parameter is set to "1". If this is a 
		 * cloud service accessible through e.g. a REST API this parameter
		 *  is set to "1". If this is an app that is not yet installed or it 
		 *  is a cloud service that is not available through a URI it is
		 *  set to "0".
		 * 
		 * Value needs to be set and kept updated by clients.
		 */
		public static final String AVAILABLE = "available";
		/**
		 * A field telling whether this service depends on another 
		 * service to function. The value is the global ID of the
		 * other service or null.
		 */
		public static final String DEPENDENCY = "dependency";
		/**
		 * String that contains the intent to be used to launch the service
		 * using Androdi intent mechanism.
		 */
		public static final String CONFIG = "config";
		/**
		 * A URL to the code to be downloaded or to a web service interface.
		 * This can for instance be a link to an Android App.
		 */
		public static final String URL = "url";
		/**
         * The date this record was created by its origin.
         */
        public static final String CREATION_DATE = "creation_date";
        
        /**
         * The date this record was last modified. Used by sync adapters.
         */
        public static final String LAST_MODIFIED_DATE = "last_modified_date";

        /**
         * Field used by sync adapters when synchronizing with cloud 
         * services. Its value can be "dirty", "clean", "new", "deleted".
         */
        public static final String SYNC_STATUS = "sync_status";
    }
    
    /**
     * <h1>Class Relationship</h1>
     * Class that provides information about relationships among
     * two people.<br /><br />
     *  If you want to know who is friends with whom or
     * who is following whom etc. use this.
     * 
 	 * <h1>Insert</h1> 
	 * Applications can insert relationships by providing the following:
	 * <ul>
	 * <li>{@link GLOBAL_ID_P1}
	 * <li>{@link GLOBAL_ID_P2}
	 * <li>{@link TYPE}
	 * <li>{@link ORIGIN}
	 * </ul>
	 * 
	 * GLOBAL_ID_P1 and GLOBAL_ID_P2 have to exist among the user's People.<br/>
	 * 
	 * ORIGIN refers to the social service, e.g. "Facebook", and is used
	 * by SyncAdapters. ORIGIN can also be "private" which means it is
	 * stored only locally.<br/>
	 * 
	 * After a relationship is created by an application, its GLOBAL_ID
	 * is set to "pending" until a sync is performed.<br/>
	 * 
	 * SyncAdapters might also insert a relationship. GLOBAL_ID_P1 and 
	 * GLOBAL_ID_P2 have to exist among the user's People. The following
	 * should be set when a SyncAdapter inserts relationships:
	 * 
	 * <ul>
	 * <li>{@link GLOBAL_ID}
	 * <li>{@link GLOBAL_ID_P1}
	 * <li>{@link GLOBAL_ID_P2}
	 * <li>{@link TYPE}
	 * <li>{@link ORIGIN}
	 * </ul>
	 * 
	 * 
 	 * <h1>Update</h1>
 	 * Nothing can be updated for a relationship.
 	 * 
 	 * <h1>Query</h1>
 	 * 
 	 * All relationships fields can be used for querying.
 	 * 
 	 * <h1>Delete</h1>
 	 * An application can delete a relationship. The relationship will then
 	 * be labeled deleted but will not be removed until next sync. Relationships
 	 * with ORIGIN as "private" will be removed immediately.<br/>
 	 * 
 	 * SyncAdapters should delete relationships marked for deletion. They
 	 * should also delete relationships that are deleted by the
 	 * service. In this case the relationship's GLOBAL_ID will be set
 	 * to "pending" and its origin will be set to "private".
 	 *  
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class Relationship {
        public static final Uri CONTENT_URI = 
                Uri.parse(AUTHORITY_STRING + UriPathIndex.RELATIONSHIP);

        /**
         * Key local ID. Needed for using cursors in Android. Note that _id is
         * unique only locally on this device.
         */
        public static final String _ID = "_id"; 
        /**
         * Global ID for the relationship.
         */
        public static final String GLOBAL_ID = "global_id";
        /**
         * Global ID for the first person in the relationship.
         */
        public static final String GLOBAL_ID_P1 = "global_id_p1";
        /**
         * Global ID for the second person in the relationship.
         */
        public static final String GLOBAL_ID_P2 = "global_id_p2";
        /**
         * Type of the relationship. Can be e.g. friend, follower.
         */
        public static final String TYPE = "type"; 
        /**
         *  The original service where the relationship is defined.
         *  E.g. Facebook, SOCIETIES
         */
        public static final String ORIGIN = "origin";
    }
    /**
     * <br />Constants and helpers for operating on memberships in
     * communities.<br />
	 * <br />
	 * This is the URI you will use for accessing information about who is
	 * member in which community. Every membership which is accessible from 
	 * this user's {@link SocialProvider} has an entry in this table. 
	 * You can find information about both of the following:
	 * <ul>
	 * <li>Which communities a user is a member of.</li>
	 * <li>Which members a community has.</li>
	 * <li>Which types of membership a user has in a community.</li>
	 * </ul>
	 * 
	 * You might have different levels of information for the different
	 * memberships based on your access rights to services that provide 
	 * this information.
	 * 
	 * <h1>Insert</h1> 
	 * Applications can insert memberships. Applications will have to provide the following
	 * parameters when inserting memberships:
	 * <ul>
	 * <li>{@link GLOBAL_ID_MEMBER}
	 * <li>{@link GLOBAL_ID_COMMUNITY}
	 * <li>{@link TYPE}
	 * <li>{@link ORIGIN}
	 * </ul>
	 * 
	 * The membership will be created only if the member is among user's People and
	 * only when the communiy is among user's Communities. A pending community
	 * cannot accept membership. GLOBAL_ID of the membership is set to "pending" 
	 * until the next sync. ORIGIN is used by SyncAdapters to recognize the 
	 * relationship during the next sync.<br/>
	 * <br/>
	 * SyncAdapters can also insert memberships. SyncAdapters have to
	 * set the following parameters in the query in order to insert successfully:
	 * <ul>
	 * <li>{@link GLOBAL_ID}
	 * <li>{@link GLOBAL_ID_MEMBER}
	 * <li>{@link GLOBAL_ID_COMMUNITY}
	 * <li>{@link TYPE}
	 * <li>{@link ORIGIN}
	 * </ul>
	 * The membership will be inserted only if GLOBAL_ID_MEMBER is an ID of the 
	 * current user, or the user owns or is a member of GLOBAL_ID_COMMUNITY.
	 * 
	 * Memberships cannot exist privately, i.e. ORIGIN cannot be "private".
	 * 
	 * <h1>Update</h1> 
	 * Applications can update:
	 * <ul>
	 * <li>{@link TYPE}
	 * </ul>
	 * 
	 * SyncAdapters can update:
	 * <ul>
	 * <li>{@link TYPE}
	 * </ul>
	 * 
	 * 
	 * <h1>Delete</h1>
	 * Applications can delete memberships. A user (and his/her logged in 
	 * application) can delete the following memberships:
	 * <ul>
	 * <li>Memberships that involve the user.</li>
	 * <li>Memberships that involve communities where the user is owner.</li> 
	 * </ul>
	 * 
	 * <br />
	 * SyncAdapters can delete any membership.
	 * 
	 * <h1>Query</h1>
	 * Applications and SyncAdapters can query for memberships using standard
	 * query URI or using _ID as the last part of the URI.
     * 
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class Membership {
        public static final Uri CONTENT_URI = 
                Uri.parse(AUTHORITY_STRING + UriPathIndex.MEMBERSHIP);

        /**
         * Key local ID for this membership. Needed for using 
         * content providers in Android. Note that _id is
         * unique only locally on this device.
         */
        public static final String _ID = "_id"; 
        /**
         * Global ID for the membership.
         */
        public static final String GLOBAL_ID = "global_id";
        /**
         * Global ID for the member.
         */
        public static final String GLOBAL_ID_MEMBER = "global_id_member";
        /**
         * Global ID for the community.
         */
        public static final String GLOBAL_ID_COMMUNITY = "global_id_community";
        /**
         * Type of the membership. Application-defined. Can be used as
         * e.g. role in the community.
         */
        public static final String TYPE = "type"; 
        /**
         *  The original service where the membership is defined.
         *  E.g. Facebook, SOCIETIES
         */
        public static final String ORIGIN = "origin";
    }
    
    /**
     * Class that provides information about what services people have 
     * shared in different communities.
     * 
     * TODO: similar to membership.
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class Sharing {
        public static final Uri CONTENT_URI = 
                Uri.parse(AUTHORITY_STRING + UriPathIndex.SHARING);

        /**
         * Key local ID for this sharing. Needed for using 
         * content providers in Android. Note that _id is
         * unique only locally on this device.
         */
        public static final String _ID = "_id"; 
        /**
         * Global ID for the sharing.
         */
        public static final String GLOBAL_ID = "global_id";
        /**
         * Global ID for the service.
         */
        public static final String GLOBAL_ID_SERVICE = "global_id_service";
        /**
         * Global ID for the sharing.
         */
        public static final String OWNER_GLOBAL_ID = "owner_global_id";
        /**
         * Global ID for the community.
         */
        public static final String GLOBAL_ID_COMMUNITY = "global_id_community";
        /**
         * Global ID for the community.
         */
        public static final String GLOBAL_ID_PERSON = "global_id_person";
        /**
         * Type of the sharing. Application-defined.
         */
        public static final String TYPE = "type"; 
        /**
         *  The original service where the sharing is defined.
         *  E.g. Facebook, SOCIETIES
         */
        public static final String ORIGIN = "origin";
    }
    
    /**
     * Represents a table containing all the activities that are 
     * added to the activity feeds for people. You can search 
     * the table using a specific user's global ID as feed owner 
     * ID.
     * <h1>Insert</h1> 
	 * Applications can insert activities. Applications will have to provide the following
	 * parameters when inserting activities:
	 * <ul>
	 * <li>{@link GLOBAL_ID_FEED_OWNER}
	 * <li>{@link GLOBAL_ID_ACTOR}
	 * <li>{@link GLOBAL_ID_OBJECT}
	 * <li>{@link GLOBAL_ID_VERB}
	 * <li>{@link GLOBAL_ID_TARGET}
	 * <li>{@link ORIGIN}
	 * </ul>
	 * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class PeopleActivity{
	    public static final Uri CONTENT_URI = 
	            Uri.parse(AUTHORITY_STRING + UriPathIndex.PEOPLE_ACTIVITIY);
        /**
         * Key local ID for the activity. Needed for using 
         * content providers in Android. Note that _id is
         * unique only locally on this device.
         * 
         * Note: CREATION_DATE, and SYNC_STATUS are set by SocialProvider.
         */
        public static final String _ID = "_id"; 
        /**
         * Global ID for the activity.
         */
        public static final String GLOBAL_ID = "global_id";
        /**
         * Global ID for the owner of the feed where the
         * activity is added. Has to identify a record in
         * People.
         */
        public static final String GLOBAL_ID_FEED_OWNER = "global_id_feed_owner";
        /**
         * Global ID for the Actor of the activity.
         */
        public static final String GLOBAL_ID_ACTOR = "global_id_ACTOR";
        /**
         * Global ID for the object of the activity.
         */
        public static final String GLOBAL_ID_OBJECT = "global_id_object";
        /**
         * Global ID for the verb of the activity.
         */
        public static final String GLOBAL_ID_VERB = "global_id_verb";
        /**
         * Global ID for the target of the activity.
         */
        public static final String GLOBAL_ID_TARGET = "global_id_target";
        /**
         *  The original service where the activity was created.
         *  E.g. Facebook, SOCIETIES
         */
        public static final String ORIGIN = "origin";	
        /**
         * The date this activity was created.
         */
        public static final String CREATION_DATE = "creation_date";

        /**
         * Field used by sync adapters when synchronizing with cloud 
         * services.
         */
        public static final String SYNC_STATUS = "sync_status";
        

    	
    }
    /**
     * Represents a table containing all the activities that are 
     * added to the activity feeds for communities. You can search 
     * the table using a specific community's global ID as feed owner 
     * ID.
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class CommunityActivity{
	    public static final Uri CONTENT_URI = 
	            Uri.parse(AUTHORITY_STRING + UriPathIndex.COMMUNITY_ACTIVITIY);
        /**
         * Key local ID for the activity. Needed for using 
         * content providers in Android. Note that _id is
         * unique only locally on this device.
         * 
         * Note: CREATION_DATE, and SYNC_STATUS are set by SocialProvider.
         */
        public static final String _ID = "_id"; 
        /**
         * Global ID for the activity.
         */
        public static final String GLOBAL_ID = "global_id";
        /**
         * Global ID for the owner community of the feed where the
         * activity is added.
         */
        public static final String GLOBAL_ID_FEED_OWNER = "global_id_feed_owner";
        /**
         * Global ID for the Actor of the activity.
         */
        public static final String GLOBAL_ID_ACTOR = "global_id_ACTOR";
        /**
         * Global ID for the object of the activity.
         */
        public static final String GLOBAL_ID_OBJECT = "global_id_object";
        /**
         * Global ID for the verb of the activity.
         */
        public static final String GLOBAL_ID_VERB = "global_id_verb";
        /**
         * Global ID for the target of the activity.
         */
        public static final String GLOBAL_ID_TARGET = "global_id_target";
        /**
         *  The original service where the activity was created.
         *  E.g. Facebook, SOCIETIES
         */
        public static final String ORIGIN = "origin";	
        /**
         * The date this activity was created.
         */
        public static final String CREATION_DATE = "creation_date";

        /**
         * Field used by sync adapters when synchronizing with cloud 
         * services.
         */
        public static final String SYNC_STATUS = "sync_status";
    }
    /**
     * Represents a table containing all the activities that are 
     * added to the activity feeds for services. You can search 
     * the table using a specific service's global ID as feed owner 
     * ID.
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class ServiceActivity{
	    public static final Uri CONTENT_URI = 
	            Uri.parse(AUTHORITY_STRING + UriPathIndex.SERVICE_ACTIVITY);
        /**
         * Key local ID for the activity. Needed for using 
         * content providers in Android. Note that _id is
         * unique only locally on this device.
         * 
         * Note: CREATION_DATE, and SYNC_STATUS are set by SocialProvider.
         */
        public static final String _ID = "_id"; 
        /**
         * Global ID for the activity.
         */
        public static final String GLOBAL_ID = "global_id";
        /**
         * Global ID for the owner service of the feed where the
         * activity is added.
         */
        public static final String GLOBAL_ID_FEED_OWNER = "global_id_feed_owner";
        /**
         * Global ID for the Actor of the activity.
         */
        public static final String GLOBAL_ID_ACTOR = "global_id_ACTOR";
        /**
         * Global ID for the object of the activity.
         */
        public static final String GLOBAL_ID_OBJECT = "global_id_object";
        /**
         * Global ID for the verb of the activity.
         */
        public static final String GLOBAL_ID_VERB = "global_id_verb";
        /**
         * Global ID for the target of the activity.
         */
        public static final String GLOBAL_ID_TARGET = "global_id_target";
        /**
         *  The original service where the activity was created.
         *  E.g. Facebook, SOCIETIES
         */
        public static final String ORIGIN = "origin";	
        /**
         * The date this activity was created.
         */
        public static final String CREATION_DATE = "creation_date";

        /**
         * Field used by sync adapters when synchronizing with cloud 
         * services.
         */
        public static final String SYNC_STATUS = "sync_status";
    }

    /**
	 * Class that provides information about the owner of 
	 * the current device. This is mainly information that will
	 * be extracted from CSS Manager Light. Note that you can have 
	 * as many CSS IDs as you wish.
	 * 
	 * <h1>Class overview</h1> 
	 * Constants and helpers for operating on own identities and profiles.<br />
	 * <br />
	 * This is the URI you will use for creating and managing your identity and 
	 * profile information. You can do the following:
	 * <ul>
	 * <li>Store information about various identities, user name/passwords, and profile
	 * data about yourself.</li>
	 * <li>Query this information.</li>
	 * </ul>
	 * The information here is normally not synchronized with cloud services since 
	 * it might include private information.
	 * 
	 * <h1>Insert</h1> 
	 * Applications can create new identities as records under /Me. SyncAdapters 
	 * will not be able to sync this data.<br />
	 * <br />
	 * The following parameters are needed when inserting:
	 * <ul>
	 * <li>{@link GLOBAL_ID}
	 * <li>{@link NAME}
	 * <li>{@link DISPLAY_NAME} (Optional, set to "NA" if not provided)
	 * <li>{@link USER_NAME}
	 * <li>{@link PASSWORD}
	 * <li>{@link ORIGIN}
	 * </ul>
	 *  
	 * <h1>Update</h1> 
	 * Applications can update:
	 * <ul>
	 * <li>{@link GLOBAL_ID}
	 * <li>{@link NAME}
	 * <li>{@link DISPLAY_NAME}
	 * <li>{@link USER_NAME}
	 * <li>{@link PASSWORD}
	 * <li>{@link ORIGIN}
	 * </ul>
	 * 
	 * <h1>Delete</h1>
	 * Applications can delete any record under Me.<br />
	 * <br />
	 * 
	 * <h1>Query</h1>
	 * Applications can query for identities/profiles using standard 
	 * query URI or using _ID as the last part of the URI.
	 * 
	 * @author Babak dot Farshchian at sintef dot no
	 *
	 */
	public static final class Me {
	    public static final Uri CONTENT_URI = 
	            Uri.parse(AUTHORITY_STRING + UriPathIndex.ME);
	
	    /**
	     * Key local ID. Needed for using cursors in Android. Note that _id is
	     * unique only locally on this device.
	     */
	    public static final String _ID = "_id"; 
	    /**
	     * Global ID for my identity, e.g. JID.
	     */
	    public static final String GLOBAL_ID = "global_id";
	    /**
	     * My name to be used with this CSS ID.
	     */
	    public static final String NAME = "name"; 
	    /**
	     *  My alternative name, e.g. nickname.
	     */
	    public static final String DISPLAY_NAME = "display_name";
	    /**
	     *  Login user name if different from GLOBAL_ID
	     */
	    public static final String USER_NAME = "user_name";
	    /**
	     *  Possible password to be used with user name
	     */
	    public static final String PASSWORD = "password";
	    
	    /**
	     * Name of the service this ID was created at. E.g. it might be 
	     * a Facebook ID or a SOCIETIES ID. 
	     */
	    public static final String ORIGIN = "origin";
	}

	
	/**
	 * A utility class defining constants for UriMatcher in the 
	 * content provider and for using in case/switch sentences.
	 * @author Babak dot Farshchian at sintef dot no
	 *
	 */
	public static final class UriMatcherIndex{
		public static final int ME = 1;
		public static final int ME_SHARP = 2;
		public static final int PEOPLE = 3;
		public static final int PEOPLE_SHARP = 4;
		public static final int COMMUNITIES = 5;
		public static final int COMMUNITIES_SHARP = 6;
		public static final int SERVICES = 7;
		public static final int SERVICES_SHARP = 8;
		public static final int RELATIONSHIP = 9;
		public static final int RELATIONSHIP_SHARP = 10;
		public static final int MEMBERSHIP = 11;
		public static final int MEMBERSHIP_SHARP = 12;
		public static final int SHARING = 13;
		public static final int SHARING_SHARP = 14;
		public static final int PEOPLE_ACTIVITY = 15;
		public static final int PEOPLE_ACTIVITY_SHARP = 16;
		public static final int COMMUNITY_ACTIVITIY = 17;
		public static final int COMMUNITY_ACTIVITIY_SHARP = 18;
		public static final int SERVICE_ACTIVITY = 19;
		public static final int SERVICE_ACTIVITY_SHARP = 20;

	}
	
	/**
     * Class that defines a pointer (record) to a CIS that I own or am member of.
     * The CIS itself can be retrieved from Community using GLOBAL_ID that
     * you get here. MyCommunity gives you a list of CIS records that you
     * are a member of. You can use this list to look up the actual CIS in 
     * Community. 
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    @Deprecated
    public static final class MyCommunity {
        public static final Uri CONTENT_URI = 
                    Uri.parse(AUTHORITY_STRING +"/me/communities");
        public static final String _ID = "_id"; //Key local ID
        public static final String GLOBAL_ID = "global_id"; //Global ID for the community, e.g. JID
        public static final String OWNER_ID = "owner"; //Person who owns the community
      //  public static final String DISPLAY_NAME = "display_name"; //Name of the community to be shown to the user
    }
    /**
     * Class that stores metadata about CISs, both those I am
     * a member of and those I am not a member of. Use MyCommunity
     * to find out which CISs you are a member of, then look the CIS
     * up in this table.
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    
    @Deprecated
    public static final class Community {
        public static final Uri CONTENT_URI = 
                    Uri.parse(AUTHORITY_STRING+"/communities");
        public static final String _ID = "_id"; //Key local ID
        public static final String GLOBAL_ID = "global_id"; //Global ID for the community, e.g. JID
        public static final String TYPE = "type"; //The type of the community being stored. E.g. "disaster".
        										//The type will be defined and used by applications.
        public static final String NAME = "name"; //Name of the community
    //    public static final String DISPLAY_NAME = "display_name"; //Name of the community to be shown to the user
        public static final String OWNER_ID = "owner"; //Person who owns the community
    //    public static final String CREATION_DATE = "creation_date";	
     //   public static final String MEMBERSHIP_TYPE = "membership_type"; //TODO: need to decide types.
        public static final String DIRTY = "dirty"; //Used to indicate whether this community's data is changed locally.
    }

    /**
     * Class that defines constants related to CSSs:
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    @Deprecated
    public static final class Person {
        public static final Uri CONTENT_URI = 
                    Uri.parse(AUTHORITY_STRING+"/people");
        public static final String _ID = "_id"; //Key local ID
        public static final String GLOBAL_ID = "global_id"; //Global ID for the person, e.g. JID
//        public static final String TYPE = "type"; //The type of the element being stored. CSS for people
        public static final String NAME = "name"; //Name of the person
        public static final String EMAIL = "email"; //Owner CSS jid of the group
        public static final String DISPLAY_NAME = "display_name";
        public static final String CREATION_DATE = "creation_date";
    }
    
    /**
     * Class that defines constants for services that can be shared
     * in communities.
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    @Deprecated
    public static final class Service {
        public static final Uri CONTENT_URI = 
                Uri.parse(AUTHORITY_STRING+"/services");
        public static final String _ID = "_id"; //Key local ID
        public static final String GLOBAL_ID = "global_id"; //Global ID for the service. E.g. URL in an app store.
        public static final String TYPE = "type"; //The type of the service being stored.
        public static final String NAME = "name"; //Name of the service
        public static final String DISPLAY_NAME = "display_name";
        public static final String CREATION_DATE = "creation_date";		
    }
    /**
     * Class that defines constants for memberships in communities
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    @Deprecated
    public static final class MembershipRecord {
        public static final String _ID = "_id"; //Key local ID
        public static final String COMMUNITY_ID = "community_id"; //Key local ID for involved community
        public static final String PERSON_ID = "person_id"; //Key local ID for involved person
        public static final String ROLE = "role"; //The role the person plays in the community
    }
//TODO: Add service sharing records
    
    
}
