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

import java.net.URL;

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
 * @author BabakFarshchian
 *
 */
public final class SocialContract {

	/**
	 * The URI for identifying the content provider.<br />
	 * <br />
	 */
	public static final String AUTHORITY_STRING = "content://org.societies.android.SocialProvider/";
	
    /**
     * The main authority, i.e. the base URI for all operations:
     */
    public static final Uri AUTHORITY = 
            Uri.parse("content://org.societies.android.SocialProvider");
    
    /**
     * A special account type used for fields that are not
     * supposed to be synchronized with a remote service.
     * See also {@link SynchColumns}. You can use this if 
     * you want to use the content provider for storing 
     * local data.
     * 
     * @deprecated Use {@link SupportedAccountTypes.LOCAL}.
     * 
     */
    @Deprecated
    public static final String ACCOUNT_TYPE_LOCAL = "LOCAL";
    
    
    /**
     * When you add a new row to the content provider, its 
     * GLOBAL_ID can be set to GLOBAL_ID_PENDING. This 
     * means that the row is not yet synchronized with a remote
     * service. 
     * <br /><br />
     * If the row is synch-able the GLOBAL_ID has to be replaced
     * with a proper global ID upon a successful first sync.
     * If the row is private, the global ID will always 
     * be pending, i.e. it should not be used. This is the
     * case where ACCOUNT_TYPE is set to ACCOUNT_TYPE_LOCAL. 
     */
    public static final String GLOBAL_ID_PENDING = "PENDING";
    
    /**
     * A constant that is used to set the value for the optional
     * fields in case the user does not set them.
     */
    public static final String VALUE_NOT_DEFINED = "UNKNOWN";
    
    /**
     * Default date when setting default values in the DB. It is set
     * to the now.
     */
    public static final String DEFAULT_NOW_DATE = "(strftime('%s','now'))";
    
    /**
     * An optional insert, update or delete URI parameter that 
     * allows the caller to specify that it is a sync adapter.
     * <br />
     * <br />
     * The default value is false. 
     * <br /><br />
     * If set to true, the caller must also include 
     * ACCOUNT_NAME and ACCOUNT_TYPE as query parameters.
     * <br /><br />
     * This parameter is of interest only for synch adapter 
     * developers. See https://github.com/UbiCollab/UbiShare/issues/19.
     * 
     */
    public static final String CALLER_IS_SYNCADAPTER = "caller_is_syncadapter";
        
    /**
     * Constant used to define read permission for SocialProvider data:
     */
    public static final String PROVIDER_READ_PERMISSION = "org.societies.android.SocialProvider.READ";
    /**
     * Constant used to define write permission for SocialProvider data:
     */
    public static final String PROVIDER_WRITE_PERMISSION = "org.societies.android.SocialProvider.WRITE";
    
    
    /**
     * An internal utility class defining constants for the different 
	 * paths that are supported by the SocialProvider.<br />
	 * <br />
	 * 
	 * @author Babak Farshchian
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
	 * entry in this table. You can search for people using id, 
	 * name etc.
	 * <br /><br />
	 * You can find information about both of the following:
	 * <ul>
	 * <li>People you have a relationship to. This means both of you use 
	 * some common service (e.g. Facebook) and have decided to be e.g.
	 * friends or followers etc.</li>
	 * <li>People you don't have a relationship to but want to keep
	 * informed about. This might be Obama or your neighbor. The information
	 * about this type of people will not be verifiable and will probably
	 * be very inaccurate. Depending on how it is synced.</li>
	 * </ul>
	 * 
	 * @author Babak Farshchian
	 */
    public static final class People implements DBColumns, SyncColumns, BaseSyncColumns,
    RecommendationColumns{
        /**
         * The Uri to access the base table with all people.
         */
        public static final Uri CONTENT_URI = 
                    Uri.parse(AUTHORITY_STRING+ UriPathIndex.PEOPLE);
       /**
         * Name of the person. E.g. John Doe.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String NAME = "name";
        /**
		 * A description of the person. E.g. Rescuer.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         * </ul>
		 */
		public static final String DESCRIPTION = "description";
		
        /**
		 * The user name that is used to identify this person at the
		 * service in the back-end. E.g. if the account type of this 
		 * record is Box, then USER_NAME will be the email address 
		 * that identifies this person at Box.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         * </ul>
		 */
		public static final String USER_NAME = "user_name";
		/**
         * Email address of the person.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String EMAIL = "email";
        public static final String EMAIL2 = "email2";
        public static final String EMAIL3 = "email3";

		/**
         * Phone number for the person.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String PHONE = "phone";
        public static final String PHONE2 = "phone2";
        public static final String PHONE3 = "phone3";
		/**
         * Physical address of the person.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String ADDRESS = "address";

        @Deprecated
		public static final String ORIGIN = "origin";

        @Deprecated
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
     * @author Babak Farshchian
     *
     */
    public static final class Communities implements DBColumns, SyncColumns, BaseSyncColumns,
    RecommendationColumns {
        /**
         * The Uri to access the base table with all communities. 
         */
        public static final Uri CONTENT_URI = 
                    Uri.parse(AUTHORITY_STRING+ UriPathIndex.COMMUNITIES);
        /**
         * Name of the community.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
		public static final String NAME = "name";

		@Deprecated
		public static final String OWNER_ID = "owner_id";
		/**
		 * _ID of the person who owns this community. Is used as foreign
		 * key to look up a row in the People table.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String _ID_OWNER = "_id_owner";
		/**
         *  The type of the community being stored. E.g. "disaster".
         *  The type will be defined and used by applications.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String TYPE = "type";
        /**
		 * A user-provided description of the community.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String DESCRIPTION = "description";

		@Deprecated
        public static final String ORIGIN = "origin";

        @Deprecated
        public static final String SYNC_STATUS = "sync_status";
        
    }
    
   /**
	 * <h1>Class overview</h1> 
	 * Constants and helpers for operating on services.<br />
	 * <br />
	 * This is the URI you will use for accessing information about services.
	 * Every service which is accessible from SocialProvider has an
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
     * @author Babak Farshchian
     *
     */
    
    public static final class Services implements DBColumns, SyncColumns, BaseSyncColumns,
    RecommendationColumns{
        /**
         * Use this Uri to search in the content provider.
         */
        public static final Uri CONTENT_URI = 
                Uri.parse(AUTHORITY_STRING+ UriPathIndex.SERVICES);
        /**
		 *  User/provided name of the service, e.g. "iDisaster" or "iJacket".
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String NAME = "name";

		@Deprecated
		public static final String OWNER_ID = "owner_id";
		/**
		 * _ID of the person who owns this service. This can be your own
		 * _ID if you own the service, or someone else's _ID if 
		 * you find a service e.g. on a market place.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String _ID_OWNER = "_id_owner";
		/**
         *  The type of the service being stored. This is an application-defined
         *  string, which can be the name given by the client application.
         *  E.g. iDisaster and other crisis management applications can
         *  assign TYPE to be "disaster".
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String TYPE = "type";
        /**
		 * A user-provided description of the service.
         *  <br />
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String DESCRIPTION = "description";
		/**
         *  This is a parameter that can be used to define the technical
         *  type of the service. It can for instance be set to "android_application"
         *  or "virgo_service" etc.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String APP_TYPE = "app_type";
        @Deprecated
        public static final String ORIGIN = "origin";
        /**
		 * Tells whether this service is available on this device.
		 * E.g. if the service is available through an app installed on this 
		 * Android device then this parameter is set to "1". If this is a 
		 * cloud service accessible through e.g. a REST API this parameter
		 *  is set to "1". If this is an app that is not yet installed or it 
		 *  is a cloud service that is not available through a URI it is
		 *  set to "0".
		 * 
		 * Value needs to be set and kept updated by applications.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: 0.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String AVAILABLE = "available";
		/**
		 * A field telling whether this service depends on another 
		 * service to function. The value is the global ID of the
		 * other service or {@link #VALUE_NOT_DEFINED} if no dependencies.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String DEPENDENCY = "dependency";
		/**
		 * String that contains the intent to be used to launch the service
		 * using Android intent mechanism. It can also be used for other
		 * purposes if the service is not represented as an Android app.
		 * E.g. it can be parameters to be passed in a REST call. This is
		 * defined by the applications.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String CONFIG = "config";
		/**
		 * A URL to the code to be downloaded or to a web service interface.
		 * This can for instance be a link to an Android App in an app store.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String URL = "url";

        @Deprecated
        public static final String SYNC_STATUS = "sync_status";
    }
    
    /**
     * <h1>Class Relationship</h1>
     * Class that provides information about relationships among
     * two records from People.<br /><br />
     *  If you want to know who is friends with whom or
     * who is following whom etc. use this.
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class Relationship implements DBColumns, SyncColumns, BaseSyncColumns{
        public static final Uri CONTENT_URI = 
                Uri.parse(AUTHORITY_STRING + UriPathIndex.RELATIONSHIP);

        @Deprecated
        public static final String GLOBAL_ID_P1 = "global_id_p1";
        /**
         * _ID for the first person in the relationship. This is a
         * foreign key point to _ID in People table.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String _ID_P1 = "_id_p1";
        @Deprecated
        public static final String GLOBAL_ID_P2 = "global_id_p2";
        /**
         * _ID for the second person in the relationship. This is a
         * foreign key point to _ID in People table.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String _ID_P2 = "_id_p2";
        /**
         * Type of the relationship. Can be e.g. friend, follower.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String TYPE = "type"; 
        
        /**
         * Application-provided description for this record.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String DESCRIPTION = "description"; 

        @Deprecated
        public static final String ORIGIN = "origin";
    }
    /**
     * <h1>Class Membership</h1>
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
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class Membership implements DBColumns, SyncColumns, BaseSyncColumns{
        public static final Uri CONTENT_URI = 
                Uri.parse(AUTHORITY_STRING + UriPathIndex.MEMBERSHIP);

        @Deprecated
        public static final String GLOBAL_ID_MEMBER = "global_id_member";
        /**
         * _ID for the member. Can be looked up in People table.
         * 
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String _ID_MEMBER = "_id_member";
        @Deprecated
        public static final String GLOBAL_ID_COMMUNITY = "global_id_community";
        
        /**
         * _ID for the community. Can be looked up in Communities table.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         * 
         */
        public static final String _ID_COMMUNITY = "_id_community";
        /**
         * Type of the membership. Application-defined. Can be used as
         * e.g. role in the community.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String TYPE = "type"; 
        /**
         * Application-provided description for this record.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String DESCRIPTION = "description"; 

        @Deprecated
        public static final String ORIGIN = "origin";
    }
    
    /**
     * <h1>Class Sharing</h1>
     * <br />Constants and helpers for operating on sharing of services in
     * communities.<br />
	 * <br />
	 * This is the URI you will use for accessing information about what is
	 * shared in which community. Every sharing which is accessible from 
	 * this user's SocialProvider has an entry in this table. 
	 * You can find information about both of the following:
	 * <ul>
	 * <li>What is shared by this user in which community.</li>
	 * <li>What is shared by other users in which community.</li>
	 * </ul>
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class Sharing implements DBColumns, SyncColumns, BaseSyncColumns{
        public static final Uri CONTENT_URI = 
                Uri.parse(AUTHORITY_STRING + UriPathIndex.SHARING);

        /**
         * Use _ID_SERVICE instead.
         *  <br />
         *  <br />
         * Type: TEXT
         */
        @Deprecated
        public static final String GLOBAL_ID_SERVICE = "global_id_service";
        /**
         * _ID for the service.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String _ID_SERVICE = "_id_service";
        /**
         * Use _ID_OWNER instead.
          *  <br />
         *  <br />
         * Type: TEXT
        */
        @Deprecated
        public static final String GLOBAL_ID_OWNER = "global_id_owner";
        /**
         * _ID for the owner. Can be looked up in People table.
          *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
        */
        public static final String _ID_OWNER = "_id_owner";
        /**
         * Use ID_COMMUNITY instead.
          *  <br />
         *  <br />
         * Type: TEXT
        */
        @Deprecated
        public static final String GLOBAL_ID_COMMUNITY = "global_id_community";
        /**
         * _ID for the community.
          *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
        */
        public static final String _ID_COMMUNITY = "_id_community";
        /**
         * Type of the sharing. Application-defined.
          *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
        */
        public static final String TYPE = "type"; 
        /**
         * Application-provided description for this record.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String DESCRIPTION = "description"; 

        @Deprecated
        public static final String ORIGIN = "origin";
    }
    
    /**
     * <h1>Class PeopleActivity</h1>
     * Represents a table containing all the activities that are 
     * added to the activity feeds for people. You can search 
     * the table using a specific user's global ID as feed owner 
     * ID.
	 * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class PeopleActivity implements DBColumns, SyncColumns, BaseSyncColumns,
    RecommendationColumns{
	    public static final Uri CONTENT_URI = 
	            Uri.parse(AUTHORITY_STRING + UriPathIndex.PEOPLE_ACTIVITIY);
        /**
         * Use _ID_FEED_OWNER instead.
         *  <br />
         *  <br />
         * Type: TEXT
         */
        @Deprecated
        public static final String GLOBAL_ID_FEED_OWNER = "global_id_feed_owner";
        /**
         * _ID for the owner of the feed where the
         * activity is added. Identifies a record in
         * People table.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String _ID_FEED_OWNER = "_id_feed_owner";
        /**
         * Actor of the activity. This can be the global ID of the
         * person or service or community that created this activity.
         * Application-defined.
         * <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String ACTOR = "actor";
        /**
         * Object of the activity. Application-defined.
         * <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String OBJECT = "object";
        /**
         * Verb of the activity. Application-defined.
         * <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String VERB = "verb";
        /**
         * Target of the activity. Application-defined.
         * <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String TARGET = "target";
        @Deprecated
        public static final String ORIGIN = "origin";	

        @Deprecated
        public static final String SYNC_STATUS = "sync_status";
        

    	
    }
    /**
     * <h1>Class CommunityActivity</h1>
     * Represents a table containing all the activities that are 
     * added to the activity feeds for communities. You can search 
     * the table using a specific community's global ID as feed owner 
     * ID.
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class CommunityActivity implements DBColumns, SyncColumns, BaseSyncColumns,
    RecommendationColumns{
	    public static final Uri CONTENT_URI = 
	            Uri.parse(AUTHORITY_STRING + UriPathIndex.COMMUNITY_ACTIVITIY);
        /**
         * Global ID for the owner community of the feed where the
         * activity is added.
         * 
         * @deprecated 
         * 
         * Use _ID_FEED_OWNER instead and look up the 
         * global ID in the Community table.
         *  <br />
         *  <br />
         * Type: TEXT
         */
        @Deprecated
        public static final String GLOBAL_ID_FEED_OWNER = "global_id_feed_owner";
        /**
         * _ID for the owner community of the feed where the
         * activity is added. Refers to _ID in Communities
         * 
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String _ID_FEED_OWNER = "_id_feed_owner";
        /**
         * Actor of the activity. This can be the global ID of the
         * person or service or community that created this activity.
         * Application-defined.
         * <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String ACTOR = "actor";
        /**
         * Object of the activity. Application-defined.
         * <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String OBJECT = "object";
        /**
         * Verb of the activity. Application-defined.
         * <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String VERB = "verb";
        /**
         * Target of the activity. Application-defined.
         * <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String TARGET = "target";
        @Deprecated
        public static final String ORIGIN = "origin";	

        @Deprecated
        public static final String SYNC_STATUS = "sync_status";
    }
    /**
     * <h1>Class ServiceActivity</h1>
     * Represents a table containing all the activities that are 
     * added to the activity feeds for services. You can search 
     * the table using a specific service's _ID as feed owner 
     * ID.
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class ServiceActivity implements DBColumns, SyncColumns, BaseSyncColumns,
    RecommendationColumns{
	    public static final Uri CONTENT_URI = 
	            Uri.parse(AUTHORITY_STRING + UriPathIndex.SERVICE_ACTIVITY);
        /**
         * Use _ID_FEED_OWNER instead.
         *  <br />
         *  <br />
         * Type: TEXT
         */
        @Deprecated
        public static final String GLOBAL_ID_FEED_OWNER = "global_id_feed_owner";
        /**
         * _ID for the owner service of the feed where the
         * activity is added. Can be looked up in Services table.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String _ID_FEED_OWNER = "_id_feed_owner";
        /**
         * Actor of the activity. This can be the global ID of the
         * person or service or community that created this activity.
         * Application-defined.
         * <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String ACTOR = "actor";
        /**
         * Object of the activity. Application-defined.
         * <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String OBJECT = "object";
        /**
         * Verb of the activity. Application-defined.
         * <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String VERB = "verb";
        /**
         * Target of the activity. Application-defined.
         * <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String TARGET = "target";
        @Deprecated
        public static final String ORIGIN = "origin";	

        @Deprecated
        public static final String SYNC_STATUS = "sync_status";
    }

    /**
     * <h1>Class Me</h1>
	 * Class that provides information about the owner of 
	 * the current device and the accounts the user has
	 * set up with various synchronization services. There
	 * will be one record for each account. Line 0 in this
	 * table is a default local account that is created upon
	 * installation.
	 * <br />
	 * <br />
	 * 
	 * @author Babak dot Farshchian at sintef dot no
	 *
	 */
	public static final class Me implements DBColumns, SyncColumns, BaseSyncColumns{
	    public static final Uri CONTENT_URI = 
	            Uri.parse(AUTHORITY_STRING + UriPathIndex.ME);
	
	    /**
	     * A foreign key to connect a row in Me to a row in the People
	     * table. E.g. if a user has registered a Box account in Me,
	     * information about the user under this Box account 
	     * should exist in the People table using _ID_PEOPLE.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul> 
	     */
	    public static final String _ID_PEOPLE = "_id_people";
	    /**
	     * My name to be used with this ID.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
	     */
	    public static final String NAME = "name"; 
	    /**
	     *  My alternative name, e.g. nickname.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
	     */
	    public static final String DISPLAY_NAME = "display_name";
	    /**
	     *  Login user name.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
	     */
	    public static final String USER_NAME = "user_name";
	    /**
	     *  Possible password or token to be used with user name
	     *  for logging in to the service.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
	     */
	    public static final String PASSWORD = "password";

	    @Deprecated
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
	 * These columns are used by Sync Adapters to synchronize 
	 * database content. Their use needs to be consistent by
	 * apps and sync adapters.
	 * 
	 * Note: This interface is based on Android class CalendarContract.
	 * 
	 * @author Babak Farshchian
	 *
	 */
	public interface SyncColumns{
        /**
         * ID which globally identifies this record. This field should only
         * be used to control the synchronization of records with remote 
         * services. Locally you should always use _ID for referring to records.
         * GLOBAL_IDs are defined and provided by
         * remote services. GLOBAL_ID is either set by the sync adapter or 
         * by the application when creating the row. These are some scenarios
         * for setting GLOBAL_IDs:
         * <ul>
         * <li>Locally adding a row that represents a remote entity. 
         * Example: You want to add an existing Box.com user to People. In
         * this case the application should set the GLOBAL_ID to its 
         * correct value, in this case Box.com user name of the new user.
         * <li>Locally adding a new row that does not yet exist remotely. Example:
         * you want to create a new Community and you want to use Box.com as remote
         * service. In this case the application should set GLOBAL_ID to 
         * GLOBAL_ID_PENDING and use the correct ACCOUNT_TYPE and ACCOUNT_NAME,
         * in this case SupportedAccountTypes.NET_BOX and a user-provided
         * account name.
         * <li>Locally adding a new row that you want to keep local. Example:
         * You add a new row to People but you want to keep it local and
         * don't want to synchronize the information with remote services. 
         * In this case the application should set the value of GLOBAL_ID to
         * VALUE_NOT_DEFINED (the default value) and set account type to
         * SupportedAccountTypes.LOCAL.
         * <li>Remotely adding a new row. Example: A new Membership for 
         * this user is added to the Membership table by another user. In this
         * case it is the job of the sync adapter to add a local row to 
         * the right table (e.g. Membership)
         * with the right GLOBAL_ID for the service that is being shared
         * </ul>
         * 
         * 
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link GLOBAL_ID_PENDING}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String GLOBAL_ID = "global_id";
		/**
		 * The type of the account that is used to sync the record.
		 * Valid values can be found in class {@link #SupportedAccountTypes}.
		 * the value {@link #SupportedAccountTypes.LOCAL} can be used for
		 * records that are not to be synchronized with remote services.
		 * <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link ACCOUNT_TYPE_LOCAL}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String ACCOUNT_TYPE ="account_type";
		/**
		 * The name of the account that is used to sync the record.
		 * This is used in conjunction with ACCOUNT_TYPE. for each
		 * ACCOUNT_TYPE the user might have multiple local accounts
		 * with different ACCOUNT_NAMES. For instance, the user might
		 * have multiple Box.com account with different ACCOUNT_NAMEs.
		 * <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String ACCOUNT_NAME ="account_name";
		
		/**
		 * Used to tell whether the row is marked for deletion. 
		 * Set to 1 if you want to delete a row. Simply 
		 * deleting the row locally will not necessarily delete
		 * it from the remote service.
		 * <br /><br />
		 * Sync adapters should use DELETED to delete the row
		 * locally and in the remote service. If the deletion 
		 * is failed DELETE should be set to 2.
		 * <br /><br />
		 * Values:
         * <ul>
         * <li>0: The row is not marked for deletion.
         * <li>1: The row is marked for deletion locally but is not yet
         * deleted in the remote service.
         * <li>2: There was an error when deleting this row on the
         * remote service.
         * </ul>
		 * <br />
		 * <br />
		 * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: 0.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String DELETED = "deleted"; 
		/**
		* Used to indicate that local, unsynced, changes are present.
		* 1 means the row has local modifications that are not yet
		* synced with remote service. Sync adapters should use this 
		* field to find out which records are changed locally. When
		* changes are synchronized with remote service, sych adapter
		* should reset DIRTY to 0. If errors occur, synch adapter 
		* should set DIRTY to 2.
		* <br /><br />
		* When a new record is locally added to a table by an application,
		* DIRTY needs to be set to 1.
         *<br /><br />
		 * Values:
         * <ul>
         * <li>0: The row is not changed locally.
         * <li>1: The row is changed locally but is not yet
         * changed in the remote service.
         * <li>2: There was an error when synchronizing changes to the
         * remote service.
         * </ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: 0.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
		*/
		public static final String DIRTY = "dirty";
		/**
         * The date this record was created.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link DEFAULT_NOW_DATE}.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String CREATION_DATE = "creation_date";
        
        /**
         * The date this record was last modified.
         *  <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link DEFAULT_NOW_DATE}.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String LAST_MODIFIED_DATE = "last_modified_date";
	}

		/**
		 * These columns are privately used by sync adapters
		 * and should not be used by applications. Sync adapters
		 * can choose to use them in any way they want.
		 * 
		 * Note: This interface is based on Android class CalendarContract.
		 * 
		 * @author Babak Farshchian
		 *
		 */
	public interface BaseSyncColumns{
		/**
		 * Generic column for use by sync adapters.
		 * <br />
         * <ul>
         * <li>Access applications: Read.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String SYNC1 ="sync1";
		/**
		 * Generic column for use by sync adapters.
		 * <br />
         * <ul>
         * <li>Access applications: Read.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String SYNC2 ="sync2";
		/**
		 * Generic column for use by sync adapters.
		 * <br />
         * <ul>
         * <li>Access applications: Read.
         * <li>Access sync adapters: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String  SYNC3 = "sync3";
		/**
		 * Generic column for use by sync adapters.
		 * <br />
         * <ul>
         * <li>Access applications: Read.
         * <li>Access sync adapters: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String  SYNC4 = "sync4";
		/**
		 * Generic column for use by sync adapters.
		 * <br />
         * <ul>
         * <li>Access applications: Read.
         * <li>Access sync adapters: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String  SYNC5 = "sync5";
		/**
		 * Generic column for use by sync adapters.
		 * <br />
         * <ul>
         * <li>Access applications: Read.
         * <li>Access sync adapters: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String  SYNC6 = "sync6";
	}
	/**
	 * These columns can be used by services to set data 
	 * related to how they want to recommend various 
	 * data types to the user.
	 * 
	 * @author Babak Farshchian
	 *
	 */
	public interface RecommendationColumns{
		/**
		 * An integer 0-100 that gives an indication of how
		 * relevant the current row is for the user. This value
		 * can be set by a remote recommender service or 
		 * locally by an application.
		 * <br />
         * <ul>
         * <li>Access applications: Read-write.
         * <li>Access sync adapters: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String  RELEVANCE = "relevance";
	}
	
	/**
	 * Helper class for defining constants to use with services.
	 * Used by applications.
	 * 
	 * @author Babak Farshchian
	 *
	 */
	public interface DBColumns{
        /**
         * Key local ID, used by content provider to denote the location of this
         * record in the table. Row number in the table. Set by Android.
         * <br /><br />
         * _IDs are always used locally for identifying records. They don't
         * have any meaning for remote services. So they should not be
         * synchronized by sync adapters. 
         * <ul>
         * <li>Access applications: Read.
         * <li>Access sync adapters: Read.
         * <li>Default: Row number in table. Auto-increment
         * <li>Type in DB: integer.
         * </ul>
         */
        public static final String _ID = "_id";

	}
	/**
	 * This class provides a set of constant values to be used when
	 * working with services.
	 * @author Babak Farshchian
	 *
	 */
	public static final class ServiceConstants {
	    /**
	     * App that provides a service - can be shared in a Community
	     */
	    public static final String SERVICE_TYPE_PROVIDER = "Provider";

	    /**
	     * App that is a service client - cannot be shared in a Community
	     */
	    public static final String SERVICE_TYPE_CLIENT = "Client";

	    /**
	     * App that is an an extension to a SocialProvider (e.g. UI extension)
	     * - cannot be shared in a Community
	     */
	    public static final String SERVICE_TYPE_APP = "App";
	 // Constant used for services in a community
	    public static final String SERVICE_RECOMMENDED = "RECOMMENDED";
	    public static final String SERVICE_SHARED = "SHARED";
	    public static final String SERVICE_INSTALLED = "INSTALLED";
	    public static final String SERVICE_NOT_INSTALLED = "NOT_INSTALLED";

	}
}


